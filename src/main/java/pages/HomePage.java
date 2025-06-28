package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By homeNavigationButton = By.id("HomeNavigationButton");
    private By continueButton = By.xpath("(//android.view.View[@clickable='true'])[3]");


    public boolean isHomeNavigationButtonDisplayed() {
        return find(homeNavigationButton).isDisplayed();
}

    public ReceivePage clickButton() {
        click(continueButton);
        return new ReceivePage();
    }

}
