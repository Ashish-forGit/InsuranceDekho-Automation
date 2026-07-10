package pages;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import uistore.AddOnCoverPageLocators;
import utils.WebDriverHelper;

/**
 * Class Name: AddOnCoverPageActions
 *
 * Description: Page Action class responsible for handling all user
 * interactions, validations, and navigation steps on the Add-On Cover page.
 * This class supports actions related to Car IDV calculation such as brand,
 * model, year selection and IDV amount verification.
 *
 * This class follows the Page Action Model (PAM) and provides reusable,
 * business-readable methods for automation flows.
 *
 * @Author: Ashish Kumar
 */
public class AddOnCoverPageActions {

	WebDriver driver;
	WebDriverHelper helper;
	ExtentTest test;

	/**
	 * Description: Initializes Add-On Cover page actions using WebDriver and
	 * ExtentTest instances to enable interaction with UI elements and logging
	 * execution steps in Extent Reports.
	 *
	 * @Test_Case NV_US01_TC02 - 
	 * @param driver WebDriver instance for browser interaction
	 * @param test   ExtentTest instance for logging and reporting
	 * @author Ashish Kumar
	 */
	public AddOnCoverPageActions(WebDriver driver, ExtentTest test) {
		try {
			this.driver = driver;
			this.test = test;
			helper = new WebDriverHelper(driver);
			helper.addLogAndReportInfo("Add-On Cover Page Actions initialized successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Exception while initializing AddOnCoverPageActions: ", test);
			throw e;
		}
	}

	/**
	 * Description: Scrolls the page to bring the 'Calculate your Car IDV' section
	 * into the visible viewport so that further actions can be performed.
	 *
	 * @Test_Case NV_US01_TC02 -
	 * @author Ashish Kumar
	 */
	public void scrollToCalculateCarIdvSection() {
		try {
			helper.addLogAndReportInfo("Attempting to scroll to 'Calculate your Car IDV' section.", test);

			helper.scrollIntoView(AddOnCoverPageLocators.calculateCarIdvSection);

			helper.addLogAndReportInfo("'Calculate your Car IDV' section is visible now.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Failed to scroll To Calculate Car Idv Section: ", test);
			throw e;
		}
	}

	/**
	 * Description: Selects the first available brand from the Brand dropdown in the
	 * Car IDV calculation section.
	 *
	 * @Test_Case NV_US01_TC02 -
	 * @author Ashish Kumar
	 */
	public void selectBrandFirstOption() {
		try {
			helper.addLogAndReportInfo("Clicking on Brand dropdown.", test);

			helper.clickElement(AddOnCoverPageLocators.selectBrandDropdown);

			helper.waits();

			helper.addLogAndReportInfo("Selecting first available brand from dropdown.", test);

			helper.clickElement(AddOnCoverPageLocators.firstBrand);

			helper.addLogAndReportInfo("Car brand selected successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Failed to select brand first option: ", test);
			throw e;
		}
	}

	/**
	 * Description: Selects the first available car model by entering the model name
	 * and confirming the selection from the dropdown list.
	 *
	 * @Test_Case NV_US01_TC02 -
	 * @author Ashish Kumar
	 */
	public void selectModelFirstOption() {
		try {
			helper.addLogAndReportInfo("Clicking on Model dropdown.", test);

			helper.jsClick(AddOnCoverPageLocators.selectModelDropdown);

			helper.addLogAndReportInfo("Entering car model value 'Alto 800'.", test);

			helper.sendText(AddOnCoverPageLocators.selectModelDropdown, "Alto 800");

			helper.clickEnter(AddOnCoverPageLocators.selectModelDropdown);

			helper.addLogAndReportInfo("Selecting first matching model from dropdown.", test);

			helper.clickElement(AddOnCoverPageLocators.firstModel);

			helper.addLogAndReportInfo("Car model selected successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Failed to select first model", test);
			throw e;
		}
	}

	/**
	 * Description: Selects the first available manufacturing year from the Year
	 * dropdown in the Car IDV calculation flow.
	 *
	 * @Test_Case NV_US01_TC02 -
	 * @author Ashish Kumar
	 */
	public void selectYearFirstOption() {
		try {
			helper.addLogAndReportInfo("Clicking on Year dropdown.", test);

			helper.jsClick(AddOnCoverPageLocators.selectYearDropdown);

			helper.addLogAndReportInfo("Selecting first available year.", test);

			helper.jsClick(AddOnCoverPageLocators.firstYear);

			helper.addLogAndReportInfo("Manufacturing year selected successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Failed to select first year ", test);
			throw e;
		}
	}

	/**
	 * Description: Clicks on the 'Calculate' button to generate the Car IDV amount
	 * based on the selected Brand, Model, and Year.
	 *
	 * @Test_Case NV_US01_TC02 -
	 * @author Ashish Kumar
	 */
	public void clickCalculateAmount() {
		try {
			helper.addLogAndReportInfo("Clicking on 'Calculate' button to generate IDV amount.", test);

			helper.clickElement(AddOnCoverPageLocators.calculateButton);

			helper.addLogAndReportInfo("'Calculate' button clicked successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Failed to click Calculate Amount", test);
			throw e;
		}
	}

	/**
	 * Description: Verifies that the calculated Car IDV amount is displayed
	 * correctly and matches the expected value.
	 *
	 * @Test_Case NV_US01_TC02 -
	 * @author Ashish Kumar
	 */
	public void verifyAmountPresent() {
		try {
			String expectedValue = "Rs. 2,58,547";
			helper.addLogAndReportInfo("Verifying calculated IDV amount is displayed.", test);

			String actualAmount = helper.getText(AddOnCoverPageLocators.idvAmountText);

			helper.verify(actualAmount, expectedValue);

			helper.addLogAndReportPass("IDV amount verified successfully. Expected: '" + expectedValue + "' | Actual: '"
					+ actualAmount + "'", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Failed to verify amount", test);
			throw e;
		}
	}
}