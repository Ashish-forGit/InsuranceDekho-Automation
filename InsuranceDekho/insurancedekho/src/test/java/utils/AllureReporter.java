package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class Name  : AllureReporter
 * Description : Utility class responsible for generating Allure HTML reports
 *               using the locally available Allure CLI.
 *
 * @author     : Ashish Kumar
 */
public class AllureReporter {

    private static final String ALLURE_CLI_PATH =
            System.getProperty("user.dir") +
            File.separator +
            "allure-2.38.1" +
            File.separator +
            "bin" +
            File.separator +
            "allure.bat";

    private static final String RESULT_DIR =
            System.getProperty("user.dir") +
            File.separator +
            "allure-results";

    private static final String REPORT_BASE_DIR =
            System.getProperty("user.dir") +
            File.separator +
            "allure-reports";

    /**
     * Description: Generates Allure HTML report using Allure CLI
     * @author Ashish Kumar
     */
    public static void generateAllureReport() {

        try {
            Thread.sleep(2000); // ensure results are flushed

            String timestamp = new SimpleDateFormat(
                    "yyyy_MM_dd-HH_mm_ss").format(new Date());

            String reportDir =
                    REPORT_BASE_DIR +
                    File.separator +
                    "AllureReport_" +
                    timestamp;

            new File(REPORT_BASE_DIR).mkdirs();

            String command = String.format(
                    "cmd.exe /c \"%s generate %s -o %s --clean\"",
                    ALLURE_CLI_PATH,
                    RESULT_DIR,
                    reportDir
            );

            System.out.println("Executing Allure command:");
            System.out.println(command);

            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();

            System.out.println("Allure Report generated at: " + reportDir);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
