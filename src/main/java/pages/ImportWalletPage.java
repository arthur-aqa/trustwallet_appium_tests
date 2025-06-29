package pages;

import org.openqa.selenium.By;
import utils.WaitUtils;

public class ImportWalletPage extends BasePage {

    private By seedPhraseField = By.id("seed_phrase_field");
    private By privateKeyField = By.id("private_key_field");
    private By importButton = By.id("import_button");
    private By importMethodToggle = By.id("import_method_toggle");
    private By errorMessage = By.id("error_message");
    private By successMessage = By.id("success_message");

    public void waitForImportPageToLoad() {
        WaitUtils.waitForVisibility(seedPhraseField);
    }

    public void enterSeedPhrase(String seedPhrase) {
        find(seedPhraseField).clear();
        find(seedPhraseField).sendKeys(seedPhrase);
    }

    public void enterPrivateKey(String privateKey) {
        find(privateKeyField).clear();
        find(privateKeyField).sendKeys(privateKey);
    }

    public void switchToPrivateKeyMode() {
        click(importMethodToggle);
        WaitUtils.waitForVisibility(privateKeyField);
    }

    public void switchToSeedPhraseMode() {
        click(importMethodToggle);
        WaitUtils.waitForVisibility(seedPhraseField);
    }

    public PinCodePage clickImportButton() {
        click(importButton);
        return new PinCodePage();
    }

    public boolean isErrorMessageDisplayed(String expectedMessage) {
        try {
            String actualMessage = find(errorMessage).getText();
            return actualMessage.contains(expectedMessage);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isSuccessMessageDisplayed() {
        try {
            return find(successMessage).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
