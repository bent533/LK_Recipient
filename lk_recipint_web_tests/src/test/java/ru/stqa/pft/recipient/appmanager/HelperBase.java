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
        Actions seriesOfActions = builder.moveToElement(login).click().sendKeys(login, "central-office");
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



    protected  void  openCheckFLK() throws InterruptedException {
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);


        wd.switchTo().defaultContent();
        //wd.switchTo().frame(wd.findElement(By.xpath("//iframe[@src='https://portal-dev.fss.local/fssarm/?']")));
      //  wd.switchTo().frame(wd.findElement(By.xpath("//div[@class='portlet-boundary portlet-boundary_48_ portlet-static portlet-static-end portlet-borderless portlet-iframe ']//iframe[@src='/fssarm/?']")));

        WebElement myframe = wd.findElement(By.xpath("//*[@id=\"fssarmiframe\"]"));
        Actions actionWithYourFrame = new Actions(wd);
        actionWithYourFrame.moveToElement(myframe).build().perform();
        myframe.click();
    //    wd.switchTo().frame(wd.findElement(By.xpath("//*[@id=\"fssarmiframe\"]")));

      //  wd.findElement(By.xpath("//*[@id=\"ext-element-77\"]/div[3]")).click();
                                                     //div[@id='ext-element-88']//div[3]

        WebElement admflk = wd.findElement(By.xpath("//div[@id='ext-element-88']//div[3]"));
      //  WebElement admflk = wd.findElement(By.xpath("//div[@id='ext-element-88']//div[@id='ext-element-106']"));


        Actions actionAdmFlk = new Actions(wd);
        actionAdmFlk.moveToElement(admflk).build().perform();
        admflk.click();



        Thread.sleep(3000);
        Thread.sleep(3000);
        wd.findElement(By.id("ext-element-79")).click();
        Thread.sleep(3000);
        Thread.sleep(3000);
        wd.findElement(By.id("button-1323-btnInnerEl")).click();

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
