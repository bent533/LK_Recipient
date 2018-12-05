package ru.stqa.pft.recipient.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


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





    protected void loginPEF() throws InterruptedException {
        //вводим логин
        WebElement login = wd.findElement(By.xpath("//div[@class='login-form']//input[@class='field inp _text _pass clearable']"));
        Actions builder = new Actions(wd);
        Actions seriesOfActions = builder.moveToElement(login).click().sendKeys(login, "TestanRO4");
        seriesOfActions.perform(); // в этот момент осуществялется ввод

        //вводим пароль
        WebElement pass = wd.findElement(By.xpath("//div[@class='login-form']//input[@class='field inp _text _pass']"));
        Actions seriesOfActionsTwo = builder.moveToElement(pass).click().sendKeys("Manager1");
        seriesOfActionsTwo.perform();

        //выполняем вход в ЛК
        Thread.sleep(3000);
        Thread.sleep(3000);
        WebElement enter = wd.findElement(By.xpath("//div[@class='login-form__btns']//div[@class='login-form__btn']"));
        enter.click();
    }

/*

    WebDriver driver = new FirefoxDriver();
        driver.get("http://www.facebook.com");
    WebElement email= driver.findElement(By.id("email"));
    Actions builder = new Actions(driver);
    Actions seriesOfActions = builder.moveToElement(email).click().sendKeys(email, "gati.naveen@gmail.com");
        seriesOfActions.perform();
    WebElement pass = driver.findElement(By.id("pass"));
    WebElement login =driver.findElement(By.id("u_0_b"));
    Actions seriesOfAction = builder.moveToElement(pass).click().sendKeys(pass, "naveench").click(login);
        seriesOfAction.perform();
    driver.

*/




}
