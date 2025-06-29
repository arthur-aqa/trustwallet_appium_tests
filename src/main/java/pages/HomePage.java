package pages;

import org.openqa.selenium.By;
import utils.WaitUtils;

public class HomePage extends BasePage {

    private By homeNavigationButton = By.id("HomeNavigationButton");
    private By continueButton = By.xpath("(//android.view.View[@clickable='true'])[3]");
    private By sendButton = By.id("send_button");

    public boolean isHomeNavigationButtonDisplayed() {
        return find(homeNavigationButton).isDisplayed();
    }

    public ReceivePage clickButton() {
        click(continueButton);
        return new ReceivePage();
    }

    public SendPage clickSendButton() {
        WaitUtils.waitForClickable(sendButton).click();
        return new SendPage();
    }

}
