package uistore;

import org.openqa.selenium.By;


/**
 * Description: Stores all locators used on the Investment Insurance News page.
 * Includes page heading validation, advisor section navigation,
 * and city-specific advisor verification.
 *
 * @class_name InvestmentInsuranceNewsPageLocators
 * @author Ashish Kumar
 */
public class InvestmentInsuranceNewsPageLocators {
	public static final By investmentInsuranceNewsHeader = By.xpath("//h1[@class='newsh1']");
	public static final By bestInvestmentAdvisorsinYourCitySection = By.xpath("//section[@class='HomeVisitCities']/h2");
	public static final By insuranceAdvaisorinGurgaonButton = By.xpath("//section[@class='HomeVisitCities']//span[text()='Gurgaon']");
	public static final By insuranceAdvaisorinGurgaonHeader = By.xpath("//div[@class='titleGrp']/h1");
	

}
