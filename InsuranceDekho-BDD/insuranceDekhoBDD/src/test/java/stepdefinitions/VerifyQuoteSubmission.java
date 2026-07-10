package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BusinessInsuranceNewsPageActions;
import pages.HomePageActions;

public class VerifyQuoteSubmission {
	
	HomePageActions home = Hooks.homeAction;
	BusinessInsuranceNewsPageActions binAction = Hooks.binAction;

	@When("person hover over News menu")
	public void person_hover_over_news_menu() {
		home.hoverOverNews();

	}
	@When("he click on Business News")
	public void he_click_on_business_news() {
		home.clickBusinessNewsLink();

	}
	@Then("he verify Business Insurance News header is displayed")
	public void he_verify_business_insurance_news_header_is_displayed() {
		binAction.verifyBusinessInsuranceNewsHeader();

	}
	@When("he enter Name in business quote form")
	public void he_enter_name_in_business_quote_form() {
		binAction.typeName();

	}
	@When("he enter Business Name in business quote form")
	public void he_enter_business_name_in_business_quote_form() {
		binAction.typeBussinessName();

	}
	@When("he enter valid Mobile in business quote form")
	public void he_enter_valid_mobile_in_business_quote_form() {
		binAction.typeMobile();
	}
	@When("he select Product Type")
	public void he_select_product_type() {
		binAction.selectProductType();

	}
	@When("he enter Email in business quote form")
	public void he_enter_email_in_business_quote_form() {
		binAction.typeEmail();

	}
	@When("he click Get Quote button")
	public void he_click_get_quote_button() {
		binAction.clickGetQuoteButton();

	}
	@Then("he verify Thank You text is displayed for business quote")
	public void he_verify_thank_you_text_is_displayed_for_business_quote() {
		binAction.verifyThankYouText();

	}




}
