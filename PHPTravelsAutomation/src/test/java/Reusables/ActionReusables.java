package Reusables;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionReusables {
    public WebDriver driver;
    static Logger logger;

    public ActionReusables(WebDriver driver) {
        logger = Logger.getLogger(OneWayTripTest.class);
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void safePause() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            logger.info("Exception in safe pause");
        }
    }

    public void openURL(String URL) {
        try {
            driver.get(URL);
        } catch (NoSuchElementException exception) {
            logger.info("");
        }
        ;
    }

    public boolean isElementPresent(WebElement element) {
        boolean value = false;
        try {
            value = element.isDisplayed();
        } catch (NoSuchElementException exception) {
            logger.info("Element not displayed in DOM");
        }
        return value;
    }

    public void sendText(WebElement element, String text) {
        if (isElementPresent(element)) {
            element.clear();
            element.sendKeys(text);
        } else {
            logger.info("Element is not present in the webpage to send text.");
        }
    }

    public void click(WebElement element) {
        if (isElementPresent(element)) {
            element.click();
        } else {
            logger.info("Element is not present in the webpage to perform click action.");
        }
    }

    public String getTextFromElement(WebElement element) {
        String text = null;
        if (isElementPresent(element)) {
            text = element.getText();
        } else {
            logger.info("Element is not present in the webpage to get the text.");
        }
        return text;
    }

    public void clickUsingJavaScriptExecutor(WebElement element) {
        if (isElementPresent(element)) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
        } else {
            logger.info("Element is not present in the webpage to perform click action.");
        }
    }
}
