//package itis.bases;
//
//import com.tngtech.java.junit.dataprovider.DataProvider;
//import com.tngtech.java.junit.dataprovider.DataProviderRunner;
//import com.tngtech.java.junit.dataprovider.UseDataProvider;
//import itis.entities.Board;
//import itis.helper.BoardHelper;
//import itis.helper.NavigationHelper;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import java.io.FileReader;
//import java.io.IOException;
//
//@RunWith(DataProviderRunner.class)
//public class BoardTest extends TestBase{
//
//    private static final String FILE_PATH = "src/test/resources/json/board.txt";
//
//    @DataProvider
//    public static Object[][] boardDataProvider() throws IOException, ParseException{
//        JSONParser parser = new JSONParser();
//        Object obj = parser.parse(new FileReader(FILE_PATH));
//        JSONObject jsonObject = (JSONObject) obj;
//        Board board = new Board((String)jsonObject.get("title"));
//        Object[][] objs = new Object[1][1];
//        objs[0][0] = board;
//        return objs;
//    }
//
//    @Test
//    public void getBoardsPageTest() throws Exception {
////        getLoginPageTest();
////        getAppManager().getLoginHelper().doLogin(LoginHelper.USER);
//        getAppManager().getNavigateHelper().getBoardsPage();
//        getAppManager().getNavigateHelper().checkBoardPageUrl();
//        Assert.assertEquals(NavigationHelper.boardUrl, "https://trello.com/marinarhipova/boards");
//    }
//
//    @Test
//    @UseDataProvider("boardDataProvider")
//    public void addBoardTest() throws Exception {
////        getBoardsPageTest();
//        getAppManager().getBoardHelper().addBoard();
//        Assert.assertTrue(BoardHelper.isAdded);
//    }
//}
