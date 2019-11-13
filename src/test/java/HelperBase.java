import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class HelperBase {
    private ApplicationManager appManager;

    private boolean acceptNextAlert = true;

    public String getBaseUrl() {
        return appManager.getBaseUrl();
    }

    public HelperBase(ApplicationManager appManager) {
        this.appManager = appManager;
    }

    public ApplicationManager getAppManager() {
        return appManager;
    }
}
