package itis.bases;

import itis.ApplicationManager;
import org.openqa.selenium.*;


public class HelperBase {

    private ApplicationManager appManager;

    private boolean acceptNextAlert = true;

    public HelperBase(ApplicationManager appManager) {
        this.appManager = appManager;
    }

    public String getBaseUrl() {
        return appManager.getBaseUrl();
    }

    public ApplicationManager getAppManager() {
        return appManager;
    }

    public boolean isElementPresent(By by) {
        try {
            appManager.getDriver().findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            appManager.getDriver().switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public String closeAlertAndGetItsText() {
        try {
            Alert alert = appManager.getDriver().switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
