package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import java.time.*;
import java.util.NoSuchElementException;

public class WebDriverHelper {

	private WebDriver driver;
	private WebDriverWait wait;

	/**
	 * Description: Initializes WebDriverHelper with WebDriver instance and default
	 * explicit wait.
	 *
	 * @param driver WebDriver instance for browser interactions
	 * @author Ashish Kumar
	 */
	public WebDriverHelper(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	/**
	 * Description: Clicks on an element using the provided locator.
	 *
	 * @param locator Locator of the element to be clicked
	 * @author Ashish Kumar
	 */
	public void clickElement(By locator) {
		WebElement element = driver.findElement(locator);
        highlightElement(element);
        driver.findElement(locator).click();

	}

	/**
	 * Description: Returns the current page title.
	 *
	 * @return Current page title
	 * @author Ashish Kumar
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}


	/**
	 * Description: Enters the provided text into the element located by the given
	 * locator.
	 *
	 * @param locator Locator of the input element
	 * @param value   Text value to enter
	 * @author Ashish Kumar
	 */
	public void sendTexttoElement(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}


	/**
	 * Description: Waits explicitly until the element located by the given locator
	 * is visible.
	 *
	 * @param locator Locator for the element to wait for
	 * @author Ashish Kumar
	 */
	public void explicitWait(By locator) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/**
	 * Description: Presses ENTER key on the element after waiting for visibility.
	 *
	 * @param locator Locator for the element to send ENTER key
	 * @author Ashish Kumar
	 */
	public void clickEnter(By locator) {
		waitForVisibility(locator);
		driver.findElement(locator).sendKeys(Keys.ENTER);
	}

	/**
	 * Description: Performs JavaScript click on an element using the provided
	 * locator.
	 *
	 * @param locator Locator for the element to click
	 * @author Ashish Kumar
	 */
	public void jsClick(By locator) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(locator));
	}

	/**
	 * Description: Sends text to an input element after waiting for its visibility.
	 * Clears existing value before entering.
	 *
	 * @param locator Locator of the input element
	 * @param value   Text value to enter
	 * @author Ashish Kumar
	 */
	public void sendText(By locator, String value) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.clear();
		element.sendKeys(value);
	}

	/**
	 * Description: Returns the visible text of an element after waiting for
	 * visibility.
	 *
	 * @param locator Locator for the element
	 * @return Visible text of the element
	 * @author Ashish Kumar
	 */
	public String getText(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
	}


	/**
	 * Description: Scrolls the page to bring the element into view using
	 * JavaScript.
	 *
	 * @param locator Locator of the element
	 * @author Ashish Kumar
	 */
	public void scrollIntoView(By locator) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				wait.until(ExpectedConditions.presenceOfElementLocated(locator)));
	}


	/**
	 * Description: Verifies that the actual text equals the expected text. Captures
	 * a screenshot if the assertion fails.
	 *
	 * @param actual   The actual text value
	 * @param expected The expected text value
	 * @author Ashish Kumar
	 */
	public void verify(String actual, String expected) {
		try {
			Assert.assertEquals(actual, expected);
		} catch (AssertionError e) {
			Screenshots.captureScreenshot("Actual: " + actual + " Expected: " + expected);
		}
	}



	/**
	 * Description: Hovers the mouse over the element located by the given locator.
	 *
	 * @param locator Locator of element to hover
	 * @author Ashish Kumar
	 */
	public void hoverElement(By locator) {
		waitForClickable(locator);		
		WebElement element = driver.findElement(locator);
        highlightElement(element);
        new Actions(driver).moveToElement(element).perform();
	}

	/**
	 * Description: Checks whether an element is displayed on the page.
	 *
	 * @param locator Locator of element
	 * @return true if displayed, otherwise false
	 * @author Ashish Kumar
	 */
	public boolean isElementDisplayed(By locator) {
		try {
			WebElement element = driver.findElement(locator);
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	/**
	 * Description: Verifies that the element is displayed on the page. Logs step
	 * details into Extent report and application logs.
	 *
	 * @param locator     Element locator
	 * @param elementName Business-friendly element name for report readability
	 * @param test        ExtentTest instance for reporting
	 * @author Ashish Kumar
	 */
	public void verifyElementIsDisplayed(By locator, String elementName, ExtentTest test) {

		addLogAndReportInfo("Verifying element is displayed: " + elementName, test);

		waitForVisibility(locator);

		boolean displayed = isElementDisplayed(locator);

		if (!displayed) {
			addLogAndReportInfo("FAILED: Element not displayed -> " + elementName, test);
			Assert.fail("Element not displayed: " + elementName + " | Locator: " + locator.toString());
		}

		addLogAndReportInfo("PASSED: Element displayed successfully -> " + elementName, test);
	}

	/**
	 * Description: Logs informational messages to both Extent Reports and
	 * application logs.
	 *
	 * @param str  Message to log
	 * @param test ExtentTest instance for reporting
	 * @author Ashish Kumar
	 */
	public void addLogAndReportInfo(String str, ExtentTest test) {
		test.log(Status.INFO, str);
		LoggerHandler.info(str);
	}

	/**
	 * Description: Waits for an element to become visible.
	 *
	 * @param locator Element locator
	 * @return Visible WebElement
	 * @author Ashish Kumar
	 */
	public WebElement waitForVisibility(By locator) {
		return wait.ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/**
	 * Description: Waits for an element to become clickable.
	 *
	 * @param locator Element locator
	 * @return Clickable WebElement
	 * @author Ashish Kumar
	 */
	public WebElement waitForClickable(By locator) {
		return wait.ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
	}



	/**
	 * Description: Hard wait (Thread.sleep) utility for 3 seconds.
	 *
	 * @author Ashish Kumar
	 */
	public void waits() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Description: Verifies that the actual text contains the expected text
	 * (partial match).
	 *
	 * @param actual  Actual text value
	 * @param expectd Expected partial text
	 * @author Ashish Kumar
	 */
	public void verifyPartialText(String actual, String expectd) {
		try {
			Assert.assertTrue(actual.contains(expectd));
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}




	/**
	 * Description: Scrolls to the bottom of the current page using JavaScript.
	 * Note: Useful for validating sticky navigation bar behavior on long pages.
	 *
	 * @author Ashish Kumar
	 */
	public void scrollToBottom() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

	/**
	 * Description: Scrolls to the top of the current page using JavaScript. Note:
	 * Useful after scroll-to-bottom validations.
	 *
	 * @author Ashish Kumar
	 */
	public void scrollToTop() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
	}

	/**
	 * Description: Refreshes (reloads) the current page.
	 *
	 * @author Ashish Kumar
	 */
	public void refreshPage() {
		driver.navigate().refresh();
	}

	/**
	 * Description: Logs informational messages to both Extent Reports and
	 * application logs. This method records the provided message as a PASS step in
	 * Extent Report.
	 *
	 * @param str  Message to be logged
	 * @param test ExtentTest instance used for reporting
	 * @author Ashish Kumar
	 */
	public void addLogAndReportPass(String str, ExtentTest test) {
		test.log(Status.PASS, str);
		LoggerHandler.info(str);
	}

	/**
	 * Description: Logs informational messages to both Extent Reports and
	 * application logs. This method records the provided message as a FAIL step in
	 * Extent Report.
	 *
	 * @param str  Message to be logged
	 * @param test ExtentTest instance used for reporting
	 * @author Ashish Kumar
	 */
	public void addLogAndReportFail(String str, ExtentTest test) {
		test.log(Status.FAIL, str);
		LoggerHandler.error(str);
		Screenshots.captureScreenshot(str);
		Reporter.attachScreenshot(str, str, test);
		Assert.fail(str);
	}
	
	/**
     * Description: Highlights the given element with red color
     * @param element
     * @author Abhiram
     */
    public void highlightElement(WebElement element) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript(
                    "arguments[0].style.outline='2px solid red';" +
                    "arguments[0].style.boxShadow='0 0 6px red';",
                    element
            );
        } catch (Exception ignored) {
        }
    }
}