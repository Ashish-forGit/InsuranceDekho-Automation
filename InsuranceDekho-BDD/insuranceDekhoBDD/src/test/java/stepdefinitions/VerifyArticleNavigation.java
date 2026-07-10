package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HealthInsuranceArticlePageActions;
import pages.HomePageActions;

public class VerifyArticleNavigation {
	
	HomePageActions home = Hooks.homeAction;
	HealthInsuranceArticlePageActions hiaAction = Hooks.hiaAction;



	@When("I will hover over News menu")
	public void i_will_hover_over_news_menu() {
		home.hoverOverNews();

	}
	@When("I will hover over Health Insurance News")
	public void i_will_hover_over_health_insurance_news() {
		home.hoverOverHealthInsuranceNews();

	}
	@When("I will click on Health Insurance Article")
	public void i_will_click_on_health_insurance_article() {
		home.clickHealthInsuranceArticle();

	}
	@Then("I will  verify Health Insurance Article header is displayed")
	public void i_will_verify_health_insurance_article_header_is_displayed() {
	   hiaAction.verifyHealthInsuranceArticleHeader();
	}
	@When("I will open first health insurance article")
	public void i_will_open_first_health_insurance_article() {
	    hiaAction.clickFirstArticlePresent();
	}
	@Then("I will verify news is written by author")
	public void i_will_verify_news_is_written_by_author() {
		hiaAction.verifyNewsWrittenByAuthor();

	}
	@When("I will navigate to Health Insurance Calculator")
	public void i_will_navigate_to_health_insurance_calculator() {
	    hiaAction.goToHealthInsuranceCalculator();
	}
	@When("I will enter Age")
	public void i_will_enter_age() {
	    hiaAction.typeAge();
	}
	@When("I will enter Pincode")
	public void i_will_enter_pincode() {
	    hiaAction.typePincode();
	}
	@When("I will click Calculate Price")
	public void i_will_click_calculate_price() {
	    hiaAction.clickCalculatePrice();
	}
	@When("I will enter Name")
	public void i_will_enter_name() {
	    hiaAction.typeName();
	}
	@When("I will enter Mobile Number")
	public void i_will_enter_mobile_number() {
	   hiaAction.typeMobileNumber();
	}
	@When("I will click View Plans")
	public void i_will_click_view_plans() {
	    hiaAction.clickViewPlans();
	}
	@Then("I will verify number of plans found is displayed")
	public void i_will_verify_number_of_plans_found_is_displayed() {
	    hiaAction.verifyNumberOfPlansFound();
	}




}
