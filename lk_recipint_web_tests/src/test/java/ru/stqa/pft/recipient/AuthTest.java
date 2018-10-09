
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
//import java.util.Date;
import java.io.File;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.*;
//import static org.openqa.selenium.OutputType.*;

public class AuthTest {
    ChromeDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\IBS_automated_testing\\chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void LinkTest() {
        wd.get("https://cabinets-test.fss.ru/insurer");

      //  wd.findElement(By.linkText("Вход <br> в кабинет")).click();
        /********************/
        wd.get("https://esia-portal1.test.gosuslugi.ru/idp/rlogin?cc=bp");
//        wd.findElement(By.id("header-table")).click();
     //   wd.get("https://esia-portal1.test.gosuslugi.ru/idp/login/pwd/switch?cc=bp");
        /**/
      //  new Actions(wd).doubleClick(wd.findElement(By.id("snils"))).build().perform();
     //   wd.findElement(By.cssSelector("div.content-box.login-slils-box")).click();
        wd.findElement(By.linkText("СНИЛС")).click();
   //   wd.findElement(By.xpath("//input[@id='snils']"));
       By snils = By.cssSelector("input#snils");
    //    wd.findElement(By.id("snils")).click();
      //  wd.findElement(By.id("snils")).f;

      //  wd.findElement(By.xpath("//input[@id='snils']")).sendKeys("00000060004");
      wd.findElement(snils).click();
      wd.findElement(snils).sendKeys("00000060004");
      wd.findElement(snils).sendKeys("00000060004");
      wd.findElement(snils).sendKeys("00000060004");
      wd.findElement(snils).sendKeys("00000060004");
//        wd.findElement(By.id("snils")).clear();
        /*

        driver.switchTo().frame(“news_globalize_translations_attributes_ru_content_ifr”);
        driver.findElement(By.id(“tinymce”)).sendKeys(“Text”);
        driver.switchTo().defaultContent()

         */


    //    wd.findElement(By.id("snils")).click();
    //    wd.findElement(By.id("snils")).clear();
     //   wd.findElement(By.id("snils")).sendKeys("000-000-600 04");
      //  wd.findElement(By.id("password")).click();
       // wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("11111111");
        wd.findElement(By.xpath("//form[@id='authnFrm']/div[1]/div[3]/div[3]/div[2]/button")).click();
        wd.findElement(By.id("org2")).click();

        /*
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).sendKeys("\\undefined");
        wd.findElement(By.xpath("//form[@id='authnFrm']/div[1]/div[3]/div[3]/div[2]/button")).click();
        wd.findElement(By.cssSelector("div.page-wrap.basecontent")).click();
        wd.findElement(By.id("o2")).click();
        /***********************/
        wd.get("https://cabinets-test.fss.ru/insurer/home/#/");
        wd.findElement(By.cssSelector("div.top-head")).click();
        wd.findElement(By.linkText("Листки нетрудоспособности")).click();
        wd.findElement(By.linkText("Журнал обмена данными")).click();
        wd.findElement(By.linkText("Журнал реестров")).click();
        wd.findElement(By.linkText("Журнал пособий")).click();
        wd.findElement(By.linkText("Финансовое обеспечение предупредительных мер")).click();
        wd.findElement(By.cssSelector("span.logo__desc")).click();
        wd.findElement(By.xpath("//ul[@class='tiles__list']//div[.='Запросы в Фонд']")).click();
        wd.findElement(By.cssSelector("span.btn__text")).click();
        wd.findElement(By.cssSelector("span.logo__title")).click();
    }
//
//    @AfterMethod
//    public void tearDown() {
//        wd.quit();
//    }
//
//    public static boolean isAlertPresent(ChromeDriver wd) {
//        try {
//            wd.switchTo().alert();
//            return true;
//        } catch (NoAlertPresentException e) {
//            return false;
//        }
//    }
}
