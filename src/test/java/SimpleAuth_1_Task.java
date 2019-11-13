import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class SimpleAuth_1_Task {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "D:\\Загрузки\\chromedriver_win32\\chromedriver.exe");

    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void untitled() {
    driver.get("https://trello.com/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Войти")).click();
    driver.findElement(By.id("user")).click();
    driver.findElement(By.id("user")).click();
    {
      WebElement element = driver.findElement(By.id("user"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("user")).click();
    driver.findElement(By.cssSelector("section")).click();
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).click();
    {
      WebElement element = driver.findElement(By.id("password"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("password")).sendKeys("53wr67rpt");
    driver.findElement(By.id("login")).click();
    driver.findElement(By.id("password")).sendKeys("53wr67qpt");
    driver.findElement(By.id("login")).click();
  }
}
