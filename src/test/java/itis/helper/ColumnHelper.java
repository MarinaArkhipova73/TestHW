package itis.helper;
import itis.ApplicationManager;
import itis.bases.HelperBase;
import itis.entities.Column;
import org.openqa.selenium.By;

public class ColumnHelper extends HelperBase {
    public static Boolean isAdded;
    public static Boolean isDeleted;
    public static String NAME;

    public ColumnHelper(ApplicationManager appManager) {
        super(appManager);
    }

    public void addColumn() throws InterruptedException {
//        getAppManager().getDriver().findElement(By.xpath("//span[@class='placeholder'][contains(.,'Добавьте еще одну колонку')]")).click();
        getAppManager().getDriver().findElement(By.name("name")).sendKeys("Yessss");
        getAppManager().getDriver().findElement(By.cssSelector(".primary")).click();
        isAdded = true;
        Thread.sleep(1000);
    }

    public void checkAddedColumn(){
        getAppManager().getDriver().findElement(By.xpath("//div[contains(@class,'list-header-target js-editing-target')]")).getText();
        NAME =getAppManager().getDriver().findElement(By.xpath("//textarea[contains(.,'Yessss')]")).getText();
    }

    public void deleteColumn() throws InterruptedException {
        getAppManager().getDriver().findElement(By.xpath("//a[contains(@class,'list-header-extras-menu dark-hover js-open-list-menu icon-sm icon-overflow-menu-horizontal')]")).click();
        getAppManager().getDriver().findElement(By.xpath("//a[@class='js-close-list'][contains(.,'Архивировать список')]")).click();
        isDeleted = true;
        Thread.sleep(1000);
    }
}
