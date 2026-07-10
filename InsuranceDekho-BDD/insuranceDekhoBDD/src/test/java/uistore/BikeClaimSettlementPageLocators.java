package uistore;

import org.openqa.selenium.By;

public class BikeClaimSettlementPageLocators {

    // Heading verification (step 3)
    public static final By bikeInsuranceClaimHeading =
            By.xpath("//h1[@content='Bike Insurance Claim ']");

    // IDV calculator section (step 4)
    public static final By calculateTwoWheelerIdvSection =
            By.xpath("(//div[@class='gsc_container']/div[@class='gsc_row'])[4]");

    // Dropdowns (step 4/5/6)
    public static final By selectBrandDropdown =
            By.id("oem_id");
    
    public static final By firstBrand =
    		By.xpath("//div[@class='gs_ta_results']/ul/li[1]");

    public static final By selectModelDropdown =
            By.id("modelId");
    
    public static final By firstModel =
    		By.xpath("//div[@class='gs_ta_results']/ul/li[1]");

    public static final By selectYearDropdown =
            By.id("Year_id");
    
    public static final By firstYear =
    		By.xpath("//div[@class='gs_ta_results']/ul/li[1]");
    
    // Calculate button
    public static final By calculateButton =
            By.xpath("(//button[@name='submitBtn'])[3]");

    // Result text containing currency
    public static final By idvAmountText =
            By.xpath("//span[@class='rupees-f16']");




}