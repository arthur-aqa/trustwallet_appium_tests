package pages;

import org.openqa.selenium.By;

public class MultiCoinWalletImportPage extends BasePage {

    private By toolbarTitle = By.id("toolbarTitle");
    private By secretPhraseField = By.id("secretPhraseField");
    private By restoreWalletButton = By.id("restoreWalletButton");
    private By toastMessage = By.xpath("//android.widget.Toast[@text='Invalid mnemonic phrase']");


    public String getToolbarTitle() {
        return getText(toolbarTitle);
    }

    public void enterSecretPhrase(String seedPhrase) {
        find(secretPhraseField).sendKeys(seedPhrase);
    }

    public void clickRestoreWalletButton() {
        find(restoreWalletButton).click();
    }

    public String getSecretPhrase() {
        return getText(secretPhraseField);
    }

    public boolean isToastDisplayed() {
        return isDisplayed(toastMessage);
    }
}
