package utils.Helpers;

import org.testng.Assert;

import pages.*;
import utils.TestData;

public class Import {

    public static PassCodePage clickImportWalletButton(WelcomePage welcomePage) {
        return welcomePage.clickImportWalletButton();
    }

    public static ConfirmPasscodePage enterPasscode(PassCodePage page) {
        return page.enterPasscode();
    }

    public static ImportMethodPage confirmPasscode(ConfirmPasscodePage page) {
        Assert.assertEquals(page.getConfirmPasscodeText(), TestData.CONFIRM_PASSCODE_TEXT, "Confirm passcode page title mismatch");
        return page.confirmPasscodeImport();
    }

    public static ImportCheckmarksPage clickImportMethod(ImportMethodPage methodPage) {
        Assert.assertEquals(methodPage.getToolbarTitle(), TestData.IMPORT_METHOD_TITLE, "Import method page title mismatch");
        return methodPage.clickSecretPhraseButton();
    }

    public static SelectNetworkPage acceptAllCheckmarks(ImportCheckmarksPage page) {
        Assert.assertEquals(page.getTitle(), TestData.CHECKMARKS_TITLE, "Checkmarks page title mismatch");
        page.clickConsentCheck1();
        page.clickConsentCheck2();
        page.clickConsentCheck3();
        return page.clickContinueButton();
    }

    public static MultiCoinWalletImportPage clickSelectNetwork(SelectNetworkPage page) {
        Assert.assertEquals(page.getToolbarTitle(), TestData.SELECT_NETWORK_TITLE, "Select network page title mismatch");
        return page.clickItemIcon();
    }

    public static WalletReadyPage enterSecretPhraseAndRestore(MultiCoinWalletImportPage walletPage, String seedPhrase) {
        Assert.assertEquals(walletPage.getToolbarTitle(), TestData.MULTI_COIN_WALLET_TITLE, "Multi-coin wallet page title mismatch");
        walletPage.enterSecretPhrase(seedPhrase);
        walletPage.clickRestoreWalletButton();
        return new WalletReadyPage();
    }

    public static HomePage clickWalletReady(WalletReadyPage page) {
        Assert.assertEquals(page.getWalletReadyMessage(), TestData.WALLET_READY_MESSAGE, "Wallet ready page title mismatch");
        page.clickButton();
        return new HomePage();
    }

}