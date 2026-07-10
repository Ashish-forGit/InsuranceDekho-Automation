package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BusinessInsuranceNewsPageActions;
import pages.HomePageActions;

public class VerifyValidationInQuote {

	HomePageActions home = Hooks.homeAction;
	BusinessInsuranceNewsPageActions binAction = Hooks.binAction;

	@When("we hover over News menu")
	public void we_hover_over_news_menu() {
		home.hoverOverNews();

	}
	@When("we click on Business News")
	public void we_click_on_business_news() {
		home.clickBusinessNewsLink();

	}
	@Then("we verify Business Insurance News header is displayed")
	public void we_verify_business_insurance_news_header_is_displayed() {
		binAction.verifyBusinessInsuranceNewsHeader();

	}
	@When("we enter Name in business quote form")
	public void we_enter_name_in_business_quote_form() {
		binAction.typeName();

	}
	@When("we enter Business Name in business quote form")
	public void we_enter_business_name_in_business_quote_form() {
		binAction.typeBussinessName();

	}
	@When("we enter invalid Mobile in business quote form")
	public void we_enter_invalid_mobile_in_business_quote_form() {
		binAction.typeWrongMobile();

	}
	@When("we select Product Type")
	public void we_select_product_type() {
		binAction.selectProductType();

	}
	@When("we enter Email in business quote form")
	public void we_enter_email_in_business_quote_form() {
		binAction.typeEmail();

	}
	@Then("we verify business quote error message is displayed")
	public void we_verify_business_quote_error_message_is_displayed() {
		binAction.verifyErrorMessage();

	}



}
