package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActions;
import pages.InsuranceAdvisorsActions;

public class VerifyBookHomeVisitAdvaisors {
	HomePageActions home = Hooks.homeAction;
	InsuranceAdvisorsActions idAction = Hooks.advAction;


	@When("I hover over Insurance Advisors")
	public void i_hover_over_insurance_advisors() {
		home.hoverOverInsuranceAdvisors();

	}
	@When("I click Insurance Advisors in New Delhi")
	public void i_click_insurance_advisors_in_new_delhi() {
		home.clickInsuranceAdvisorsInNewDelhi();

	}
	@Then("I verify Insurance Advisors Found text is displayed")
	public void i_verify_insurance_advisors_found_text_is_displayed() {
		idAction.verifyInsuranceAdvisorsFoundText();

	}
	@When("I click Book Home Visit for first advisor")
	public void i_click_book_home_visit_for_first_advisor() throws InterruptedException {
		idAction.clickBookHomeVisitForFirstAdvisor();

	}
	@When("I enter valid Name and Mobile")
	public void i_enter_valid_name_and_mobile() {
		idAction.enterNameAndMobile();

	}
	@When("I submit the request")
	public void i_submit_the_request() throws InterruptedException {
		idAction.submitRequest();

	}
	@Then("I verify Thank You text is displayed")
	public void i_verify_thank_you_text_is_displayed() {
		idAction.verifyThankYouText();
	}




}
