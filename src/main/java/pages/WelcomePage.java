package pages;

import org.openqa.selenium.By;

public class WelcomePage extends BasePage {

    private By createWalletButton = By.id("CreateNewWalletButton");
    private By importWalletButton = By.id("ImportWalletButton");


    public PassCodePage clickCreateWalletButton() {
        click(createWalletButton);
        return new PassCodePage();
    }

    public PassCodePage clickImportWalletButton() {
        click(importWalletButton);
        return new PassCodePage();
    }
}
