import org.openqa.selenium.By;

public class LoginHelper extends HelperBase {

    private String boardUrl = "https://trello.com/marinarhipova/boards";
    private String baseUrl = "https://trello.com/" ;
    public static AccountData USER = new AccountData("login", "password");
    public static String USERNAME;

    public LoginHelper(ApplicationManager appManager) {
        super(appManager);
    }

    public void login(AccountData user) {

//        getAppManager().getDriver().findElement(By.linkText("Войти")).click();
//        getAppManager().getDriver().findElement(By.id("user")).clear();
//        getAppManager().getDriver().findElement(By.id("user")).sendKeys(user.getUsername());
//        getAppManager().getDriver().findElement(By.id("password")).click();
//        getAppManager().getDriver().findElement(By.id("password")).clear();
//        getAppManager().getDriver().findElement(By.id("password")).sendKeys(user.getPassword());
//        getAppManager().getDriver().findElement(By.id("login")).click();
//        if (!isElementPresent(By.id("error"))) {
//            getAppManager().getDriver().findElement(By.linkText("Перейти к вашим доскам")).click();
//        }
//        driver.findElement(By.linkText("Войти")).click();
//        driver.findElement(By.id("user")).sendKeys(user.getUsername());
//        driver.findElement(By.id("password")).click();
//        driver.findElement(By.id("password")).sendKeys(user.getPassword());
//        driver.findElement(By.id("login")).click();

        getAppManager().getDriver().findElement(By.linkText("Войти")).click();
        getAppManager().getDriver().findElement(By.id("user")).clear();
        getAppManager().getDriver().findElement(By.id("user")).sendKeys(user.getUsername());
        getAppManager().getDriver().findElement(By.id("password")).click();
        getAppManager().getDriver().findElement(By.id("password")).clear();
        getAppManager().getDriver().findElement(By.id("password")).sendKeys(user.getPassword());
        getAppManager().getDriver().findElement(By.id("login")).click();
        getAppManager().getDriver().findElement(By.linkText("Перейти к вашим доскам.")).click();
    }

    public void checkUsername() {
        getAppManager().getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[5]/a[4]/span/span[1]")).click();
        USERNAME = getAppManager().getDriver().findElement(By.xpath("//*[@id=\"classic\"]/div[5]/div/div[1]/span")).getText();
    }

}
