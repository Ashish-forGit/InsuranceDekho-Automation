package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BikeClaimSettlementPageActions;
import pages.HomePageActions;

public class VerifyAndCalculateBikeIdv {
	HomePageActions home = Hooks.homeAction;
	BikeClaimSettlementPageActions bikeAction = Hooks.bikeClaimAction;


	@When("I hover on Bike Insurance menu")
	public void i_hover_on_bike_insurance_menu() {
		home.hoverOnInsuranceMenu();
		home.hoverOnBikeInsuranceMenu();

	}
	@When("I click on Claim Settlement")
	public void i_click_on_claim_settlement() {
		home.clickOnClaimSettlement();

	}
	@Then("I verify Bike Insurance Claim heading is present")
	public void i_verify_bike_insurance_claim_heading_is_present() {
		bikeAction.verifyBikeInsuranceClaimHeadingIsPresent();

	}
	@When("I scroll to Calculate Two Wheeler IDV section")
	public void i_scroll_to_calculate_two_wheeler_idv_section() {
		bikeAction.scrollToCalculateTwoWheelerIdvSection();

	}
	@When("I select first bike brand")
	public void i_select_first_bike_brand() {
		bikeAction.selectBrandFirstOptions();

	}
	@When("I select first bike model")
	public void i_select_first_bike_model() {
		bikeAction.selectModelFirstOption();

	}
	@When("I select first bike year")
	public void i_select_first_bike_year() {
		bikeAction.selectYearFirstOption();

	}
	@Then("I calculate and verify Two Wheeler IDV amount")
	public void i_calculate_and_verify_two_wheeler_idv_amount() {
		bikeAction.clickCalculateAndVerifyIdvAmount();

	}




}
