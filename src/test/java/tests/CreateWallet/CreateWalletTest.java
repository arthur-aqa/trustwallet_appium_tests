package tests.CreateWallet;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.PinCodePage;
import tests.Base.BaseTest;

public class CreateWalletTest extends BaseTest {

    @Test(description = "Creating a new wallet")
    public void testCreateWallet() {
        PinCodePage pinCodePage = createWalletPage.clickButton();
        String actualTitle = pinCodePage.getPassCodeText();
        Assert.assertEquals(actualTitle, "Create passcode");
        
        pinCodePage.enterPinCode("123456");
        String confirmPasscodeText = pinCodePage.getConfirmPasscodeText();
        Assert.assertEquals(confirmPasscodeText, "Confirm passcode");

        pinCodePage.enterPinCode("123456");
        String enableNotificationsTitle = enableNotificationsPage.getMarketTitle();
        Assert.assertEquals(enableNotificationsTitle, "Keep up with the market!");

        String walletReadyMessage = walletIsReadyPage.getWalletReadyMessage();
        Assert.assertEquals(walletReadyMessage, "Brilliant, your wallet is ready!");
        HomePage homePage = walletIsReadyPage.clickButton();
        Assert.assertTrue(homePage.isHomeNavigationButtonDisplayed());


    }

}