package itis.helper;
import itis.ApplicationManager;
import itis.bases.HelperBase;
import itis.entities.Column;
import org.openqa.selenium.By;

public class ColumnHelper extends HelperBase {

    public ColumnHelper(ApplicationManager appManager) {
        super(appManager);
    }

    public void addColumn() throws InterruptedException {
//        getAppManager().getDriver().findElement(By.xpath("//span[@class='placeholder'][contains(.,'Добавьте еще одну колонку')]")).click();
        getAppManager().getDriver().findElement(By.name("name")).sendKeys("Yessss");
        getAppManager().getDriver().findElement(By.cssSelector(".primary")).click();
        Thread.sleep(1000);
    }

    public void deleteColumn() throws InterruptedException {
        getAppManager().getDriver().findElement(By.xpath("//a[contains(@class,'list-header-extras-menu dark-hover js-open-list-menu icon-sm icon-overflow-menu-horizontal')]")).click();
        getAppManager().getDriver().findElement(By.xpath("//a[@class='js-close-list'][contains(.,'Архивировать список')]")).click();
        Thread.sleep(1000);
    }
}
