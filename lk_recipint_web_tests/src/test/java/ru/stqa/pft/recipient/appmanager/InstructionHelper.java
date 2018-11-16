package ru.stqa.pft.recipient.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Сергей on 16.11.2018.
 */
public class InstructionHelper extends HelperBase{

    //формируем обращение к конструктору базового класса
    public InstructionHelper(ChromeDriver wd) {super(wd);    }

    public void downloadInstruction() throws InterruptedException {
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        click(By.xpath("//div[@class='files']//p[text()='Инструкция пользователям']"));
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);
    }
}
