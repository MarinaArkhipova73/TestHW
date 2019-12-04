//package itis.bases;
//
//import itis.helper.LoginHelper;
//import itis.helper.NavigationHelper;
//import org.junit.Assert;
//import org.junit.Test;
//
//public class LoginTest extends  TestBase{
//    @Test
//    public void getLoginPageTest() throws Exception {
//        getAppManager().getNavigateHelper().getLoginPage();
//        getAppManager().getNavigateHelper().checkLoginPageUrl();
//        Assert.assertEquals(NavigationHelper.baseUrl, "https://trello.com/home");
//    }
//
//    @Test
//    public void doLoginTest() throws Exception {
//        getLoginPageTest();
//        getAppManager().getLoginHelper().doLogin(LoginHelper.USER);
//        getAppManager().getLoginHelper().checkUsername();
//        Assert.assertEquals(LoginHelper.USERNAME, "MarinArhipova (marinarhipova)");
//    }
//}
