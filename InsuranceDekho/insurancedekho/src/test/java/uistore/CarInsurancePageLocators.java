package uistore;

import org.openqa.selenium.By;


/**
 * Description: Stores locators used on the Car Insurance landing page.
 * Mainly used to validate the Car Insurance page heading.
 *
 * @class_name CarInsurancePageLocators
 * @author Ashish Kumar
 */

public class CarInsurancePageLocators {
    public static final By carInsuranceHeading  =
            By.xpath("//div[@class='hometop topDescription']/div/h1");

}
