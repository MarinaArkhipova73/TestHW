package itis.bases;

import itis.ApplicationManager;
import org.junit.Before;

public class TestBase {

    private static ApplicationManager appManager  = new ApplicationManager();

    @Before
    public void setUp(){
        getAppManager();
    }

    protected static ApplicationManager getAppManager() {
        return appManager;
    }
}
