package itis.util;

import itis.ApplicationManager;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class Settings {
    public static String baseUrl;
    public static String login;
    public static String password;
    public static String invalidPassword;
    public static String accountUrl;
    public static String boardUrl;
    private static final String FILE_NAME = "D:\\Uni\\Test\\Test\\src\\test\\java\\itis\\setting.json";

    public static void getData() throws IOException, ParseException {
        FileReader reader = new FileReader(FILE_NAME);
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
        login = (String) jsonObject.get("login");
        password = (String) jsonObject.get("password");
        invalidPassword = (String) jsonObject.get("invalpassw");
        baseUrl=(String) jsonObject.get("base.url");
        accountUrl=(String) jsonObject.get("account.url");
        boardUrl=(String) jsonObject.get("board.url");
        System.out.println(login);
    }
}