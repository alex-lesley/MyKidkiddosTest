package pages;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class BasePage {
    protected static WebDriver webDriver;
    protected static WebDriverWait wait;
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 5);
    }

    protected String getCurrentPageURL() {
        return webDriver.getCurrentUrl();
    }

    protected WebElement findElementByXpath(String xpath) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        WebElement webElement = webDriver.findElement(By.xpath(xpath));
        return webElement;
    }

    protected void clickElementByXpath(String xpath) {
        logger.info("Clicking element with xpath: " + xpath);
        findElementByXpath(xpath).click();
    }

    protected void sendTextToElementByXpath(String xpath, String text) {
        logger.info("Sending text to element with xpath: " + xpath);
        findElementByXpath(xpath).sendKeys(text);
    }

    protected String getTextFromElementByXpath(String xpath) {
        return findElementByXpath(xpath).getAttribute("value");
    }

    protected boolean isElementExistByXpath(String xpath) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            webDriver.findElement(By.xpath(xpath));
            return true;
        } catch (Exception err) {
            return false;
        }
    }

    public void takeScreenshot(String fileName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("Screenshots/" + fileName + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
