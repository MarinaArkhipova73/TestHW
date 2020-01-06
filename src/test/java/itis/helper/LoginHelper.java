package itis.helper;

import itis.ApplicationManager;
import itis.bases.HelperBase;
import itis.entities.AccountData;
import org.openqa.selenium.By;

public class LoginHelper extends HelperBase {
    public static String USERNAME;

    public LoginHelper(ApplicationManager appManager) {
        super(appManager);
    }

    public void doLogin(AccountData user) {
//        if (isLoggedIn()) {
//            if (isLoggedIn(user)) {
//                return;
//            }
//            doLogout();
//        }
        getAppManager().getDriver().findElement(By.linkText("Войти")).click();
        getAppManager().getDriver().findElement(By.id("user")).clear();
        getAppManager().getDriver().findElement(By.id("user")).sendKeys(user.getLogin());
        getAppManager().getDriver().findElement(By.id("password")).click();
        getAppManager().getDriver().findElement(By.id("password")).clear();
        getAppManager().getDriver().findElement(By.id("password")).sendKeys(user.getPassword());
        getAppManager().getDriver().findElement(By.id("login")).click();
//        getAppManager().getDriver().findElement(By.linkText("Перейти к вашим доскам.")).click();
    }

    public void doLogout() {
        getAppManager().getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[5]/a[4]/span/span[1]")).click();
        getAppManager().getDriver().findElement(By.linkText("Выйти")).click();
    }

    public void checkUsername() {
        getAppManager().getDriver().findElement(By.xpath("//span[@class='_24AWINHReYjNBf'][contains(.,'M')]")).click();
//        USERNAME = getAppManager().getDriver().findElement(By.xpath("//span[contains(.,'MarinArhipova (marinarhipova)')]")).getText();
        USERNAME = getAppManager().getDriver().findElement(By.className("_1N7TDEoHnIqiCA")).getText();
    }

}
