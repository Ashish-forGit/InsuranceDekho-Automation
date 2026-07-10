package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActions;
import pages.InsuranceAdvisorsActions;

public class VerifyErrorInHomeVisitAdvaisor {
	HomePageActions home = Hooks.homeAction;
	InsuranceAdvisorsActions idAction = Hooks.advAction;


	@When("I hover over a Insurance Advisors")
	public void i_hover_over_a_insurance_advisors() {
		home.hoverOverInsuranceAdvisors(); 

	}
	@When("I click Insurance a Advisors in New Delhi")
	public void i_click_insurance_a_advisors_in_new_delhi() {
		home.clickInsuranceAdvisorsInNewDelhi();

	}
	@Then("I verify Insurance a Advisors Found text is displayed")
	public void i_verify_insurance_a_advisors_found_text_is_displayed() {
		idAction.verifyInsuranceAdvisorsFoundText();

	}
	@When("I click Book Home a Visit for first advisor")
	public void i_click_book_home_a_visit_for_first_advisor() throws InterruptedException {
		idAction.clickBookHomeVisitForFirstAdvisor();

	}
	@When("I enter a invalid Name and Mobile")
	public void i_enter_a_invalid_name_and_mobile() {
		idAction.enterErrorNameAndMobile();

	}
	@When("I submit a request")
	public void i_submit_a_request() throws InterruptedException {
		idAction.submitRequest();

	}
	@Then("I verify input validation error is displayed")
	public void i_verify_input_validation_error_is_displayed() {
		idAction.verifyErrorInput();

	}




}
