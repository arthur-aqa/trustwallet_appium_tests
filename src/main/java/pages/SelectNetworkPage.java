package pages;

import org.openqa.selenium.By;

public class SelectNetworkPage extends BasePage {

    private By toolbarTitle = By.id("toolbarTitle");
    private By itemIcon = By.id("itemIcon");

    public String getToolbarTitle() {
        return find(toolbarTitle).getText();
    }

    public MultiCoinWalletImportPage clickItemIcon() {
        find(itemIcon).click();
        return new MultiCoinWalletImportPage();
    }

}
