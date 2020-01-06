package itis.bases;

import itis.entities.AccountData;
import itis.helper.LoginHelper;
import itis.helper.NavigationHelper;
import itis.util.Settings;
import org.junit.Assert;
import org.junit.Test;

public class AuthBase extends TestBase {

    private static AccountData user = new AccountData(Settings.login, Settings.password);

    @Test
    public static void isLoggedIn() throws Exception {
        Settings.getData();
        getAppManager().getNavigateHelper().getLoginPage();
        getAppManager().getLoginHelper().doLogin(user);
        getAppManager().getLoginHelper().checkUsername();
        Assert.assertEquals(LoginHelper.USERNAME, "MarinArhipova (marinarhipova)");
    }

    @Test
    public static void loginWithInvalidData() throws Exception {
        Settings.getData();
        AccountData invalid_user = new AccountData(Settings.login, Settings.invalidPassword);
        getAppManager().getNavigateHelper().getLoginPage();
        getAppManager().getLoginHelper().doLogin(invalid_user);
        getAppManager().getLoginHelper().checkUsername();
        Assert.assertEquals(LoginHelper.USERNAME, "MarinArhipova (marinarhipova)");    }
//    @After
//    public void tearDown() throws Exception {
//        getAppManager().stop();
//    }
}
