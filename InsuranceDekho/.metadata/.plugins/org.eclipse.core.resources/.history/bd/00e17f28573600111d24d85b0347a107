package pages;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import uistore.InvestmentInsuranceNewsPageLocators;
import utils.WebDriverHelper;

/**
 * Class Name: InvestmentInsuranceNewsPageActions
 *
 * Description: Page Action class responsible for handling all user
 * interactions, navigation, and validations on the Investment Insurance News
 * page.
 *
 * This includes verification of page headers, navigating to the Investment
 * Advisors section, selecting city-specific advisors, and validating advisor
 * listing headers.
 *
 * The class follows the Page Action Model (PAM) design pattern and provides
 * reusable, business-readable methods with step-level logging integrated using
 * Extent Reports.
 *
 * @Author: Ashish Kumar
 */
public class InvestmentInsuranceNewsPageActions {

	WebDriverHelper helper;
	ExtentTest test;

	/**
	 * Description: Initializes Investment Insurance News Page actions using
	 * WebDriver and ExtentTest instances for browser interaction and execution
	 * reporting.
	 *
	 * @Test_Case NV_US16_TC01 -
	 *            verifyInvestmentInsuranceNewsGurgaonAdvisorsNavigationAndHeader
	 * @param driver WebDriver instance for browser interaction
	 * @param test   ExtentTest instance for logging and reporting
	 * @author Ashish Kumar
	 */
	public InvestmentInsuranceNewsPageActions(WebDriver driver, ExtentTest test) {
		try {
			this.test = test;
			helper = new WebDriverHelper(driver);
			helper.addLogAndReportInfo("Investment Insurance News Page Actions initialized successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportInfo(
					"Exception while initializing InvestmentInsuranceNewsPageActions: " + e.getMessage(), test);
			throw e;
		}
	}

	/**
	 * Description: Verifies that the Investment Insurance News page header is
	 * displayed correctly as per the expected business value.
	 *
	 * @Test_Case NV_US16_TC01 -
	 *            verifyInvestmentInsuranceNewsGurgaonAdvisorsNavigationAndHeader
	 * @author Ashish Kumar
	 */
	public void verifyInvestmentInsuranceNewsHeader() {
		try {
			String expectedValue = "Investment Insurance News";
			helper.addLogAndReportInfo("Verifying Investment Insurance News page header.", test);

			String actualHeader = helper.getText(InvestmentInsuranceNewsPageLocators.investmentInsuranceNewsHeader);

			helper.verify(actualHeader, expectedValue);

			helper.addLogAndReportPass("Investment Insurance News header verified successfully. Expected: '"
					+ expectedValue + "' | Actual: '" + actualHeader + "'", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Failed to verify 'Investment Insurance News'", test);
			throw e;
		}
	}

	/**
	 * Description: Scrolls the page to bring the 'Best Investment Advisors in Your
	 * City' section into the visible viewport.
	 *
	 * @Test_Case NV_US16_TC01 -
	 *            verifyInvestmentInsuranceNewsGurgaonAdvisorsNavigationAndHeader
	 * @author Ashish Kumar
	 */
	public void goToInvestmentAdvisorsinYourCity() {
		try {
			helper.addLogAndReportInfo("Scrolling to 'Best Investment Advisors in Your City' section.", test);

			helper.scrollIntoView(InvestmentInsuranceNewsPageLocators.bestInvestmentAdvisorsinYourCitySection);

			helper.addLogAndReportInfo("Investment Advisors section is visible now.", test);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception in goToInvestmentAdvisorsinYourCity: " + e.getMessage(), test);
			throw e;
		}
	}

	/**
	 * Description: Clicks on the Gurgaon Investment Advisors option to navigate to
	 * advisors listed for Gurgaon city.
	 *
	 * @Test_Case NV_US16_TC01 -
	 *            verifyInvestmentInsuranceNewsGurgaonAdvisorsNavigationAndHeader
	 * @author Ashish Kumar
	 */
	public void clickGurgaonAdvisors() {
		try {
			helper.addLogAndReportInfo("Clicking on Investment Advisors in Gurgaon.", test);

			helper.clickElement(InvestmentInsuranceNewsPageLocators.insuranceAdvaisorinGurgaonButton);

			helper.addLogAndReportInfo("Gurgaon Investment Advisors clicked successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception in clickGurgaonAdvisors: " + e.getMessage(), test);
			throw e;
		}
	}

	/**
	 * Description: Verifies that the Gurgaon Investment Advisors listing page
	 * header is displayed correctly as per the expected business value.
	 *
	 * @Test_Case NV_US16_TC01 -
	 *            verifyInvestmentInsuranceNewsGurgaonAdvisorsNavigationAndHeader
	 * @author Ashish Kumar
	 */
	public void verifyInsuranceAdvaisorsInGurgaonHeader() {
		try {
			String expected = "3 Investment Advisors in Gurgaon";
			helper.addLogAndReportInfo("Verifying Gurgaon Investment Advisors page header.", test);

			helper.hoverElement(InvestmentInsuranceNewsPageLocators.insuranceAdvaisorinGurgaonHeader);

			String actualHeader = helper.getText(InvestmentInsuranceNewsPageLocators.insuranceAdvaisorinGurgaonHeader);

			helper.verify(actualHeader, expected);

			helper.addLogAndReportPass("Gurgaon Investment Advisors header verified successfully. Expected: '"
					+ expected + "' | Actual: '" + actualHeader + "'", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Failed to verify '3 Investment Advisors in Gurgaon'", test);
			throw e;
		}
	}
}