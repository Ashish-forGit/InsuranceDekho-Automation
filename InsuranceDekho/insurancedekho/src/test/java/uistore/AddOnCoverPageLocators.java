package uistore;

import org.openqa.selenium.By;

/**
 * Description: Stores all locators used in the "Calculate Your Car IDV" section
 * under Add On Cover. Helps in selecting car brand, model, year, and validating
 * the calculated IDV amount.
 *
 * @author Ashish Kumar
 */

public class AddOnCoverPageLocators {
	public static final By calculateCarIdvSection = By
			.xpath("(//div[@class='gsc_container']/div[@class='gsc_row'])[4]");

	public static final By selectBrandDropdown = By.id("oem_id");

	public static final By firstBrand = By.xpath("//div[@data-typeahead-container='oem_id']/div/ul/li[1]");

	public static final By selectModelDropdown = By.xpath("//input[@id='modelId']");

	public static final By firstModel = By.xpath("//li[@data-value='3074']");

	public static final By selectYearDropdown = By.cssSelector("#Year_id");

	public static final By firstYear = By.xpath("//li[@data-value='2023']");

	public static final By calculateButton = By.xpath("(//button[@name='submitBtn'])[3]");

	public static final By idvAmountText = By.xpath("//span[@class='rupees-f16']");
}