import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class EsiaNext2 {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void EsiaNext2() {
        wd.get("https://cabinets-test.fss.ru/");
        wd.findElement(By.linkText("Вход в\nкабинет")).click();
        wd.get("https://esia-portal1.test.gosuslugi.ru/idp/login/pwd/switch?cc=bp");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).sendKeys("\\undefined");
        wd.findElement(By.linkText("Другой пользователь")).click();
        wd.findElement(By.linkText("СНИЛС")).click();
        wd.findElement(By.id("snils")).click();
        wd.findElement(By.id("snils")).clear();
        wd.findElement(By.id("snils")).sendKeys("000-000-600 04");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("11111111");
        wd.findElement(By.xpath("//form[@id='authnFrm']/div[1]/div[3]/div[3]/div[2]/button")).click();
        wd.findElement(By.id("coo2")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
