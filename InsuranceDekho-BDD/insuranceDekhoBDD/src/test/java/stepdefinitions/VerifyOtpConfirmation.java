package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActions;

public class VerifyOtpConfirmation {
	HomePageActions home = Hooks.homeAction;
 

	@When("I hover over Support menu")
	public void i_hover_over_support_menu() {
		home.hoverOverSupportNav();
 
	}
	@When("I click on Renew Policy")
	public void i_click_on_renew_policy() {
		home.clickOnRenewPolicy();
 
	}
	@When("I click on Terms and Conditions")
	public void i_click_on_terms_and_conditions() {
		home.clickOnTermsAndCondition();
 
	}
	@Then("I verify Terms and Conditions text is displayed")
	public void i_verify_terms_and_conditions_text_is_displayed() {
		home.verifyTandCtext();
 
	}
	@When("I enter valid mobile number")
	public void i_enter_valid_mobile_number() {
		home.typeMobile();
 
	}
	@When("I click on Continue")
	public void i_click_on_continue() {
		home.clickOnContinue();
 
	}
	@Then("I verify OTP sent to SMS message is displayed")
	public void i_verify_otp_sent_to_sms_message_is_displayed() {
		home.verifyOtpSentToSms();
	}



	
}
