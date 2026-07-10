package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CarInsurancePageActions;
import pages.HomePageActions;

public class VerifyCarInsuranceHeading {
	
	HomePageActions home; 
	CarInsurancePageActions car = Hooks.carAction;
	


	@Given("I launch the browser and open InsuranceDekho application")
	public void i_launch_the_browser_and_open_insurance_dekho_application() {
	 home = Hooks.homeAction;
	 
	}
	@Then("I verify InsuranceDekho is visible on the homepage")
	public void i_verify_insurance_dekho_is_visible_on_the_homepage() {
		home.verifyInsuranceDekhoIsVisible();
	 
	}
	@When("I hover on Insurance menu")
	public void i_hover_on_insurance_menu() {
		home.hoverOnInsuranceMenu();
	 
	}
	@When("I click on Car Insurance")
	public void i_click_on_car_insurance() {
		home.clickOnCarInsurance();
	 
	}
	@Then("I verify Car Insurance heading is present")
	public void i_verify_car_insurance_heading_is_present() {
	 car.verifyCarInsuranceHeadingIsPresent();
	 
	}




}
