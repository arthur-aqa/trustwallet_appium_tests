package pages;

import org.openqa.selenium.By;

public class WelcomePage extends BasePage {

    private By createWalletButton = By.id("CreateNewWalletButton");
    private By importWalletButton = By.id("ImportWalletButton");


    public PinCodePage clickCreateWalletButton() {
        click(createWalletButton);
        return new PinCodePage();
    }

    public PinCodePage clickImportWalletButton() {
        click(importWalletButton);
        return new PinCodePage();
    }
}
