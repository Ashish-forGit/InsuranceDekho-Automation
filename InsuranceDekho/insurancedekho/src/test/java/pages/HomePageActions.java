package pages;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import uistore.HomePageLocators;
import utils.Base;
import utils.WebDriverHelper;

public class HomePageActions {

	WebDriver driver;
	WebDriverHelper helper;
	ExtentTest test;

	/**
	 * Description: Initializes Home Page actions using WebDriver and ExtentTest
	 * instances for UI interaction and reporting.
	 *
	 * @Test_Case NV_US01_TC01, NV_US01_TC02, NV_US01_TC03,  NV_US01_TC04, NV_US01_TC05,
	 * 			  NV_US01_TC06, NV_US02_TC01, NV_US02_TC02, NV_US02_TC03,
	 *			  NV_US02_TC04, NV_US02_TC05, NV_US03_TC01, NV_US03_TC02, NV_US04_TC01,
	 *            NV_US04_TC02, NV_US04_TC03, NV_US04_TC04, NV_US04_TC05,
	 *            NV_US05_TC01, NV_US05_TC02
	 * 
	 * @author Ashish Kumar
	 */
	public HomePageActions(WebDriver driver, ExtentTest test) {

		this.driver = driver;
		this.test = test;
		helper = new WebDriverHelper(driver);
		helper.addLogAndReportInfo("Home Page Actions initialized successfully.", test);

	}

	/**
	 * Description: Verifies that InsuranceDekho logo is visible on Home page.
	 *
	 * @Test_Case NV_US01_TC01 - 
	 * @author Ashish Kumar
	 */

	public void verifyInsuranceDekhoIsVisible() {
		try {
			if (helper.isElementDisplayed(HomePageLocators.insuranceDekhoLogo)) {
				helper.verifyElementIsDisplayed(HomePageLocators.insuranceDekhoLogo, "InsuranceDekho Logo", test);
			} else {
				helper.verifyElementIsDisplayed(HomePageLocators.insuranceDekhoLogoFallback,
						"InsuranceDekho Logo (Fallback)", test);
			}
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception in verifyInsuranceDekhoIsVisible", test);

		}
	}

	/**
	 * Description: Hovers over the Insurance menu in the navigation bar.
	 *
	 * @Test_Case NV_US01_TC01, NV_US01_TC02, NV_US01_TC03, NV_US01_TC04, NV_US01_TC05,
	 *            NV_US01_TC06, NV_US05_TC01
	 * 
	 * @author Ashish Kumar
	 */
	public void hoverOnInsuranceMenu() {
		try {
			helper.addLogAndReportInfo("Hovering over 'Insurance' menu in navigation bar.", test);
			helper.hoverElement(HomePageLocators.insuranceNav);
			helper.addLogAndReportInfo("'Insurance' menu hovered successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Failed to hover 'Insurance'", test);

		}
	}

	/**
	 * Description: Clicks on Car Insurance option under Insurance menu.
	 *
	 * @Test_Case NV_US01_TC01 - , NV_US01_TC02 - ,
	 * @author Ashish Kumar
	 */
	public void clickOnCarInsurance() {
		try {
			helper.addLogAndReportInfo("Clicking on 'Car Insurance' option from Insurance dropdown.", test);
			helper.clickElement(HomePageLocators.carInsuranceLink);
			helper.addLogAndReportInfo("'Car Insurance' option clicked successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception in clickOnCarInsurance", test);

		}
	}

	/**
	 * Description: Hovers on Car Insurance option under Insurance menu.
	 *
	 * @Test_Case NV_US01_TC02 - ,
	 * @author Ashish Kumar
	 */
	public void hoverOnCarInsuranceMenu() {
		try {
			helper.addLogAndReportInfo("Hovering over 'Car Insurance' under Insurance menu.", test);
			helper.hoverElement(HomePageLocators.carInsuranceLink);
			helper.addLogAndReportInfo("'Car Insurance' menu hovered successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception in hoverOnCarInsuranceMenu", test);

		}
	}

	/**
	 * Description: Clicks on Add On Cover page under Car Insurance.
	 *
	 * @Test_Case NV_US01_TC02 -
	 * @author Ashish Kumar
	 */
	public void clickOnAddOnCover() {
		try {
			helper.addLogAndReportInfo("Clicking on 'Add on Cover' option.", test);
			helper.clickElement(HomePageLocators.addOnCoverLink);
			helper.addLogAndReportInfo("'Add on Cover' page navigation triggered successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception in clickOnAddOnCover", test);

		}
	}

	/**
	 * Description: Hover over Bike Insurance.
	 *
	 * @Test_Case NV_US01_TC03 -
	 * @author Ashish Kumar
	 */
	public void hoverOnBikeInsuranceMenu() {
		try {
			helper.addLogAndReportInfo("Hovering over 'Bike Insurance' under Insurance menu.", test);
			helper.hoverElement(HomePageLocators.bikeInsuranceNav);
			helper.waits();
			helper.addLogAndReportInfo("'Bike Insurance' menu hovered successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Failed to hover bike insurance", test);

		}
	}

	/**
	 * Description: Clicks on Claim Settlement under Bike Insurance.
	 *
	 * @Test_Case NV_US01_TC03
	 * @author Ashish Kumar
	 */
	public void clickOnClaimSettlement() {
		try {
			helper.addLogAndReportInfo("Clicking on 'Claim Settlement' under Bike Insurance menu.", test);
			helper.clickElement(HomePageLocators.claimSettlementLink);
			helper.addLogAndReportInfo("'Claim Settlement' clicked successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception in clickOnClaimSettlement", test);

		}
	}

	/**
	 * Description: Hover over Life Insurance.
	 *
	 * @Test_Case NV_US01_TC04, NV_US01_TC05
	 * @author Ashish Kumar
	 */
	public void hoverOnLifeInsuranceMenu() {
		try {
			helper.addLogAndReportInfo("Hovering over 'Life Insurance' under Insurance menu.", test);
			helper.hoverElement(HomePageLocators.lifeInsuranceNav);
			helper.addLogAndReportInfo("'Life Insurance' menu hovered successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception in hoverOnLifeInsuranceMenu", test);

		}
	}

	/**
	 * Description: Clicks to Human Life Value calculator under Life Insurance.
	 *
	 * @Test_Case NV_US01_TC04, NV_US01_TC05
	 * @author Ashish Kumar
	 */
	public void clickOnHumanLifeValueCalculator() {
		try {
			helper.addLogAndReportInfo("Clicking on 'Human Life Value Calculator' option.", test);
			helper.hoverElement(HomePageLocators.humanLifeValueCalculatorLink);
			helper.clickElement(HomePageLocators.humanLifeValueCalculatorLink);
			helper.waits();
			helper.addLogAndReportInfo("'Human Life Value Calculator' clicked successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception in clickOnHumanLifeValueCalculator: " + e.getMessage(), test);

		}
	}

	/**
	 * Description: Hover over Investment.
	 *@Test_Case NV_US01_TC06
	 * 
	 * @author Ashish Kumar
	 */
	public void hoverOverInvestmentMenu() {
		try {
			helper.addLogAndReportInfo("Hovering on 'Investment' menu.", test);
			helper.hoverElement(HomePageLocators.investmentLink);
			helper.addLogAndReportInfo("Hover over Investment.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Failed to hover over Investment Menu: ", test);

		}
	}

	/**
	 * Description: Clicks over Investment Plans.
	 *@Test_Case NV_US01_TC06
	 *
	 * @author Ashish Kumar
	 */
	public void clickOnInvestmentPlans() {
		try {
			helper.addLogAndReportInfo("Clicking on 'Investment Plans' option.", test);
			helper.hoverElement(HomePageLocators.investmentPLans);
			helper.clickElement(HomePageLocators.investmentPLans);
		} catch (Exception e) {
			helper.addLogAndReportFail("Exception in clickOnInvestmentPlans", test);

		}
	}

	/**
	 * Description: Hover over Insurance Advisors.
	 *
	 *@Test_Case NV_US02_TC01, NV_US02_TC02, NV_US02_TC03, NV_US02_TC04, NV_US02_TC05,
	 *           NV_US05_TC01
	 * @author Ashish Kumar
	 */
	public void hoverOverInsuranceAdvisors() {
		try {
			
			helper.addLogAndReportInfo("Hovering on 'Insurance Advaisors' menu.", test);
			helper.hoverElement(HomePageLocators.insuranceAdvisorsLink);
		} catch (Exception e) {
			helper.addLogAndReportFail("Exception in hoverOverInsuranceAdvisors", test);

		}
	}

	/**
	 * Description: Clicks on Insurance Advisors in New Delhi.
	 *
	 * @Test_Case NV_US02_TC01, NV_US02_TC02, NV_US02_TC03, NV_US02_TC04, NV_US02_TC05,
	 * 			  NV_US05_TC01
	 * @author Ashish Kumar
	 */
	public void clickInsuranceAdvisorsInNewDelhi() {
		try {
			helper.addLogAndReportInfo("Clicking on 'Insurance Advisors In New Delhi Plans' option.", test);
			helper.clickElement(HomePageLocators.insuranceAdvisorsInNewDelhi);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception in clickInsuranceAdvisorsInNewDelhi", test);

		}
	}

	/**
	 * Description: Hover over Support in navigation.
	 *
	 * @Test_Case NV_US03_TC01, NV_US03_TC02
	 * @author Ashish Kumar
	 */
	public void hoverOverSupportNav() {
		try {
			helper.addLogAndReportInfo("Hovering on 'Support' menu.", test);
			helper.hoverElement(HomePageLocators.supportMenu);

		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception in hoverOverSupportNav", test);

		}
	}

	/**
	 * Description: Clicks on Support in navigation.
	 *
	 * @Test_Case NV_US03_TC01, NV_US03_TC02
	 * @author Ashish Kumar
	 */
	public void clickOnRenewPolicy() {
		try {
			helper.addLogAndReportInfo("Clicking on 'Renew Policy' option.", test);
			helper.clickElement(HomePageLocators.renewPolicyLink);
		} catch (Exception e) {
			helper.addLogAndReportInfo("Exception in clickOnRenewPolicy", test);
			throw e;
		}
	}

	/**
	 * Description: Clicks on the Terms and Conditions link displayed on the Home
	 * page.
	 *
	 *@Test_Case NV_US03_TC01, NV_US03_TC02
	 * @author Ashish Kumar
	 */
	public void clickOnTermsAndCondition() {
		try {
			helper.addLogAndReportInfo("Step: Clicking on 'Terms and Conditions' link.", test);

			helper.clickElement(HomePageLocators.termsAndConditionLink);

			helper.addLogAndReportPass("Step Passed: 'Terms and Conditions' link clicked successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Unable to click 'Terms and Conditions' link.", test);

		}
	}

	/**
	 * Description: Verifies that the Terms and Conditions text is displayed
	 * correctly on the page.
	 *
	 * @Test_Case NV_US03_TC01, NV_US03_TC02
	 * @author Ashish Kumar
	 */
	public void verifyTandCtext() {
		try {
			String expected = "*Standard T&C Apply.";

			helper.addLogAndReportInfo("Step: Verifying Terms and Conditions text is displayed.", test);

			helper.verifyPartialText(helper.getText(HomePageLocators.standardTandCLink), expected);

			helper.addLogAndReportPass("Step Passed: Terms and Conditions text verified successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Unable to verify Terms and Conditions text.", test);

		}
	}

	/**
	 * Description: Enters a valid mobile number into the mobile number input field
	 * as part of the Renew Policy flow.
	 *
	 * @Test_Case NV_US03_TC01
	 * @author Ashish Kumar
	 */
	public void typeMobile() {
		try {
			String value = Base.prop.getProperty("renewMobile");
			helper.addLogAndReportInfo("Step: Entering valid mobile number in input field: " + value, test);

			helper.sendText(HomePageLocators.mobileNumberInput, value);

			helper.addLogAndReportPass("Step Passed: Valid mobile number entered successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Unable to enter valid mobile number", test);

		}
	}

	/**
	 * Description: Enters an invalid mobile number into the mobile number input
	 * field to trigger validation error.
	 *
	 * @Test_Case NV_US03_TC02
	 * @author Ashish Kumar
	 */
	public void typeWrongMobile() {
		try {
			String value = Base.prop.getProperty("wrongMobileNo");
			helper.addLogAndReportInfo("Step: Entering invalid mobile number in input field: " + value, test);

			helper.sendText(HomePageLocators.mobileNumberInput, value);

			helper.addLogAndReportPass("Step Passed: Invalid mobile number entered successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Unable to enter invalid mobile number.", test);

		}
	}

	/**
	 * Description: Clicks on the Continue button to proceed in the current flow.
	 *
	 * @Test_Case NV_US03_TC01, NV_US03_TC02
	 * @author Ashish Kumar
	 */
	public void clickOnContinue() {
		try {
			helper.addLogAndReportInfo("Step: Clicking on 'Continue' button.", test);

			helper.clickElement(HomePageLocators.continueButton);

			helper.addLogAndReportPass("Step Passed: 'Continue' button clicked successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Unable to click 'Continue' button.", test);

		}
	}

	/**
	 * Description: Verifies OTP sent confirmation message.
	 *
	 * @Test_Case NV_US03_TC01
	 * @author Ashish Kumar
	 */
	public void verifyOtpSentToSms() {
		try {
			String expectedValue = "OTP sent by SMS to ";
			helper.verifyPartialText(helper.getText(HomePageLocators.otpSentToSms), expectedValue);
			helper.addLogAndReportPass("Verified Otp sent to mobile", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Exception in verifyOtpSentToSms: ", test);

		}
	}

	/**
	 * Description: Validates error message for invalid mobile number input.
	 *
	 * @Test_Case NV_US03_TC02
	 * @author Ashish Kumar
	 */
	public void verifyWrongMobileInput() {
		try {
			String expectedValue = "Invalid mobile number.";
			helper.verify(helper.getText(HomePageLocators.mobileValidationMessage), expectedValue);
			helper.addLogAndReportPass("Verified Wrong phone number input", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Failed to verify invalid mobile", test);

		}
	}

	// testcase14 & testcase15
	/**
	 * Description: Hovers over the News menu in the navigation bar to display
	 * available news categories.
	 *
	 *
	 * @Test_Case NV_US04_TC01, NV_US04_TC02, NV_US04_TC03, NV_US04_TC04, NV_US04_TC05,
	 * 			  NV_US05_TC01
	 * @author Ashish Kumar
	 */
	public void hoverOverNews() {
		try {
			helper.addLogAndReportInfo("Step: Hovering over 'News' menu in the navigation bar.", test);

			helper.hoverElement(HomePageLocators.newsNavigationLink);

			helper.addLogAndReportPass("Step Passed: Hovered over 'News' menu successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Unable to hover over 'News' menu.", test);

		}
	}

	/**
	 * Description: Clicks on the Car Insurance News option under the News menu.
	 *
	 * @Test_Case NV_US04_TC01
	 * @Author Ashish Kumar
	 */
	public void clickCarInsuranceNews() {
		try {
			helper.addLogAndReportInfo("Step: Clicking on 'Car Insurance News' option under News menu.", test);

			helper.clickElement(HomePageLocators.carInsuranceNews);

			helper.addLogAndReportPass("Step Passed: Clicked on 'Car Insurance News' successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Unable to click 'Car Insurance News'.", test);
			throw e;
		}
	}

	/**
	 * Description: Hovers over Health Insurance News option under the News menu.
	 *
	 * @Test_Case NV_US04_TC02
	 * @Author Ashish Kumar
	 */
	public void hoverOverHealthInsuranceNews() {
		try {
			helper.addLogAndReportInfo("Step: Hovering over 'Health Insurance News' option under News menu.", test);

			helper.hoverElement(HomePageLocators.healthInsuranceNewsNavigation);

			helper.addLogAndReportPass("Step Passed: Hovered over 'Health Insurance News' successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Unable to hover over 'Health Insurance News'.", test);

		}
	}

	/**
	 * Description: Clicks on the Health Insurance article displayed under News
	 * section.
	 *
	 * @Test_Case NV_US04_TC02
	 * @Author Ashish Kumar
	 */
	public void clickHealthInsuranceArticle() {
		try {
			helper.addLogAndReportInfo("Step: Clicking on the Health Insurance article under News section.", test);

			helper.clickElement(HomePageLocators.HealthInsuranceNewsArticle);

			helper.addLogAndReportPass("Step Passed: Health Insurance article clicked successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Unable to click Health Insurance article.", test);

		}
	}

	/**
	 * Description: Clicks on Investment News option under the News menu.
	 *
	 * @Test_Case NV_US04_TC03
	 * @Author Ashish Kumar
	 */
	public void clickInvestmentNews() {
		try {
			helper.addLogAndReportInfo("Step: Clicking on 'Investment News' under News menu.", test);

			helper.clickElement(HomePageLocators.investmentNewsLink);

			helper.addLogAndReportPass("Step Passed: Clicked on 'Investment News' successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Unable to click 'Investment News'.", test);

		}
	}

	/**
	 * Description: Clicks on Business News option under the News menu.
	 *
	 *@Test_Case NV_US04_TC04, NV_US04_TC05
	 * @Author Ashish Kumar
	 */
	public void clickBusinessNewsLink() {
		try {
			helper.addLogAndReportInfo("Step: Clicking on 'Business News' under News menu.", test);

			helper.clickElement(HomePageLocators.businessNewsLink);

			helper.addLogAndReportPass("Step Passed: Clicked on 'Business News' successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Unable to click 'Business News'", test);

		}
	}

	/**
	 * Description: Verifies navigation bar is displayed on Home page.
	 *
	 * @Test_Case NV_US05_TC01, NV_US05_TC02
	 * @author Ashish Kumar
	 */
	public void verifyNavigationBarIsDisplayed() {
		try {
			helper.addLogAndReportInfo("Step: Verifying the navigation bar is displayed on the Home page.", test);
			helper.hoverElement(HomePageLocators.nevigationTag);

			helper.verifyElementIsDisplayed(HomePageLocators.nevigationTag, "navigationBar", test);

			helper.addLogAndReportPass("Step Passed: Navigation bar is displayed successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Navigation bar is not displayed.", test);

		}
	}

	/**
	 * Description: Clicks on the "Term Insurance" link from the navigation menu to
	 * navigate to the Term Insurance page.
	 *
	 * @Test_Case NV_US05_TC01
	 * @author Ashish Kumar
	 */
	public void clcikTermInsuranceLink() {
		try {
			helper.addLogAndReportInfo("Step: Clicking on 'Term Insurance' link from navigation menu.", test);

			helper.clickElement(HomePageLocators.termInsuranceLink);

			helper.addLogAndReportPass("Step Passed: 'Term Insurance' link clicked successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Unable to click 'Term Insurance' link.", test);

		}
	}

	/**
	 * Description: Clicks on the "Travel Insurance" link from the navigation menu
	 * to navigate to the Travel Insurance page.
	 *
	 * @Test_Case NV_US05_TC01
	 * @author Ashish Kumar
	 */
	public void clcikTravelInsuranceLink() {
		try {
			helper.addLogAndReportInfo("Step: Clicking on 'Travel Insurance' link from navigation menu.", test);

			helper.clickElement(HomePageLocators.travelInsuraneLink);

			helper.addLogAndReportPass("Step Passed: 'Travel Insurance' link clicked successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Unable to click 'Travel Insurance' link.", test);

		}
	}

	/**
	 * Description: Opens the first Travel Insurance article by hovering over it and
	 * clicking on the article card/link.
	 *
	 * @Test_Case NV_US05_TC01
	 * @author Ashish Kumar
	 */
	public void clickFirstArticleInTravelInsuranceArticle() {
		try {
			helper.addLogAndReportInfo("Step: Hovering over the first Travel Insurance article.", test);

			helper.hoverElement(HomePageLocators.firstTravelInsuranceArticle);

			helper.addLogAndReportInfo("Step: Clicking on the first Travel Insurance article.", test);

			helper.clickElement(HomePageLocators.firstTravelInsuranceArticle);

			helper.addLogAndReportPass("Step Passed: First Travel Insurance article opened successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Unable to open first Travel Insurance article.", test);

		}
	}

	/**
	 * Description: Scrolls the current page to the bottom using JavaScript. This
	 * action is used to validate page scroll behavior and footer visibility.
	 *
	 * @Test_Case NV_US05_TC02
	 * @author Ashish Kumar
	 */
	public void pageScrollsToTheBottom() {
		try {
			helper.addLogAndReportInfo("Step: Scrolling page to the bottom.", test);

			helper.scrollToBottom();

			helper.addLogAndReportPass("Step Passed: Page scrolled to the bottom successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Unable to scroll page to the bottom.", test);

		}
	}

	/**
	 * Description: Scrolls the current page back to the top using JavaScript. This
	 * action verifies navigation back to the top after scrolling down.
	 *
	 * @Test_Case NV_US05_TC02
	 * @author Ashish Kumar
	 */
	public void pageScrollsToTheTop() {
		try {
			helper.addLogAndReportInfo("Step: Scrolling page to the top.", test);

			helper.scrollToTop();

			helper.addLogAndReportPass("Step Passed: Page scrolled to the top successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Unable to scroll page to the top.", test);

		}
	}

	/**
	 * Description: Refreshes the current page and reloads all UI elements. This
	 * action verifies that the page reloads successfully.
	 * 
	 * @Test_Case NV_US05_TC02
	 * @author Ashish Kumar
	 */
	public void refreshPage() {
		try {
			helper.addLogAndReportInfo("Step: Refreshing the current page.", test);

			helper.refreshPage();

			helper.addLogAndReportPass("Step Passed: Page refreshed successfully.", test);
		} catch (Exception e) {
			helper.addLogAndReportFail("Step Failed: Unable to refresh the page.", test);

		}
	}
}