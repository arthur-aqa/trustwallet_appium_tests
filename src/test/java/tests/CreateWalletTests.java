package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.PassCodePage;
import pages.ConfirmPasscodePage;
import pages.EnableNotificationsPage;
import pages.WalletReadyPage;
import utils.TestData;

public class CreateWalletTests extends BaseTest {

    @Test(description = "Creating a new wallet")
    public HomePage testCreateWallet() {
        PassCodePage passCodePage = welcomePage.clickCreateWalletButton();
        String actualTitle = passCodePage.getPassCodeText();
        Assert.assertEquals(actualTitle, TestData.CREATE_PASSCODE_TEXT, "Passcode page title mismatch");
        
        ConfirmPasscodePage confirmPasscodePage = passCodePage.enterPasscode();
        Assert.assertEquals(confirmPasscodePage.getConfirmPasscodeText(), TestData.CONFIRM_PASSCODE_TEXT, "Confirm passcode page title mismatch");

        EnableNotificationsPage enableNotificationsPage = confirmPasscodePage.confirmPasscodeNotifications();
        Assert.assertEquals(enableNotificationsPage.getMarketTitle(), TestData.MARKET_TITLE_TEXT, "Market title mismatch");

        WalletReadyPage walletReadyPage = enableNotificationsPage.clickSkipButtonWalletReadyPage();
        Assert.assertEquals(walletReadyPage.getWalletReadyMessage(), TestData.WALLET_READY_MESSAGE, "Wallet ready page title mismatch");

        HomePage homePage = walletReadyPage.clickButton();
        Assert.assertTrue(homePage.isHomeNavigationButtonDisplayed(), "Home page navigation button should be displayed");

        return homePage;
    }
}