package ru.stqa.pft.recipient.tests;

import org.testng.annotations.Test;

/**
 * Created by Сергей on 03.12.2018.
 */
public class PortalEmployerOfTheFund extends TestBase {

    @Test
    public void instructions() throws InterruptedException {
        app.getNavigationHelper().loginPortalEmployerOfTheFund();
        app.getNavigationHelper().goToELN();
        app.getNavigationHelper().openRegistryChecksFLC();
    }
}
