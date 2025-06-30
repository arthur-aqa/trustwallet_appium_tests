package pages;

import org.openqa.selenium.By;
import utils.TestData;

public class PassCodePage extends BasePage {

    private By PassCodeText = By.xpath("//android.widget.TextView[@text='Create passcode']");
    private By errorMessage = By.xpath("//android.widget.TextView[@text='Passcode does not match']");
    private By pinDigit(char digit) {
        return By.xpath("//android.widget.TextView[@text='" + digit + "']");
    }
    public String getPassCodeText() {
        waitForVisibility(PassCodeText, 10);
        return getText(PassCodeText);
    }

    public ConfirmPasscodePage enterPasscode() {
    for (char digit : TestData.DEFAULT_PIN_CODE.toCharArray()) {
        click(pinDigit(digit));
    }
    return new ConfirmPasscodePage();
    }

    public EnableNotificationsPage confirmPasscodeNotifications() {
    for (char digit : TestData.DEFAULT_PIN_CODE.toCharArray()) {
        click(pinDigit(digit));
    }
    return new EnableNotificationsPage();
}

    public String getErrorMessage() {
        return getText(errorMessage);
}
}