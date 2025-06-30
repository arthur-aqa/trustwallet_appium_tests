package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.PassCodePage;
<<<<<<< HEAD
import pages.ConfirmPasscodePage;
import pages.EnableNotificationsPage;
import pages.WalletReadyPage;
=======
>>>>>>> 5b596f0 (feat: рефакторинг импортов, хелперов и тестов для флоу импорта кошелька)
import utils.TestData;

public class CreateWalletTests extends BaseTest {

    @Test(description = "Creating a new wallet")
    public HomePage testCreateWallet() {
        PassCodePage passCodePage = welcomePage.clickCreateWalletButton();
        String actualTitle = passCodePage.getPassCodeText();
<<<<<<< HEAD
        Assert.assertEquals(actualTitle, TestData.CREATE_PASSCODE_TEXT, "Passcode page title mismatch");
        
        ConfirmPasscodePage confirmPasscodePage = passCodePage.enterPasscode();
        Assert.assertEquals(confirmPasscodePage.getConfirmPasscodeText(), TestData.CONFIRM_PASSCODE_TEXT, "Confirm passcode page title mismatch");

        EnableNotificationsPage enableNotificationsPage = confirmPasscodePage.confirmPasscodeNotifications();
        Assert.assertEquals(enableNotificationsPage.getMarketTitle(), TestData.MARKET_TITLE_TEXT, "Market title mismatch");

        WalletReadyPage walletReadyPage = enableNotificationsPage.clickSkipButtonWalletReadyPage();
        Assert.assertEquals(walletReadyPage.getWalletReadyMessage(), TestData.WALLET_READY_MESSAGE, "Wallet ready page title mismatch");

        HomePage homePage = walletReadyPage.clickButton();
        Assert.assertTrue(homePage.isHomeNavigationButtonDisplayed(), "Home page navigation button should be displayed");
=======
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
>>>>>>> 5b596f0 (feat: рефакторинг импортов, хелперов и тестов для флоу импорта кошелька)
        return homePage;
    }
}