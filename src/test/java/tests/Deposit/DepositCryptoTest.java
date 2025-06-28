package tests.Deposit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ReceivePage;
import tests.Base.BaseTest;
import tests.CreateWallet.CreateWalletTest;

public class DepositCryptoTest extends BaseTest {

    @Test(description = "Depositing cryptocurrency")
    public void testDepositCrypto() {
        CreateWalletTest createWalletTest = new CreateWalletTest();
        createWalletTest.testCreateWallet();
        ReceivePage receivePage = homePage.clickButton();
        String actualTitle = receivePage.getReceiveTitleText();
        Assert.assertEquals(actualTitle, "Receive");
        // Opening QR code for receiving crypto and expecting to recieve it
    }

}
