import org.openqa.selenium.By;

public class ColumnHelper extends HelperBase {

    public ColumnHelper(ApplicationManager appManager) {
        super(appManager);
    }

    public void deleteColumn() throws InterruptedException {
        driver.findElement(By.xpath("(//a[contains(@class,'list-header-extras-menu dark-hover js-open-list-menu icon-sm icon-overflow-menu-horizontal')])[2]")).click();
        driver.findElement(By.xpath("//a[@class='js-close-list'][contains(.,'Архивировать список')]")).click();
        Thread.sleep(1000);
    }

    public void addColumn(Column column) {
        driver.findElement(By.xpath("//span[@class='placeholder'][contains(.,'Добавьте еще одну колонку')]")).click();
        driver.findElement(By.name("name")).sendKeys(column.getName());
        driver.findElement(By.cssSelector(".primary")).click();
    }
}
