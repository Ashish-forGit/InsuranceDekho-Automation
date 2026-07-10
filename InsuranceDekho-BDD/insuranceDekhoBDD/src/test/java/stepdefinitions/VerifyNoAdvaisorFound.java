package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActions;
import pages.InsuranceAdvisorsActions;

public class VerifyNoAdvaisorFound {
	HomePageActions home = Hooks.homeAction;
	InsuranceAdvisorsActions idAction = Hooks.advAction;

	@When("we hover over Insurance Advisors")
	public void we_hover_over_insurance_advisors() {
		home.hoverOverInsuranceAdvisors();

	}
	@When("we click Insurance Advisors in New Delhi")
	public void we_click_insurance_advisors_in_new_delhi() {
		home.clickInsuranceAdvisorsInNewDelhi();

	}
	@When("we select a city filter with no advisors")
	public void we_select_a_city_filter_with_no_advisors() {
		idAction.selectCityFilter();

	}
	@Then("we verify location header and No Advisor Found message is displayed")
	public void we_verify_location_header_and_no_advisor_found_message_is_displayed() {
		idAction.verifyLocationHeaderAndNotFoundAdvaisor();

	}




}
