package utils;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

/**
 * Class Name: Reporter
 *
 * Description: Utility class responsible for configuring and managing
 * ExtentReports generation for the automation framework. It handles report
 * initialization, HTML report file creation, screenshot attachment, and
 * provides access to the generated report file path for reporting or email
 * integration.
 *
 * @author Ashish Kumar
 */
public class Reporter extends Base {

	public static ExtentReports report;
	private static String reportFilePath;

	/**
	 * Description: Initializes ExtentReports, creates the reports directory if not
	 * present, configures the Spark HTML reporter, and returns the ExtentReports
	 * instance.
	 *
	 * @param filename Name of the Extent report file (without extension)
	 * @return ExtentReports instance
	 *
	 * @author Ashish Kumar
	 */
	public static ExtentReports generateReport(String filename) {
		report = new ExtentReports();
		File folder = new File("./reports");
		if (!folder.exists()) {
			folder.mkdirs();
		}

		File reportFile = new File("./reports/" + filename + ".html");
		reportFilePath = reportFile.getAbsolutePath();
		ExtentSparkReporter spark = new ExtentSparkReporter(reportFile);
		report.attachReporter(spark);

		return report;
	}

	/**
	 * Description: Returns the absolute file path of the generated Extent HTML
	 * report. This is commonly used for email attachments or external reporting.
	 *
	 * @return Absolute path of the Extent report file
	 *
	 * @author Ashish Kumar
	 */
	public static String getReportFilePath() {
		return reportFilePath;
	}

	/**
	 * Description: Captures a screenshot, attaches it to the Extent report for the
	 * given test, and also attaches the same screenshot to the Allure report.
	 *
	 * @param filename    Screenshot file name
	 * @param description Description to be displayed in the report
	 * @param test        ExtentTest instance
	 *
	 * @author Ashish Kumar
	 */
	public static void attachScreenshot(String filename, String description, ExtentTest test) {
		try {
			test.log(Status.INFO, description,
					MediaEntityBuilder.createScreenCaptureFromPath(Screenshots.captureScreenshot(filename)).build());
			AllureAttachments.attachScreenshot(description);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
