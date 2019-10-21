package test;

import Util.TestListener;
import driver.DriverSingletone;
import org.testng.Assert;
import org.testng.annotations.*;
import page.CalculatorPage;
import page.MailPage;
import page.MainPage;
import page.ReadMailPage;
import service.Switcher;

@Listeners({TestListener.class})
public class CompareSumFromMailAndCalculatorPageTableTest {
    MainPage mainPage=new MainPage(DriverSingletone.getDriver());
    CalculatorPage calculatorPage =
            new CalculatorPage(DriverSingletone.getDriver());
    MailPage mailPage=new MailPage(DriverSingletone.getDriver());
    ReadMailPage readMailPage=new ReadMailPage(DriverSingletone.getDriver());
    String totalCostFromCakculatorPage;
    String totalCostFromReadMailPage;

    @Test
    public void compareSumFromTableAndCalculatorPage() {
        mainPage.openPage().inputAndFindDataInSearch().clickCloudCalculator().switchFrame();
        calculatorPage.findAndClickCalculatorElements();
        Switcher.openNewWindow();
        Switcher.switchToSecondPage();
        mailPage.openPage();
        mailPage.copyEmail();
        Switcher.switchToFirstPage();
        calculatorPage.switchFrame();
        totalCostFromCakculatorPage = calculatorPage.getTotalCost().getText();
        calculatorPage.pasteEmail();
        calculatorPage.sendEmail();
        Switcher.switchToSecondPage();
        mailPage.openLetter();
        totalCostFromReadMailPage = readMailPage.getTotalCost().getText();
        Assert.assertTrue((totalCostFromCakculatorPage).
                contains(totalCostFromReadMailPage)
        );
    }
        @AfterTest
        public void webQuit(){
           DriverSingletone.getDriver().quit();
        }
    }




