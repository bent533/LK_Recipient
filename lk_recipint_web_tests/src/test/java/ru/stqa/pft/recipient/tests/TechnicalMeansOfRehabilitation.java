package ru.stqa.pft.recipient.tests;
import org.testng.annotations.Test;


public class TechnicalMeansOfRehabilitation extends TestBase {

    @Test
    public void technicalMeansOfRehabilitation() throws InterruptedException {
        //объекту вспомогательного класса делегируется некоторые действия
        app.getNavigationHelper().gotoTsrPage();
        app.getNavigationHelper().openFilter();
       // app.getNavigationHelper().choiceValue();
        app.getNavigationHelper().goToMain();
        app.getNavigationHelper().goToEln();
        app.getNavigationHelper().changeView();
        app.getNavigationHelper().goToMain();
        app.getNavigationHelper().goToCalc();
        app.getNavigationHelper().goToMain();
        app.getNavigationHelper().goToBenefits();
  }



}
