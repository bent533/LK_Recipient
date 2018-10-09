package ru.stqa.pft.recipient;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;  //для ожидания загрузки страниц используется
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;

import static org.openqa.selenium.support.ui.ExpectedConditions.stalenessOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;


public class testFunc {
    ChromeDriver wd;

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


    }

    @Test
    public void test_Func() {
        WebDriverWait wait = new WebDriverWait(wd, 80, 1000);
        wd.get("http://localhost:3000/");
        // ждём появления кнопки на "недозагруженной" странице
//      WebElement button = wait.until(visibilityOfElementLocated(By.xpath("//li[@class='tiles__item']//p[text()='Технические средства реабилитации']")));
// кликаем

        //  wait.until(ExpectedConditions.visibilityOf(wd.findElement(By.xpath("//li[@class='tiles__item']//p[text()='Технические средства реабилитации']"))));
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='tiles__item']//p[text()='Технические средства реабилитации']")));
       // wait.until(ExpectedConditions.ElementToBeClickable(By.xpath("//li[@class='tiles__item']//p[text()='Технические средства реабилитации']"));

       // wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//li[@class='tiles__item']//p[text()='Технические средства реабилитации']")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='tiles__item']//p[text()='Технические средства реабилитации']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='tiles__item']//p[text()='Технические средства реабилитации']")));
        WebElement button = wd.findElement(By.xpath("//li[@class='tiles__item']//p[text()='Технические средства реабилитации']"));
        try {
            wd.findElement(By.xpath("//li[@class='tiles__item']//p[text()='Технические средства реабилитации']")).click();
        } catch (TimeoutException ignore) {        }
// ждём исчезновения кнопки, то есть "выгрузки" страницы

        wait.until(stalenessOf(button));
// ждём загрузки следующей страницы
        wait.until(visibilityOfElementLocated(By.xpath("//div[@id='wrapper']//span[text()='Фильтр']")));
        WebElement button2 = wait.until(visibilityOfElementLocated(By.xpath("//div[@id='wrapper']//span[text()='Фильтр']")));
        // кликаем
        try {
            button2.click();
        } catch (TimeoutException ignore) {        }

  }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(ChromeDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
