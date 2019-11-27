package itis.bases;

import itis.ApplicationManager;
import org.junit.After;
import org.junit.Before;

public class TestBase {

    private static ApplicationManager appManager;

    @Before
    public void setUp(){
//        setApp(new ApplicationManager());
        appManager = ApplicationManager.GetInstance();
    }

//    @After
//    public void tearDown() throws Exception {
//        appManager.stop();
//    }

    protected void setApp(ApplicationManager appManager) {
        this.appManager = appManager;
    }

    protected ApplicationManager getAppManager() {
        return appManager;
    }

}
