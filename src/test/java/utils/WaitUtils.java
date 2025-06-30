package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WaitUtils {

    private static final int TIMEOUT = 10;

    private static WebDriverWait waitDriver() {
        return new WebDriverWait(DriverUtils.getDriver(), Duration.ofSeconds(TIMEOUT));
    }

    public static WebElement waitForVisibility(By locator) {
        return waitDriver().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickable(By locator) {
        return waitDriver().until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static boolean waitForText(By locator, String expectedText) {
        return waitDriver().until(ExpectedConditions.textToBe(locator, expectedText));
    }

    public static boolean waitForInvisibility(By locator) {
        return waitDriver().until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
}
