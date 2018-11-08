package ru.stqa.pft.recipient.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.recipient.appmanager.ApplicationManager;

/**
 * Created by Сергей on 16.10.2018.
 */
public class TestBase {

    //перешли от наследования к ДЕЛЕГИРОВАНИЮ
    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }


    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
