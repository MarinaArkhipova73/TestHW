import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.util.concurrent.TimeUnit;

public class NavigationHelper extends HelperBase {

    public static String boardPageUrl;

    private String boardUrl = "https://trello.com/marinarhipova/boards";
    private String baseUrl = "https://trello.com/";

    public NavigationHelper(ApplicationManager appManager) {
        super(appManager);
    }
//    public void getTrello() {
////        driver.get(url);
////        driver.manage().window().setSize(new Dimension(1536, 824));
//    }

    public void getLoginPage() {
        getAppManager().getDriver().get(baseUrl);
    }

    public void getBoardPage() {
        getAppManager().getDriver().get(boardUrl);
    }

    public void goToTable() {
        driver.findElement(By.xpath("(//div[@style='overflow: hidden; text-overflow: ellipsis; -webkit-box-orient: vertical; display: -webkit-box; -webkit-line-clamp: 2;'][contains(.,'Hi, test')])[1]")).click();
    }

}
