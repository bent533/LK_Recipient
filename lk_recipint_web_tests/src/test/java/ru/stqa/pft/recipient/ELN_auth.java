import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;  //для ожидания загрузки страниц используется
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.stalenessOf;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class ELN_auth {
    ChromeDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


    }
    
    @Test
    public void ELN_auth() {
        WebDriverWait wait = new WebDriverWait(wd, 20, 1000);

        wd.get("http://localhost:3000/");
        // ждём появления кнопки на "недозагруженной" странице
        //  WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.contract-tile__title")));
        // WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='tiles__item']//p[text()='Технические средства реабилитации']")));
        WebElement load = wd.findElement(By.xpath("//li[@class='tiles__item']//p[text()='Технические средства реабилитации']"));
        wait.until(stalenessOf(load));

        try {
            Thread.sleep(3000); //на 3 секунды приостанавливаем выполнение
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wd.findElement(By.xpath("//li[@class='tiles__item']//p[text()='Технические средства реабилитации']")).click();

     //   load.click();  // почему не работает?
        // ждём исчезновения кнопки, то есть "выгрузки" страницы
        wait.until(stalenessOf(load));
// ждём загрузки следующей страницы
 //       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu")));
     /*   wd.findElement(By.cssSelector("div.contract-tile__title")).click();*/
        //wd.findElement(By.linkText("Фильтр")).click();
//        wd.findElement(By.xpath("//div[@class='filter']//div[normalize-space(.)='Фильтр']")).click();
//
//
//
//
//        wd.findElement(By.cssSelector(".filter__btn btn _blue _filter")).click();
//        wd.findElement(By.cssSelector("span.Select-arrow-zone")).click();
//        wd.findElement(By.xpath("//div[@class='filterdd__actions-left']//span[.='Применить']")).click();
//        wd.findElement(By.xpath("//tbody[@class='table__cont']//p[.='092395253947']")).click();
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
