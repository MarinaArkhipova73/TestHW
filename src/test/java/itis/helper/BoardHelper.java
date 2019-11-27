package itis.helper;

import itis.ApplicationManager;
import itis.bases.HelperBase;
import itis.entities.Board;
import org.openqa.selenium.By;

public class BoardHelper extends HelperBase {
    public static Boolean isAdded;
    public static Boolean isDeleted;

    public BoardHelper(ApplicationManager appManager) {
        super(appManager);
    }

    public void addBoard() throws InterruptedException {
        getAppManager().getDriver().findElement(By.xpath("//div[@class='board-tile mod-add'][contains(.,'Создать доску')]")).click();
        Thread.sleep(1000);
        getAppManager().getDriver().findElement(By.className("subtle-input")).sendKeys("test");
        Thread.sleep(1000);
        getAppManager().getDriver().findElement(By.xpath("(//span[contains(.,'Создать доску')])[2]")).click();
        Thread.sleep(1000);
        isAdded = true;
    }

//    public Board getAddingBoard(){
//        String boardName = getAppManager().getDriver().findElement(By.className("subtle-input")).getText();
//        return new Board(boardName);
//    }

    public void deleteBoard() throws InterruptedException {
//        getAppManager().getDriver().findElement(By.xpath("(//div[@class='board-tile-details is-badged'][contains(.,'test')])[3]")).click();
        getAppManager().getDriver().findElement(By.xpath("//a[@class='board-menu-navigation-item-link js-open-more'][contains(.,'Ещё')]")).click();
        getAppManager().getDriver().findElement(By.xpath("//a[@class='board-menu-navigation-item-link js-close-board'][contains(.,'Закрыть доску…')]")).click();
        Thread.sleep(1000);
        getAppManager().getDriver().findElement(By.xpath("//input[contains(@class,'js-confirm full negate')]"));
        Thread.sleep(1000);
        getAppManager().getDriver().findElement(By.xpath("//span[contains(@class,'_1q-xxtNvcdFBca')]")).click();
        isDeleted = true;
    }
}
