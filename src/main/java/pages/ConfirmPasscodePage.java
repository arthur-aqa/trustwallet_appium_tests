package pages;

import org.openqa.selenium.By;
import utils.TestData;
public class ConfirmPasscodePage extends BasePage {

    private By confirmPasscodeText = By.xpath("//android.widget.TextView[@text='Confirm passcode']");
    private By pinDigit(char digit) {
        return By.xpath("//android.widget.TextView[@text='" + digit + "']");
    }

    public String getConfirmPasscodeText() {
        waitForVisibility(confirmPasscodeText, 10);
        return getText(confirmPasscodeText);
    }

    public ImportMethodPage confirmPasscodeImport() {
        for (char digit : TestData.DEFAULT_PIN_CODE.toCharArray()) {
            click(pinDigit(digit));
        }
        return new ImportMethodPage();
    }
}
