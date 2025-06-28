package pages;

import org.openqa.selenium.By;

public class WalletIsReadyPage extends BasePage {

    private By walletReadyMessage = By.xpath("//android.widget.TextView[@text='Brilliant, your wallet is ready!']");
    private By skipLaterButton = By.xpath("//android.widget.TextView[@text=\"Skip, I'll do it later\"]");



    public String getWalletReadyMessage() {
        return find(walletReadyMessage).getText();
    }

    public HomePage clickButton() {
        click(skipLaterButton);
        return new HomePage();
    }

}
