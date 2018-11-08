package ru.stqa.pft.recipient.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Сергей on 08.11.2018.
 */
public class HelperBase {

    private ChromeDriver wd;
    public HelperBase(ChromeDriver wd) {
        this.wd=wd;
    }

    /*параметризировали locator'ом кликалку*/
    protected void click(By locator) {
        wd.findElement(locator).click();
    }

}
