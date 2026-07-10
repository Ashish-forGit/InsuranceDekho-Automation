package pages;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import uistore.CarInsurancePageLocators;
import utils.Screenshots;
import utils.WebDriverHelper;

/**
 * Class Name: CarInsurancePageActions
 *
 * Description: Page Action class responsible for handling validations and
 * interactions on the Car Insurance landing page. This class primarily
 * validates the presence of Car Insurance related headers and ensures that
 * users are navigated to the correct Car Insurance page.
 *
 * This class follows the Page Action Model (PAM) design pattern and integrates
 * step-level logging using Extent Reports to provide clear execution
 * traceability.
 *
 * @Author: Ashish Kumar
 */
public class CarInsurancePageActions {

	WebDriver driver;
	WebDriverHelper helper;
	ExtentTest test;

	/**
	 * Description: Initializes Car Insurance Page Actions using WebDriver and
	 * ExtentTest instances for browser interaction and test execution logging.
	 *
	 * @Test_Case NV_US01_TC01, NV_US01_TC02 - , NV_US02_TC01 - verifyNavigationToCarInsurancePageAndHeading
	 * @param driver WebDriver instance for browser interaction
	 * @param test   ExtentTest instance for logging and reporting
	 * @author Ashish Kumar
	 */
	public CarInsurancePageActions(WebDriver driver, ExtentTest test) {
		try {
			this.driver = driver;
			this.test = test;
			helper = new WebDriverHelper(driver);
			helper.addLogAndReportInfo("Car Insurance Page Actions initialized successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception while initializing CarInsurancePageActions: " + e.getMessage(), test);
			throw e;
		}
	}

	/**
	 * Description: Verifies that the Car Insurance page heading is displayed
	 * correctly and matches the expected business value.
	 *
	 * @Test_Case NV_US01_TC01 - , NV_US02_TC01 - 
	 * @author Ashish Kumar
	 */
	public void verifyCarInsuranceHeadingIsPresent() {
		try {
			String expectedValue = "Car Insurance";

			helper.addLogAndReportInfo("Verifying Car Insurance page heading.", test);

			String actualHeading = helper.getText(CarInsurancePageLocators.carInsuranceHeading);

			helper.verify(actualHeading, expectedValue);

			helper.addLogAndReportPass("Car Insurance page heading verified successfully. Expected: '" + expectedValue
					+ "' | Actual: '" + actualHeading + "'", test);
			Screenshots.captureScreenshot("NV_US01_TC01");

		} catch (Exception e) {
			helper.addLogAndReportFail("Failed to verify Car Insurance Heading is present", test);
			throw e;
		}
	}
}
