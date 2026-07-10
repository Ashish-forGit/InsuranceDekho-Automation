package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActions;
import pages.InsuranceAdvisorsActions;

public class VerifyBookHomeVisitNavigation {
	HomePageActions home = Hooks.homeAction;
	InsuranceAdvisorsActions idAction = Hooks.advAction;


	@When("I click Book Home Visit")
	public void i_click_book_home_visit() throws InterruptedException {
		idAction.clickBookHomeVisit();

	}
	@When("I click Schedule Home Visit")
	public void i_click_schedule_home_visit() throws InterruptedException {
		idAction.clickScheduleHomeVisit();

	}
	@When("I click Schedule Visit")
	public void i_click_schedule_visit() throws InterruptedException {
		idAction.clickScheduleVisit();

	}
	@When("I click Enter Location Manually")
	public void i_click_enter_location_manually() {
		idAction.clickEnterLoactionManually();

	}
	@Then("I verify Your Location Details section is displayed")
	public void i_verify_your_location_details_section_is_displayed() {
		idAction.verifyYourLoactionDetails();

	}
	@When("I enter Pincode")
	public void i_enter_pincode() {
		idAction.typePincode();

	}
	@When("I enter House Number")
	public void i_enter_house_number() {
		idAction.typeHouseNo();

	}
	@When("I enter Area")
	public void i_enter_area() {
		idAction.typeArea();
	}




}
