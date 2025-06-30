package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class BasePage {
    protected AppiumDriver driver;
    
    public BasePage() {
        this.driver = DriverUtils.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    protected WebElement find(By locator) {
        waitForVisibility(locator, 10);
        return driver.findElement(locator);
    }
    protected void set(By locator, String text) {
        waitForVisibility(locator, 10);
        find(locator).clear();
        find(locator).sendKeys(text);
    }
    public void click(By locator) {
        waitForClickable(locator, 10);
        find(locator).click();
    }

    public String getText(By locator) {
        waitForVisibility(locator, 10);
        return find(locator).getText();
    }

    public boolean isDisplayed(By locator) {
        waitForVisibility(locator, 10);
        return find(locator).isDisplayed();
    }

    protected void waitForVisibility(By locator, int seconds) {
        new WebDriverWait(driver, Duration.ofSeconds(seconds))
            .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForClickable(By locator, int seconds) {
        new WebDriverWait(driver, Duration.ofSeconds(seconds))
            .until(ExpectedConditions.elementToBeClickable(locator));
    }
}
