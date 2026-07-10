package uistore;

import org.openqa.selenium.By;

/**
 * Description: Stores all locators used on the Bike Claim Settlement page.
 * Includes heading validation, IDV section, dropdown selections, calculate
 * action, and IDV amount result verification.
 *
 * @class_name BikeClaimSettlementPageLocators
 * @author Ashish Kumar
 */

public class BikeClaimSettlementPageLocators {

	public static final By bikeInsuranceClaimHeading = By.xpath("//h1[@content='Bike Insurance Claim ']");

	public static final By calculateTwoWheelerIdvSection = By
			.xpath("(//div[@class='gsc_container']/div[@class='gsc_row'])[4]");

	public static final By selectBrandDropdown = By.id("oem_id");

	public static final By firstBrand = By.xpath("//div[@class='gs_ta_results']/ul/li[1]");

	public static final By selectModelDropdown = By.id("modelId");

	public static final By firstModel = By.xpath("//div[@class='gs_ta_results']/ul/li[1]");

	public static final By selectYearDropdown = By.id("Year_id");

	public static final By firstYear = By.xpath("//div[@class='gs_ta_results']/ul/li[1]");
	public static final By calculateButton = By.xpath("(//button[@name='submitBtn'])[3]");

	public static final By idvAmountText = By.xpath("//span[@class='rupees-f16']");

}