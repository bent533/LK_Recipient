package ru.stqa.pft.recipient.appmanager;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Сергей on 01.11.2018.
 */
public class ApplicationManager {
    ChromeDriver wd;

    private NavigationHelper navigationHelper;
    private InstructionHelper instrucitonHelper;

    public static boolean isAlertPresent(ChromeDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() throws InterruptedException {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost:3000/");
        navigationHelper = new NavigationHelper(wd);
        instrucitonHelper = new InstructionHelper(wd);
        WebDriverWait wait = new WebDriverWait(wd, 80, 1000);
    }

    public void stop() {
        wd.quit();
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
    public InstructionHelper getInstructionHelper() {return instrucitonHelper; }
}
