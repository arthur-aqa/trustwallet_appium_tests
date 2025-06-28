package tests.Base;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverUtils;
import pages.CreateWalletPage;
import pages.EnableNotificationsPage;
import pages.WalletIsReadyPage;
import pages.HomePage;
import pages.ReceivePage;

public class BaseTest {

    protected CreateWalletPage createWalletPage;
    protected EnableNotificationsPage enableNotificationsPage;
    protected WalletIsReadyPage walletIsReadyPage;
    protected HomePage homePage;
    protected ReceivePage receivePage;

    @BeforeMethod
    public void setUp() {
        DriverUtils.initializeDriver();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        DriverUtils.quitDriver();
    }

}
