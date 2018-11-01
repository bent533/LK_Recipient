package ru.stqa.pft.recipient.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

/**
 * Created by Сергей on 01.11.2018.
 */
public class NavigationHelper {
   private ChromeDriver wd;

    public NavigationHelper(ChromeDriver wd) {
        this.wd=wd;
    }

    public void gotoTsrPage() throws InterruptedException  {
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        wd.findElement(By.xpath("//li[@class='tiles__item']//p[text()='Технические средства реабилитации']")).click();
    }

    public void openFilter() throws InterruptedException {
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(wd, 80, 1000);
        WebElement button2 = wait.until(visibilityOfElementLocated(By.xpath("//div[@id='wrapper']//span[text()='Фильтр']")));
        // кликаем
        // try {
        button2.click();
     //   } catch (TimeoutException ignore) {        }
    }
}
