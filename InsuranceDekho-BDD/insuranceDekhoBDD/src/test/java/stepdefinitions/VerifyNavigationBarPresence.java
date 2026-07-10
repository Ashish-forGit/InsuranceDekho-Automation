package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActions;

public class VerifyNavigationBarPresence {
	HomePageActions home = Hooks.homeAction;


	@Then("I verify navigation bar is displayed in home page")
	public void i_verify_navigation_bar_is_displayed_in_home_page() {
		home.verifyNavigationBarIsDisplayed();

	}
	@When("I hover over  Insurance menu")
	public void i_hover_over_insurance_menu() {
		home.hoverOnInsuranceMenu();

	}
	@When("I click on the Term Insurance link")
	public void i_click_on_the_term_insurance_link() {
		home.clcikTermInsuranceLink();

	}
	@Then("I verify navigation bar is displayed on term insurance page")
	public void i_verify_navigation_bar_is_displayed_on_term_insurance_page() {
		home.verifyNavigationBarIsDisplayed();

	}
	@When("I hover over Insurance Advisors in navigation bar")
	public void i_hover_over_insurance_advisors_in_navigation_bar() {
		home.hoverOverInsuranceAdvisors();

	}
	@When("I click Insurance Advisors in New Delhi from list")
	public void i_click_insurance_advisors_in_new_delhi_from_list() {
		home.clickInsuranceAdvisorsInNewDelhi();

	}
	@Then("I again verify navigation bar is displayed in advisor page")
	public void i_again_verify_navigation_bar_is_displayed_in_advisor_page() {
		home.verifyNavigationBarIsDisplayed();

	}
	@When("i start hovering over news")
	public void i_start_hovering_over_news() {
		home.hoverOverNews();

	}
	@When("i click on the Travel Insurance Link")
	public void i_click_on_the_travel_insurance_link() {
		home.clickTravelInsuranceLink();

	}
	@Then("verify Navigation bar is present in travel insurance page")
	public void verify_navigation_bar_is_present_in_travel_insurance_page() {
		home.verifyNavigationBarIsDisplayed();

	}
	@When("i click on first article present in travel insurance page")
	public void i_click_on_first_article_present_in_travel_insurance_page() {
		home.clickFirstArticleInTravelInsuranceArticle();

	}
	@Then("at last again verify navigation bar is displayed")
	public void at_last_again_verify_navigation_bar_is_displayed() {
		home.verifyNavigationBarIsDisplayed();

	}




}
