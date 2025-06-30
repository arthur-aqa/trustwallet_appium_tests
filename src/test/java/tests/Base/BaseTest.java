package tests.Base;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.*;
import pages.*;

public class BaseTest {

    protected EnableNotificationsPage enableNotificationsPage;
    protected WalletReadyPage walletReadyPage;
    protected HomePage homePage;
    protected ReceivePage receivePage;
    protected PinCodePage pinCodePage;
    protected WelcomePage welcomePage;
    protected SendPage sendPage;

    @BeforeMethod
    public void setUp() {
        DriverUtils.initializeDriver();
        welcomePage = new WelcomePage();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        DriverUtils.quitDriver();
    }

    protected HomePage importWalletFlow() {
            PinCodePage pinCodePage = welcomePage.clickImportWalletButton();
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
            return homePage;
    }
}
