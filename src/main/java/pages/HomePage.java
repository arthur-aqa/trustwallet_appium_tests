package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By homeNavigationButton = By.id("homeNavigationButton");

    public boolean isHomeNavigationButtonDisplayed() {
        return find(homeNavigationButton).isDisplayed();
    }

}
