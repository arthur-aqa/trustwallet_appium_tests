package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.PassCodePage;
import utils.TestData;

public class CreateWalletTests extends BaseTest {

    @Test(description = "Creating a new wallet")
    public HomePage testCreateWallet() {
        PassCodePage passCodePage = welcomePage.clickCreateWalletButton();
        String actualTitle = passCodePage.getPassCodeText();
        Assert.assertEquals(actualTitle, TestData.CREATE_PASSCODE_TEXT);
        
        passCodePage.enterPasscode();
        String confirmPasscodeText = passCodePage.getConfirmPasscodeText();
        Assert.assertEquals(confirmPasscodeText, TestData.CONFIRM_PASSCODE_TEXT);

        passCodePage.enterPasscode();
        String enableNotificationsTitle = enableNotificationsPage.getMarketTitle();
        Assert.assertEquals(enableNotificationsTitle, TestData.MARKET_TITLE_TEXT);

        String walletReadyMessage = walletReadyPage.getWalletReadyMessage();
        Assert.assertEquals(walletReadyMessage, TestData.WALLET_READY_MESSAGE);
        HomePage homePage = walletReadyPage.clickButton();
        Assert.assertTrue(homePage.isHomeNavigationButtonDisplayed());
        return homePage;
    }
}