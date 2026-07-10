package uistore;

import org.openqa.selenium.By;


/**
 * Description: Stores all locators used on the Human Life Value Calculator page.
 * Covers personal detail inputs, income selection, submission,
 * result validation, and error message verification.
 *
 * @class_name HumanLifeValuePageLocators
 * @author Ashish Kumar
 */
public class HumanLifeValuePageLocators {

	// Gender selection - Male (label based)
	public static final By maleOption = By.id("Male9dccec3e005c3");

	// Name field (usually input name or placeholder)
	public static final By nameField = By.xpath("(//div[@class='input-field']/input[@name ='name'])[2]");

	// Birthday / DOB field
	public static final By dobField = By.xpath("(//div[@class='input-field']/div/input[@name ='DatePicker'])[1]");

	// Non Smoker option (label based)
	public static final By nonSmokerOption = By.id("Non-Smoker");


			

	// Option "3-5" (for custom dropdown)
	public static final By annualIncomeOption_3to5 = By
			.id("3 Lac to 4.9 Lac");

	// Mobile field
	public static final By mobileNumberField = By
			.xpath("(//div[@class='input-field']/input[@name ='mobile'])[1]");

	// View Plans button
	public static final By viewPlansForFreeButton = By
			.xpath("(//button[@name='submitBtn' and normalize-space(.)='View Plans for Free'])[2]");

	// Result page: name displayed at top
	public static final By resultUserNameTop = By
			.xpath("//div[@class='personalDetailsV2']/div/h2");
	
	//tectcase5
	public static final By errorMesssage = By
			.xpath("//div[@class='srv-validation-message']");
	
}