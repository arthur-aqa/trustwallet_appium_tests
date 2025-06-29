package tests.Base;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.*;
import pages.*;

public class BaseTest {

    protected CreateWalletPage createWalletPage;
    protected EnableNotificationsPage enableNotificationsPage;
    protected WalletReadyPage walletReadyPage;
    protected HomePage homePage;
    protected ReceivePage receivePage;
    protected PinCodePage pinCodePage;
    protected ImportWalletPage importWalletPage;
    protected SendPage sendPage;

    @BeforeMethod
    public void setUp() {
        DriverUtils.initializeDriver();
        importWalletPage = new ImportWalletPage();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        DriverUtils.quitDriver();
    }

    protected HomePage importWalletFlow() {
        importWalletPage = createWalletPage.clickImportWalletButton();
        importWalletPage.waitForImportPageToLoad();
        
        importWalletPage.enterSeedPhrase(TestData.TEST_SEED_PHRASE);
        
        pinCodePage = importWalletPage.clickImportButton();
        
        pinCodePage.enterPinCode(TestData.DEFAULT_PIN_CODE);
        pinCodePage.enterPinCode(TestData.DEFAULT_PIN_CODE);
        
        homePage = walletReadyPage.clickButton();
        return homePage;
    }

}
