package pages;

import org.openqa.selenium.By;

public class ImportCheckmarksPage extends BasePage {

    private By title = By.id("title");
    private By consentCheck1 = By.id("SecretPhraseImportConsentCheck1");
    private By consentCheck2 = By.id("SecretPhraseImportConsentCheck2");
    private By consentCheck3 = By.id("SecretPhraseImportConsentCheck3");
    private By continueButton = By.id("buttonTitle");


    public void clickConsentCheck1() {
        find(consentCheck1).click();
    }

    public void clickConsentCheck2() {
        find(consentCheck2).click();
    }

    public void clickConsentCheck3() {
        find(consentCheck3).click();
    }

    public String getTitle() {
        return getText(title);
    }

    public SelectNetworkPage clickContinueButton() {
        find(continueButton).click();
        return new SelectNetworkPage();
    }
}
