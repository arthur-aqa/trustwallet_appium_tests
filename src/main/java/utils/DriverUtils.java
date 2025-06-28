package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverUtils {

    private static AndroidDriver driver;

    public static void initializeDriver() {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("Pixel_6")
                .setPlatformName("Android")
                .setApp(System.getProperty("user.dir") + "/src/apps/android/TrustWalletApp.apk");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4725/wd/hub"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Appium server URL is invalid", e);
        }
    }

    public static AndroidDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("Driver not initialized. Please call initializeDriver first.");
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
