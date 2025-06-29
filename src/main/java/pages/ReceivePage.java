package pages;

import org.openqa.selenium.By;

public class ReceivePage extends BasePage {

    private By receiveTitle = By.id("toolbarTitle");

    public String getReceiveTitleText() {
        return find(receiveTitle).getText();
    }
}