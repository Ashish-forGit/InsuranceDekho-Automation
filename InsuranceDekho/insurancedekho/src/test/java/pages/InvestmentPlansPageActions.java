package pages;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import uistore.InvestmentPlansPageLocators;
import utils.WebDriverHelper;

/**
 * Class Name: InvestmentPlansPageActions
 *
 * Description: Page Action class responsible for handling all user
 * interactions, navigations, and validations on the Investment Plans page.
 *
 * This class supports verification of investment plan headings, navigation to
 * Market Linked investment plans, and validation of savings plan details.
 *
 * The class follows the Page Action Model (PAM) design pattern and provides
 * business-readable, reusable methods with step-level logging integrated using
 * Extent Reports.
 *
 * @Author: Ashish Kumar
 */
public class InvestmentPlansPageActions {

	WebDriverHelper helper;
	ExtentTest test;

	/**
	 * Description: Initializes Investment Plans Page actions using WebDriver and
	 * ExtentTest instances for browser interaction and detailed execution
	 * reporting.
	 *
	 * @Test_Case NV_US01_TC06
	 * @param driver WebDriver instance for browser interaction
	 * @param test   ExtentTest instance for logging and reporting
	 * @author Ashish Kumar
	 */
	public InvestmentPlansPageActions(WebDriver driver, ExtentTest test) {
		try {
			this.test = test;
			helper = new WebDriverHelper(driver);
			helper.addLogAndReportInfo("Investment Plans Page Actions initialized successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception while initializing InvestmentPlansPageActions: " + e.getMessage(),
					test);
			throw e;
		}
	}

	/**
	 * Description: Verifies that the 'Best Investment Plans in India' heading is
	 * displayed correctly on the Investment Plans page.
	 *
	 * @Test_Case NV_US01_TC06
	 * @author Ashish Kumar
	 */
	public void verifyBestInvestmentPlansHeading() {
		try {
			String expectedValue = "Best Investment Plans in India 2026";

			helper.addLogAndReportInfo("Verifying 'Best Investment Plans in India' page heading.", test);

			String actualHeading = helper.getText(InvestmentPlansPageLocators.bestInvestmentPlansHeading);

			helper.verify(actualHeading, expectedValue);

			helper.addLogAndReportPass("Investment Plans page heading verified successfully. Expected: '"
					+ expectedValue + "' | Actual: '" + actualHeading + "'", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Exception in verifyBestInvestmentPlansHeading: " + e.getMessage(), test);
			throw e;
		}
	}

	/**
	 * Description: Scrolls the page to bring the 'Market Linked' investment plans
	 * section into the visible viewport.
	 *
	 * @Test_Case NV_US06_TC01 - verifyInvestmentPlansNavigationAndMarketLinkedPlans
	 * @author Ashish Kumar
	 */
	public void goToMarkedLinked() {
		try {
			helper.addLogAndReportInfo("Scrolling to 'Market Linked' investment plans section.", test);

			helper.scrollIntoView(InvestmentPlansPageLocators.markedLinkedLink);

			helper.addLogAndReportInfo("'Market Linked' section is now visible.", test);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception in goToMarkedLinked: " + e.getMessage(), test);
			throw e;
		}
	}

	/**
	 * Description: Clicks on the Market Linked investment plans link to navigate to
	 * relevant plan details.
	 *
	 * @Test_Case NV_US01_TC06
	 * @author Ashish Kumar
	 */
	public void clickOnMarketLinked() {
		try {
			helper.addLogAndReportInfo("Clicking on 'Market Linked' investment plans link.", test);

			helper.clickElement(InvestmentPlansPageLocators.markedLinkedLink);

			helper.addLogAndReportInfo("'Market Linked' investment plans link clicked successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception in clickOnMarketLinked: " + e.getMessage(), test);
			
		}
	}

	/**
	 * Description: Verifies that the Online Savings Plan text is displayed
	 * correctly on the page.
	 *
	 * @Test_Case NV_US01_TC06
	 * @author Ashish Kumar
	 */
	public void verifySavingPlan() {
		try {
			String expectedValue = "Online Savings Plan";

			helper.addLogAndReportInfo("Verifying Online Savings Plan text.", test);

			String actualText = helper.getText(InvestmentPlansPageLocators.savingPlanText);

			helper.verify(actualText, expectedValue);

			helper.addLogAndReportPass("Savings plan text verified successfully. Expected: '" + expectedValue
					+ "' | Actual: '" + actualText + "'", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Exception in verifySavingPlan: " + e.getMessage(), test);
		
		}
	}
}