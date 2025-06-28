package pages;

import org.openqa.selenium.By;

public class EnableNotificationsPage extends BasePage {


    private By marketTitle = By.xpath("//android.widget.TextView[@text='Keep up with the market!']");
    private By skipButton = By.id("secondaryAction");
    

    public String getMarketTitle() {
        return find(marketTitle).getText();
    }

    public WalletIsReadyPage clickButton() {
        click(skipButton);
        return new WalletIsReadyPage();
    }

}