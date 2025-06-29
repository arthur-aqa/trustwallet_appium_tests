package tests.CreateWallet;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import tests.Base.BaseTest;
import utils.TestData;

public class CreateWalletTests extends BaseTest {

    @Test(description = "Creating a new wallet")
    public void testCreateWallet() {
        pinCodePage = createWalletPage.clickButton();
        String actualTitle = pinCodePage.getPassCodeText();
        Assert.assertEquals(actualTitle, TestData.CREATE_PASSCODE_TEXT);
        
        pinCodePage.enterPinCode();
        String confirmPasscodeText = pinCodePage.getConfirmPasscodeText();
        Assert.assertEquals(confirmPasscodeText, TestData.CONFIRM_PASSCODE_TEXT);

        pinCodePage.enterPinCode();
        String enableNotificationsTitle = enableNotificationsPage.getMarketTitle();
        Assert.assertEquals(enableNotificationsTitle, TestData.MARKET_TITLE_TEXT);

        String walletReadyMessage = walletReadyPage.getWalletReadyMessage();
        Assert.assertEquals(walletReadyMessage, TestData.WALLET_READY_MESSAGE);
        HomePage homePage = walletReadyPage.clickButton();
        Assert.assertTrue(homePage.isHomeNavigationButtonDisplayed());
    }
}