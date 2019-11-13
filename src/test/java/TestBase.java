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

public class TestBase {

    private static ApplicationManager appManager = new ApplicationManager();

    @Before
    public void setUp() {
        getAppManager();
    }

    protected static ApplicationManager getAppManager() {
        return appManager;
    }

//    @After
//    public void tearDown() {
//        driver.quit();
//    }

}
