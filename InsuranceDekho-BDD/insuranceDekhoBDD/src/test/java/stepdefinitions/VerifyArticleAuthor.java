package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CarInsuranceNewsPageActions;
import pages.HomePageActions;

public class VerifyArticleAuthor {

	HomePageActions home = Hooks.homeAction;
	CarInsuranceNewsPageActions cinAction=Hooks.cinAction;


	@When("I hover over News menu")
	public void i_hover_over_news_menu() {
		home.hoverOverNews();
		

	}
	@When("I click on Car Insurance News")
	public void i_click_on_car_insurance_news() {
		home.clickCarInsuranceNews();

	}
	@Then("I verify Car Insurance News header is displayed")
	public void i_verify_car_insurance_news_header_is_displayed() {
		cinAction.verifyCarInsuranceNewsHeader();

	}
	@When("I open first news article")
	public void i_open_first_news_article() {
		cinAction.clickFirstNewsPresent();

	}
	@Then("I verify news is written by author")
	public void i_verify_news_is_written_by_author() {
		cinAction.verifyNewsWrittenByAuthor();

	}



}
