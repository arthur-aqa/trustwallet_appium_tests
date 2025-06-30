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
        WalletReadyPage walletReadyPage = Import.enterSecretPhraseAndRestore(walletPage, TestData.TEST_SEED_PHRASE);
        Import.clickWalletReady(walletReadyPage);
    }


    @Test(description = "Import wallet with invalid seed phrase")
    public void testImportWalletWithInvalidSeedPhrase() {
        PassCodePage passCodePage = Import.clickImportWalletButton(welcomePage);
        ConfirmPasscodePage confirmPasscodePage = Import.enterPasscode(passCodePage);
        ImportMethodPage methodPage = Import.confirmPasscode(confirmPasscodePage);
        ImportCheckmarksPage checkmarksPage = Import.clickImportMethod(methodPage);
        SelectNetworkPage selectNetworkPage = Import.acceptAllCheckmarks(checkmarksPage);
        MultiCoinWalletImportPage walletPage = Import.clickSelectNetwork(selectNetworkPage);
        WalletReadyPage walletReadyPage = Import.enterSecretPhraseAndRestore(walletPage, TestData.INVALID_SEED_PHRASE);
        Import.clickWalletReady(walletReadyPage);
    }

  
} 