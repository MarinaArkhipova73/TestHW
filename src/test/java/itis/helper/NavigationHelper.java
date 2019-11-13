package itis.helper;

import itis.ApplicationManager;
import itis.bases.HelperBase;
import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

    public static String boardUrl;
    public static String baseUrl;

    public NavigationHelper(ApplicationManager appManager) {
        super(appManager);
    }

    public void getLoginPage() {
        getAppManager().getDriver().get("https://trello.com/home");
    }

    public void getBoardsPage() {
        getAppManager().getDriver().get("https://trello.com/marinarhipova/boards");
    }

//    public void getBoardPage() {
//        getAppManager().getDriver().get("https://trello.com/marinarhipova/boards");
//    }


    public void checkBoardPageUrl() {
        boardUrl = getAppManager().getDriver().getCurrentUrl();
    }

    public void checkLoginPageUrl() {
        baseUrl = getAppManager().getDriver().getCurrentUrl();
    }

    public void goToTable() {
        getAppManager().getDriver().findElement(By.xpath("(//div[@style='overflow: hidden; text-overflow: ellipsis; -webkit-box-orient: vertical; display: -webkit-box; -webkit-line-clamp: 2;'][contains(.,'Hi, test')])[1]")).click();
    }

}
