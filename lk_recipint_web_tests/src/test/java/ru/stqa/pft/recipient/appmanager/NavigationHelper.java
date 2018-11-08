package ru.stqa.pft.recipient.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

/**
 * Created by Сергей on 01.11.2018.
 */
public class NavigationHelper  extends HelperBase {
   private ChromeDriver wd;

/*
    public NavigationHelper(ChromeDriver wd) {
        this.wd=wd;
    }
*/

    public NavigationHelper(ChromeDriver wd) {
        super(wd);
    }

    public void gotoTsrPage() throws InterruptedException  {
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        click(By.xpath("//li[@class='tiles__item']//p[text()='Технические средства реабилитации']"));
    }

    public void openFilter() throws InterruptedException {
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        /*WebDriverWait wait = new WebDriverWait(wd, 80, 1000);
        WebElement button = wait.until(visibilityOfElementLocated(By.xpath("//div[@id='wrapper']//span[text()='Фильтр']")));
        // кликаем
        button.click();*/
        click(By.xpath("//div[@id='wrapper']//span[text()='Фильтр']"));
     }


}
