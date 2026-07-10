package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActions;
import pages.InsuranceAdvisorsActions;

public class VerifyErrorMsgBookHomeVisit {
	HomePageActions home = Hooks.homeAction;
	InsuranceAdvisorsActions idAction = Hooks.advAction;
	
	 

	@When("user hover over Insurance Advisors")
	public void user_hover_over_insurance_advisors() {
		home.hoverOverInsuranceAdvisors();
 
	}
	@When("user click Insurance Advisors in New Delhi")
	public void user_click_insurance_advisors_in_new_delhi() {
		home.clickInsuranceAdvisorsInNewDelhi();
	 
	}
	@When("user click Book Home Visit")
	public void user_click_book_home_visit() throws InterruptedException {
		idAction.clickBookHomeVisit();
 
	}
	@When("user click Schedule Home Visit")
	public void user_click_schedule_home_visit() throws InterruptedException {
		idAction.clickScheduleHomeVisit();
 
	}
	@When("user enter valid Name and Mobile")
	public void user_enter_valid_name_and_mobile() {
		idAction.enterNameAndMobile();
 
	}
	@When("user click Schedule Visit")
	public void user_click_schedule_visit() throws InterruptedException {
		idAction.clickScheduleVisit();
 
	}
	@When("user click Enter Location Manually")
	public void user_click_enter_location_manually() {
		idAction.clickEnterLoactionManually();
	}
	@When("user enter Pincode")
	public void user_enter_pincode() {
		idAction.typePincode();
	  
	}
	@When("user enter House Number")
	public void user_enter_house_number() {
		idAction.typeHouseNo();
 
	}
	@When("user click Schedule Visit on location form")
	public void user_click_schedule_visit_on_location_form() {
		idAction.clickLocationScheduleVisit();
 
	}
	@Then("user verify Area input error message is displayed")
	public void user_verify_area_input_error_message_is_displayed() {
		idAction.verifyAreaInputError();
	  
	}




}
