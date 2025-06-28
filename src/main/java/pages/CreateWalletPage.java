package pages;

import org.openqa.selenium.By;

public class CreateWalletPage extends BasePage {

    private By createWalletButton = By.id("CreateNewWalletButton");
    private By ImportWalletButton = By.id("ImportWalletButton");

    public PinCodePage clickButton() {
        click(createWalletButton);
        return new PinCodePage();
    }
}
