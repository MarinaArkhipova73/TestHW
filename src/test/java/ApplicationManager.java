import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    private String url;

    private BoardHelper boardHelper;
    private ColumnHelper columnHelper;
    private LoginHelper loginHelper;
    private NavigationHelper navigationHelper;

    public ApplicationManager(){
        System.setProperty("webdriver.chrome.driver", "D:\\Загрузки\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        url="https://trello.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        columnHelper = new ColumnHelper(this);
        loginHelper = new LoginHelper(this);
        navigationHelper = new NavigationHelper(this);
        boardHelper = new BoardHelper(this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getBaseUrl() {
        return url;
    }

    public ColumnHelper getColumnHelper(){
        return columnHelper;
    }

    public LoginHelper getLoginHelper() {
        return loginHelper;
    }

    public NavigationHelper getNavigateHelper() {
        return navigationHelper;
    }

    public BoardHelper getBoardHelper() {
        return boardHelper;
    }

    public void Stop()
    {
        driver.quit();
    }

        public void tearDown() {
        driver.quit();
    }

}
