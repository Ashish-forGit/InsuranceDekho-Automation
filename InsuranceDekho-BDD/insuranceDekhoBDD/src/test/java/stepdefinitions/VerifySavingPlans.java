package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActions;
import pages.InvestmentPlansPageActions;

public class VerifySavingPlans {
	
	HomePageActions home = Hooks.homeAction;
	InvestmentPlansPageActions investmentPlansActions = Hooks.investmentPlansActions;

	@When("I hover over Investment menu")
	public void i_hover_over_investment_menu() {
		home.hoverOverInvestmentMenu();

	}
	@When("I click on Investment Plans")
	public void i_click_on_investment_plans() {
		home.clickOnInvestmentPlans();

	}
	@Then("I verify Best Investment Plans heading is displayed")
	public void i_verify_best_investment_plans_heading_is_displayed() {
		investmentPlansActions.verifyBestInvestmentPlansHeading();

	}
	@When("I click on Market Linked")
	public void i_click_on_market_linked() {
		investmentPlansActions.clickOnMarketLinked();

	}
	@Then("I verify Saving Plan is displayed")
	public void i_verify_saving_plan_is_displayed() {
		investmentPlansActions.verifySavingPlan();

	}




}
