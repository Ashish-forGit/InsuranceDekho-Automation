package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActions;
import pages.InvestmentInsuranceNewsPageActions;

public class VerifyCitySpecificListing {

	
	HomePageActions home = Hooks.homeAction;
	InvestmentInsuranceNewsPageActions iinAction = Hooks.iinAction;
	


	@When("I have to hover over News menu")
	public void i_have_to_hover_over_news_menu() {
		home.hoverOverNews();

	}
	@When("I have to click on Investment News")
	public void i_have_to_click_on_investment_news() {
		home.clickInvestmentNews();;
	
	}
	@Then("I have to verify Investment Insurance News header is displayed")
	public void i_have_to_verify_investment_insurance_news_header_is_displayed() {
		iinAction.verifyInvestmentInsuranceNewsHeader();

	}
	@When("I navigate to Investment Advisors in your city")
	public void i_navigate_to_investment_advisors_in_your_city() {
		iinAction.goToInvestmentAdvisorsinYourCity();

	}
	@When("I click Gurgaon advisors")
	public void i_click_gurgaon_advisors() {
		iinAction.clickGurgaonAdvisors();

	}
	@Then("I verify Insurance Advisors in Gurgaon header is displayed")
	public void i_verify_insurance_advisors_in_gurgaon_header_is_displayed() {
		iinAction.verifyInsuranceAdvaisorsInGurgaonHeader();

	}



}
