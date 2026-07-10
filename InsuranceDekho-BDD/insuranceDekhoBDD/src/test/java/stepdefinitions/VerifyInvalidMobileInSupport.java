package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActions;

public class VerifyInvalidMobileInSupport {
	HomePageActions home = Hooks.homeAction;


	@When("user hover over Support menu")
	public void user_hover_over_support_menu() {
		home.hoverOverSupportNav();

	}
	@When("user click on Renew Policy")
	public void user_click_on_renew_policy() {
		home.clickOnRenewPolicy();

	}
	@When("user click on Terms and Conditions")
	public void user_click_on_terms_and_conditions() {
		home.clickOnTermsAndCondition();

	}
	@Then("user verify Terms and Conditions text is displayed")
	public void user_verify_terms_and_conditions_text_is_displayed() {
		home.verifyTandCtext();

	}
	@When("user enter invalid mobile number")
	public void user_enter_invalid_mobile_number() {
		home.typeWrongMobile();

	}
	@When("user click on Continue")
	public void user_click_on_continue() {
		home.clickOnContinue();

	}
	@Then("user verify invalid mobile number error message is displayed")
	public void user_verify_invalid_mobile_number_error_message_is_displayed() {
		home.verifyWrongMobileInput();

	}



}
