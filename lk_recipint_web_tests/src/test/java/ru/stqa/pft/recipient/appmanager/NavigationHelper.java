package ru.stqa.pft.recipient.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class NavigationHelper  extends HelperBase {

    public NavigationHelper(ChromeDriver wd) {
        super(wd); // обращение к конструктору базового класса
    }

    public void gotoTsrPage() throws InterruptedException  {
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
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


    public void choiceValue ()
    {
       /* .findElement(By.xpath("//span[text()=select-arrow']")).click();
        Select-arrow*/
        click(By.xpath("//span[text()=select-arrow']"));
    }


    public void goToMain() throws InterruptedException
    {
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        click(By.xpath("//div[@class='top-head__logo']//span[text()='Фонд социального страхования']"));
    }


    public void changeView() throws  InterruptedException
    {
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        click(By.xpath("//li[@class='type-toggle__item']//div[@class='type-toggle__btn js-sheet-tab-btn _table ']"));
    }






    public void goToEln() throws InterruptedException
    {
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        click(By.xpath("//li[@class='tiles__item']//p[text()='Листки нетрудоспособности']"));
    }

    public void goToCalc() throws InterruptedException
    {
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        click(By.xpath("//li[@class='tiles__item']//p[text()='Калькулятор выплат']"));
    }


    public void goToBenefits() throws InterruptedException
    {
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        click(By.xpath("//li[@class='tiles__item']//p[text()='Пособия и выплаты']"));
    }


    public  void goToInstructions() throws  InterruptedException
    {
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        click(By.xpath("//div[@class='top-head__menu js-ddmenu _instructions']//div[@class='top-head__menu-title']"));
        Thread.sleep(3000);
    }





    //Новый проект

    public void loginPortalEmployerOfTheFund() throws InterruptedException
    {
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        loginPEF();
    }

    public void goToELN () throws InterruptedException {
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        click(By.xpath("//ul[@class='services__list gridster js-draggable _services _inited']//p[text()=' Электронный листок нетрудоспособности ']"));
    }


    public  void openRegistryChecksFLC() throws InterruptedException {
      /*  Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
*/

        //click(By.xpath("//div[@id='panel-1011-innerCt']//li[@id='ext-treelistitem-17']//div[@class='x-treelist-item-expander']"));
        //click(By.xpath("//div[@id='panel-1011-innerCt']//li[@id='ext-treelistitem-17']//div[text()='Администрирование ФЛК']"));
//div[@id='panel-1011-innerCt']//li[@id='ext-treelistitem-17']//div[@class='x-treelist-item-expander']

        //div[@id='panel-1011-innerCt']//li[@id='ext-treelistitem-17']//div[@class='x-treelist-item-expander']
      //  click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Администрирование ФЛК'])[1]/following::div[1]"));


     //   css=#ext-element-77 > div.x-treelist-item-expander
        //div[@id='ext-element-77']/div[3]

     //   click(By.xpath("//div[@id='ext-element-77']/div[3]"));

      openCheckFLK();






    }
}




