package tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.*;
import pages.*;

public class BaseTest {

    protected EnableNotificationsPage enableNotificationsPage;
    protected WalletReadyPage walletReadyPage;
    protected PassCodePage passCodePage;
    protected WelcomePage welcomePage;
    protected ConfirmPasscodePage confirmPasscodePage;
    protected ImportMethodPage importMethodPage;
    protected ImportCheckmarksPage importCheckmarksPage;
    protected SelectNetworkPage selectNetworkPage;
    protected MultiCoinWalletImportPage multiCoinWalletImportPage; 
    protected WalletReadyPage walletReadyPage;

    @BeforeMethod
    public void setUp() {
        DriverUtils.initializeDriver();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        DriverUtils.quitDriver();
    }

}
