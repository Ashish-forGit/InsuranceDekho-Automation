package uistore;

import org.openqa.selenium.By;


/**
 * Description: Stores all locators used on the Business Insurance News page.
 * Covers heading validation, quote form inputs, submission action,
 * and validation messages.
 *
 * @class_name BusinessInsuranceNewsLocators
 * @author Ashish Kumar
 */

public class BusinessInsuranceNewsLocators {
	public static final By investmentInsuranceNewsHeader = By.xpath("//h1[@class='newsh1']");
	public static final By nameInput = By.id("name");
	public static final By businessNameInput = By.id("businessName");
	public static final By mobileInput = By.id("mobile");
	public static final By productTypeDropdown = By.id("productType");
	public static final By firstProduct = By.xpath("//li[text()='Fire & Burglary']");
	
	public static final By emailInputField = By.id("email");
	public static final By getAQuoteButton = By.xpath("//button[normalize-space()='Get A Quote']");
	public static final By tempScroell = By.xpath("(//div[@class='card card_news shadowWPadding'])[16]");
	
	public static final By thankYouText = By.xpath("//div[@class='app-content']//h2");
	public static final By invalidMobileNumberText = By.id("mobile-helper-text");
	
}
