package uistore;

import org.openqa.selenium.By;


/**
 * Description: Stores all locators used on the Investment Plans page.
 * Includes page heading validation, plan category navigation,
 * and investment plan content verification.
 *
 * @class_name InvestmentPlansPageLocators
 * @author Ashish Kumar
 */

public class InvestmentPlansPageLocators {
	
	public static final By bestInvestmentPlansHeading = By.xpath("//h1[@content='Best Investment Plans in India 2026']");
	public static final By markedLinkedLink = By.linkText("Market Linked");
	public static final By savingPlanText = By.xpath("(//div[@class='invPlanLogo']/h2)[3]");
	
}
