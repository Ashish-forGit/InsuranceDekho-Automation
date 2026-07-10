package utils;

import org.testng.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * Class Name: ConsoleProgressBarListener
 *
 * Description:
 * TestNG listener that prints a real-time progress bar in the console during test execution.
 * It tracks discovered tests, excluded tests, and execution results (PASS/FAIL/SKIP) and prints a final summary
 * when suite execution finishes. Intended for console visibility during local/CI runs and does not affect reports.
 *
 * @author Abhiram 
 */
public class ConsoleProgressBarListener implements IExecutionListener, ITestListener {

    private static final int BAR_WIDTH = 40;

    // Unique methods across contexts (handles multiple <test> blocks)
    private final Set<String> discoveredMethods = ConcurrentHashMap.newKeySet();
    private final Set<String> excludedMethods   = ConcurrentHashMap.newKeySet();

    // Result tracking (names)
    private final Set<String> passedTests = ConcurrentHashMap.newKeySet();
    private final Set<String> failedTests = ConcurrentHashMap.newKeySet();
    private final Set<String> skippedTests = ConcurrentHashMap.newKeySet();

    // Counters
    private final AtomicInteger completed = new AtomicInteger(0);
    private final AtomicInteger passed = new AtomicInteger(0);
    private final AtomicInteger failed = new AtomicInteger(0);
    private final AtomicInteger skipped = new AtomicInteger(0);

    private volatile int totalDiscovered = 0;
    private volatile int totalExcluded = 0;
    private volatile int totalWillRun = 0;

    private long startTime;
    
    /**
     * Description:
     * Triggered once before the entire TestNG execution begins. Captures the start time and prints
     * an execution start banner to the console.
     *
     * Author: Abhiram
     */
    @Override
    public void onExecutionStart() {
        startTime = System.currentTimeMillis();
        System.out.println("\n=== Test Execution Started ===");
    }

    /**
     * Description:
     * Triggered when a TestNG context starts. Collects all test methods and excluded methods from the
     * current context, computes unique totals across contexts, prints totals, and renders the initial
     * progress bar output.
     *
     * Author: Abhiram
     *
     * @param context The TestNG context providing access to included and excluded test methods.
     */
    @Override
    public void onStart(ITestContext context) {
        // All methods in this context
        for (ITestNGMethod m : context.getAllTestMethods()) {
            discoveredMethods.add(uniqueId(m));
        }

        // Excluded/disabled methods (by suite/groups/method excludes)
        for (ITestNGMethod m : context.getExcludedMethods()) {
            excludedMethods.add(uniqueId(m));
        }

        // Calculate totals (unique across contexts)
        totalDiscovered = discoveredMethods.size();
        totalExcluded   = excludedMethods.size();
        totalWillRun    = Math.max(totalDiscovered - totalExcluded, 0);

        printTotals();
        renderProgress(null, null);
    }
    
    /**
     * Description:
     * Prints the computed totals for discovered, enabled, and excluded/disabled test cases to the console.
     *
     * Author: Abhiram
     */
    private void printTotals() {
        System.out.println(String.format(
                "Total Test Cases Discovered  : %d%n" +
                "Test Cases Will Run (Enabled): %d%n" +
                "Disabled/Excluded Test Cases : %d%n",
                totalDiscovered, totalWillRun, totalExcluded
        ));
    }
    
    /**
     * Description:
     * Triggered when a test method completes successfully. Updates pass counters, stores the passed test
     * display name, and renders the progress bar with PASS status.
     *
     * Author: Abhiram
     *
     * @param result The TestNG result object containing test method metadata and execution details.
     */
    @Override
    public void onTestSuccess(ITestResult result) {
        passed.incrementAndGet();
        passedTests.add(testDisplayName(result));
        incrementAndRender(result, "PASS");
    }
    
    /**
     * Description:
     * Triggered when a test method fails. Updates failure counters, stores the failed test display name,
     * and renders the progress bar with FAIL status.
     *
     * Author: Abhiram
     *
     * @param result The TestNG result object containing test method metadata and execution details.
     */
    @Override
    public void onTestFailure(ITestResult result) {
        failed.incrementAndGet();
        failedTests.add(testDisplayName(result));
        incrementAndRender(result, "FAIL");
    }
    
    /**
     * Description:
     * Triggered when a test method is skipped. Updates skipped counters, stores the skipped test display name,
     * and renders the progress bar with SKIP status.
     *
     * Author: Abhiram
     *
     * @param result The TestNG result object containing test method metadata and execution details.
     */
    @Override
    public void onTestSkipped(ITestResult result) {
        skipped.incrementAndGet();
        skippedTests.add(testDisplayName(result));
        incrementAndRender(result, "SKIP");
    }
    
    /**
     * Description:
     * Increments the completed test counter and triggers a progress bar refresh with the current test name
     * and status.
     *
     * Author: Abhiram
     *
     * @param result The TestNG result object containing test method metadata and execution details.
     * @param status The status label to display in the progress bar (PASS/FAIL/SKIP).
     */
    private void incrementAndRender(ITestResult result, String status) {
        completed.incrementAndGet();
        renderProgress(result.getMethod().getMethodName(), status);
    }
    
    /**
     * Description:
     * Renders a dynamic console progress bar displaying the completion ratio, percentage, and optionally
     * the current test method name with execution status.
     *
     * Author: Abhiram
     *
     * @param currentTest The current executing test method name to display alongside the progress bar.
     * @param status      The execution status of the current test (PASS/FAIL/SKIP).
     */
    private void renderProgress(String currentTest, String status) {
        int done = completed.get();
        int total = Math.max(totalWillRun, 1); // avoid division by zero

        double percent = (done * 100.0) / total;
        int filled = (int) ((done / (double) total) * BAR_WIDTH);

        String bar = "█".repeat(Math.max(0, filled)) + "░".repeat(Math.max(0, BAR_WIDTH - filled));

        String extra = "";
        if (currentTest != null && status != null) {
            extra = String.format(" | %s: %s", status, currentTest);
        }

        System.out.print(String.format("\r[%s] %d/%d (%.1f%%)%s",
                bar, done, total, percent, extra));
    }
    
    /**
     * Description:
     * Builds a unique identifier for a TestNG method using the fully qualified class name and method name.
     * This ensures uniqueness across multiple contexts and avoids duplicate totals.
     *
     * Author: Abhiram
     *
     * @param m The TestNG method metadata object.
     * @return A unique identifier in the format: FullyQualifiedClassName#methodName.
     */
    private String uniqueId(ITestNGMethod m) {
        return m.getRealClass().getName() + "#" + m.getMethodName();
    }
    
    /**
     * Description:
     * Builds a human-readable test display name for reporting purposes. Includes the class name, method name,
     * and method parameters when the test is data-driven.
     *
     * Author: Abhiram
     *
     * @param result The TestNG result object containing the executing method details and parameters.
     * @return A display name in the format: ClassName#methodName [params...].
     */
    private String testDisplayName(ITestResult result) {
        // Shows ClassName#methodName (and parameters if data-driven)
        String className = result.getMethod().getRealClass().getSimpleName();
        String methodName = result.getMethod().getMethodName();

        Object[] params = result.getParameters();
        if (params != null && params.length > 0) {
            return className + "#" + methodName + " " + Arrays.toString(params);
        }
        return className + "#" + methodName;
    }
    
    /**
     * Description:
     * Triggered once after the entire TestNG execution finishes. Computes execution duration, completes
     * the final progress bar rendering, and prints an aggregated summary of results.
     *
     * Author: Abhiram
     */
    @Override
    public void onExecutionFinish() {
        long endTime = System.currentTimeMillis();
        double seconds = (endTime - startTime) / 1000.0;

        // finish progress line neatly
        renderProgress(null, null);
        System.out.println();

        // Print final summary
        printFinalSummary(seconds);
    }
    
    /**
     * Description:
     * Prints the final consolidated execution summary including totals, pass/fail/skip counts,
     * sorted test method names for each outcome category, and total execution time.
     *
     * Author: Abhiram
     *
     * @param seconds Total execution time in seconds.
     */
    private void printFinalSummary(double seconds) {
        int runTests = completed.get();

        System.out.println("\n=== Final Execution Summary ===");
        System.out.println(String.format("Total Discovered           : %d", totalDiscovered));
        System.out.println(String.format("Enabled (Will Run)         : %d", totalWillRun));
        System.out.println(String.format("Disabled/Excluded          : %d", totalExcluded));
        System.out.println(String.format("Total Tests Executed (Run) : %d", runTests));

        System.out.println("\n--- Results ---");
        System.out.println(String.format("PASSED : %d", passed.get()));
        printTestNames(passedTests);

        System.out.println(String.format("\nFAILED : %d", failed.get()));
        printTestNames(failedTests);

        System.out.println(String.format("\nSKIPPED: %d", skipped.get()));
        printTestNames(skippedTests);

        System.out.println(String.format("\nExecution Time: %.2fs", seconds));
        System.out.println("================================\n");
    }
    
    /**
     * Description:
     * Prints the provided test names in sorted order to maintain stable and readable console output.
     *
     * Author: Abhiram
     *
     * @param tests The set of test display names to print for a specific result category.
     */
    private void printTestNames(Set<String> tests) {
        if (tests == null || tests.isEmpty()) {
            System.out.println("  (none)");
            return;
        }

        // Sort for stable output
        List<String> sorted = new ArrayList<>(tests);
        Collections.sort(sorted);

        for (String t : sorted) {
            System.out.println("  - " + t);
        }
    }
}