package pages;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import uistore.BikeClaimSettlementPageLocators;
import utils.WebDriverHelper;

/**
 * Class Name: BikeClaimSettlementPageActions
 *
 * Description: Page Action class responsible for handling all user
 * interactions, validations, and navigations related to the Bike Claim
 * Settlement page in the InsuranceDekho application.
 *
 * This class follows the Page Action Model (PAM) design pattern and provides
 * reusable, business-readable methods for automation flows related to Bike
 * Insurance IDV calculation and claim settlement.
 *
 * @Author: Ashish Kumar
 */
public class BikeClaimSettlementPageActions {

	WebDriver driver;
	WebDriverHelper helper;
	ExtentTest test;

	/**
	 * Description: Initializes Bike Claim Settlement page actions using WebDriver
	 * and ExtentTest instances for UI interaction and execution reporting.
	 *
	 * @Test_Case NV_US03_TC01 - verifyBikeClaimSettlementIdvAmountCalculation
	 * @param driver WebDriver instance for browser interaction
	 * @param test   ExtentTest instance for logging and reporting
	 * @author Ashish Kumar
	 */
	public BikeClaimSettlementPageActions(WebDriver driver, ExtentTest test) {
		try {
			this.driver = driver;
			this.test = test;
			helper = new WebDriverHelper(driver);
			helper.addLogAndReportInfo("Bike Claim Settlement Page Actions initialized successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Exception while initializing BikeClaimSettlementPageActions",
					test);
			throw e;
		}
	}

	/**
	 * Description: Verifies that the Bike Insurance Claim Settlement page heading
	 * is displayed correctly as per expected business requirement.
	 *
	 * @Test_Case NV_US03_TC01 - verifyBikeClaimSettlementIdvAmountCalculation
	 * @author Ashish Kumar
	 */
	public void verifyBikeInsuranceClaimHeadingIsPresent() {
		try {
			String expectedValue = "Bike Insurance Claim";

			helper.addLogAndReportPass("Verifying Bike Insurance Claim Settlement page heading.", test);

			String actualText = helper.getText(BikeClaimSettlementPageLocators.bikeInsuranceClaimHeading);

			helper.verify(actualText, expectedValue);

			helper.addLogAndReportInfo("Bike Insurance Claim heading verified successfully. Expected: '" + expectedValue
					+ "' | Actual: '" + actualText + "'", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Failed to verify Bike Insurance Claim heading Is present",
					test);
			throw e;
		}
	}

	/**
	 * Description: Scrolls the page to bring the 'Calculate your Two Wheeler IDV'
	 * section into the visible viewport for further interaction.
	 *
	 * @Test_Case NV_US03_TC01 - verifyBikeClaimSettlementIdvAmountCalculation
	 * @author Ashish Kumar
	 */
	public void scrollToCalculateTwoWheelerIdvSection() {
		try {
			helper.addLogAndReportInfo("Scrolling to 'Calculate Two Wheeler IDV' section.", test);

			helper.scrollIntoView(BikeClaimSettlementPageLocators.calculateTwoWheelerIdvSection);

			helper.addLogAndReportInfo("'Calculate Two Wheeler IDV' section is now visible.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Exception in scrollToCalculateTwoWheelerIdvSection", test);
			throw e;
		}
	}

	/**
	 * Description: Selects the first available brand from the Brand dropdown in the
	 * Two Wheeler IDV calculation section.
	 *
	 * @Test_Case NV_US03_TC01 - verifyBikeClaimSettlementIdvAmountCalculation
	 * @author Ashish Kumar
	 */
	public void selectBrandFirstOptions() {
		try {
			helper.addLogAndReportInfo("Selecting first brand option from Brand dropdown.", test);

			helper.clickElement(BikeClaimSettlementPageLocators.selectBrandDropdown);

			helper.clickElement(BikeClaimSettlementPageLocators.firstBrand);

			helper.addLogAndReportInfo("First brand selected successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception in selectBrandFirstOptions: ", test);
			throw e;
		}
	}

	/**
	 * Description: Selects the first available bike model by entering model name
	 * and confirming selection from the dropdown.
	 *
	 * @Test_Case NV_US03_TC01 - verifyBikeClaimSettlementIdvAmountCalculation
	 * @author Ashish Kumar
	 */
	public void selectModelFirstOption() {
		try {
			helper.addLogAndReportInfo("Selecting first bike model option.", test);

			helper.clickElement(BikeClaimSettlementPageLocators.selectModelDropdown);

			helper.addLogAndReportInfo("Entering model name 'Splendor Plus'.", test);

			helper.sendText(BikeClaimSettlementPageLocators.selectModelDropdown, "Splendor Plus");

			helper.clickEnter(BikeClaimSettlementPageLocators.selectModelDropdown);

			helper.clickElement(BikeClaimSettlementPageLocators.firstModel);

			helper.addLogAndReportInfo("Bike model selected successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception in selectModelFirstOption", test);
			throw e;
		}
	}

	/**
	 * Description: Selects the first available manufacturing year for the selected
	 * two wheeler.
	 *
	 * @Test_Case NV_US03_TC01 - verifyBikeClaimSettlementIdvAmountCalculation
	 * @author Ashish Kumar
	 */
	public void selectYearFirstOption() {
		try {
			helper.addLogAndReportInfo("Selecting manufacturing year from Year dropdown.", test);

			helper.clickElement(BikeClaimSettlementPageLocators.selectYearDropdown);

			helper.clickElement(BikeClaimSettlementPageLocators.firstYear);

			helper.addLogAndReportInfo("Manufacturing year selected successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception in selectYearFirstOption", test);
			throw e;
		}
	}

	/**
	 * Description: Clicks on the Calculate button to generate the Two Wheeler IDV
	 * amount and verifies that the displayed amount matches the expected value.
	 *
	 * @Test_Case NV_US03_TC01 - verifyBikeClaimSettlementIdvAmountCalculation
	 * @author Ashish Kumar
	 */
	public void clickCalculateAndVerifyIdvAmount() {
		try {
			String expectedValue = "Rs. 64,323";

			helper.addLogAndReportInfo("Clicking on Calculate button to generate IDV amount.", test);

			helper.clickElement(BikeClaimSettlementPageLocators.calculateButton);

			String actualAmount = helper.getText(BikeClaimSettlementPageLocators.idvAmountText);

			helper.verify(actualAmount, expectedValue);

			helper.addLogAndReportPass("IDV amount verified successfully. Expected: '" + expectedValue + "' | Actual: '"
					+ actualAmount + "'", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Exception in clickCalculateAndVerifyIdvAmount", test);
			throw e;
		}
	}
}