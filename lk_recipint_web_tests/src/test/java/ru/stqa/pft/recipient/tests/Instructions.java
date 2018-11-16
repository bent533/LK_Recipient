package ru.stqa.pft.recipient.tests;
import org.testng.annotations.Test;


public class Instructions extends TestBase{

    @Test
    public void instructions() throws InterruptedException {
        app.getNavigationHelper().goToInstructions();
        app.getInstructionHelper().downloadInstruction(); //здесь падает из-за открытия нового окна
    }

}
