package pages;

import org.openqa.selenium.By;
import utils.TestData;

public class PinCodePage extends BasePage {

    private By PassCodeText = By.xpath("//android.widget.TextView[@text='Create passcode']");
    private By confirmPasscodeText = By.xpath("//android.widget.TextView[@text='Confirm passcode']");
    private By errorMessage = By.
    private By pinDigit(char digit) {
        return By.xpath("//android.widget.TextView[@text='" + digit + "']");
    }
    public String getPassCodeText() {
        return find(PassCodeText).getText();
    }

    public String getConfirmPasscodeText() {
        return find(confirmPasscodeText).getText();
    }

   public void enterPinCode() {
    for (char digit : TestData.DEFAULT_PIN_CODE.toCharArray()) {
        click(pinDigit(digit));
    }
}

    public String getErrorMessage() {
        return find(errorMessage).getText();
}
}