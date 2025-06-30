package tests;

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
    protected PassCodePage passCodePage;
    protected WelcomePage welcomePage;
    protected SendPage sendPage;

    @BeforeMethod
    public void setUp() {
        DriverUtils.initializeDriver();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        DriverUtils.quitDriver();
    }

}
