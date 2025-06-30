package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import utils.TestData;
import utils.Helpers.Import;
import pages.*;

public class ImportWalletTests extends BaseTest {

    @Test(description = "Import wallet using seed phrase")
    public void testImportWalletWithSeedPhrase() {
        PassCodePage passCodePage = Import.clickImportWalletButton(welcomePage);
        ConfirmPasscodePage confirmPasscodePage = Import.enterPasscode(passCodePage);
        ImportMethodPage methodPage = Import.confirmPasscode(confirmPasscodePage);
        ImportCheckmarksPage checkmarksPage = Import.clickImportMethod(methodPage);
        SelectNetworkPage selectNetworkPage = Import.acceptAllCheckmarks(checkmarksPage);
        MultiCoinWalletImportPage walletPage = Import.clickSelectNetwork(selectNetworkPage);
        Import.enterSecretPhraseAndRestore(walletPage, TestData.TEST_SECRET_PHRASE);
        WalletReadyPage walletReadyPage = Import.enterSecretPhraseAndRestore(walletPage, TestData.TEST_SECRET_PHRASE);
        Import.clickWalletReady(walletReadyPage);
    }


    @Test(description = "Import wallet with invalid seed phrase")
    public void testImportWalletWithInvalidSeedPhrase() {
        PassCodePage passCodePage = ImportHelper.clickImportWalletButton(welcomePage);
        ConfirmPasscodePage confirmPasscodePage = ImportHelper.enterPasscode(passCodePage);
        ImportMethodPage methodPage = ImportHelper.confirmPasscode(confirmPasscodePage);
        ImportCheckmarksPage checkmarksPage = ImportHelper.clickImportMethod(methodPage);
        SelectNetworkPage selectNetworkPage = ImportHelper.acceptAllCheckmarks(checkmarksPage);
        MultiCoinWalletImportPage walletPage = ImportHelper.clickSelectNetwork(selectNetworkPage);
        ImportHelper.enterSecretPhraseAndRestore(walletPage, TestData.INVALID_SECRET_PHRASE);
        Assert.assertTrue(walletPage.isToastDisplayed(), "Toast with 'Invalid mnemonic phrase' should be displayed");
    }

  
} 