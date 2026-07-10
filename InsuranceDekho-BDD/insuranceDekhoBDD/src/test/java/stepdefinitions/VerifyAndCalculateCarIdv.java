package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddOnCoverPageActions;
import pages.HomePageActions;

public class VerifyAndCalculateCarIdv {
	HomePageActions home = Hooks.homeAction;
	AddOnCoverPageActions addOnCover = Hooks.addOnCoverAction;
	


	@When("I hover on Car Insurance menu")
	public void i_hover_on_car_insurance_menu() {
		home.hoverOnInsuranceMenu();
		home.hoverOnCarInsuranceMenu();

	}
	@When("I click on Add On Cover")
	public void i_click_on_add_on_cover() {
		
		home.clickOnAddOnCover();

	}
	@When("I scroll to Calculate your Car IDV section")
	public void i_scroll_to_calculate_your_car_idv_section() {
		addOnCover.scrollToCalculateCarIdvSection();
		

	}
	@When("I select first brand")
	public void i_select_first_brand() {
		addOnCover.selectBrandFirstOption();
	}
	@When("I select first model")
	public void i_select_first_model() {
		addOnCover.selectModelFirstOption();
	}
	@When("I select first year")
	public void i_select_first_year() {
		addOnCover.selectYearFirstOption();

	}
	@When("I click Calculate Amount")
	public void i_click_calculate_amount() {
		addOnCover.clickCalculateAmount();

	}
	@Then("I verify IDV amount is displayed")
	public void i_verify_idv_amount_is_displayed() {
		addOnCover.verifyAmountPresent();

	}



}
