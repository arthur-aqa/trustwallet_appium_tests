package pages;

import org.openqa.selenium.By;

public class ImportMethodPage extends BasePage {

    private By SecretPhraseButton = By.id("secretPhrase");
    private By toolbarTitle = By.id("toolbarTitle");

    public ImportCheckmarksPage clickSecretPhraseButton() { 
        find(SecretPhraseButton).click();
        return new ImportCheckmarksPage();
    }

    public String getToolbarTitle() {
        return find(toolbarTitle).getText();
    }
}