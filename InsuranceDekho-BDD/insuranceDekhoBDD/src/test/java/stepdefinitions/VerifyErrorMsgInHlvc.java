package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActions;
import pages.HumanLifeValuePageActions;

public class VerifyErrorMsgInHlvc {
	HomePageActions home = Hooks.homeAction;
	HumanLifeValuePageActions hlvAction = Hooks.hlvAction;
	


	@When("I enter Name in HLV form")
	public void i_enter_name_in_hlv_form() {
		hlvAction.enterName();

	}
	@When("I enter Birthday in HLV form")
	public void i_enter_birthday_in_hlv_form() {
		hlvAction.enterBirthday();

	}
	@When("I select Annual Income in HLV form")
	public void i_select_annual_income_in_hlv_form() {
		hlvAction.selectAnnualIncome();

	}
	@When("I enter Mobile Number in HLV form")
	public void i_enter_mobile_number_in_hlv_form() {
		hlvAction.enterMobileNumber();

	}
	@Then("I verify HLV error message is displayed")
	public void i_verify_hlv_error_message_is_displayed() {
		hlvAction.verifyerrorMessageDisplayed();

	}




}
