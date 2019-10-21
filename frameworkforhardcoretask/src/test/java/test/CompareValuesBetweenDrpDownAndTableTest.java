package test;
import Util.TestListener;
import driver.DriverSingletone;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import page.CalculatorPage;

@Listeners({TestListener.class})
public class CompareValuesBetweenDrpDownAndTableTest {
    WebDriver driver=DriverSingletone.getDriver();

CalculatorPage calculatorPage=new CalculatorPage(driver);

@BeforeTest
public void setUp(){
    calculatorPage.openPage().findAndClickCalculatorElements();
}


    @Test
    public void compareMachineClassesValues(){

Assert.assertTrue((calculatorPage.getValueOfMachineClassFromTable()).
        contains(calculatorPage.getValueOfMachineClassFromDropDown()));}

    @Test
    public void compareMachineTypesValues(){

Assert.assertTrue(calculatorPage.getValueOfMachineTypeFromTable().
        contains(calculatorPage.getValueOfMachineTypeFromDropDown()));
    }
   // @AfterTest
   // public void webQuit(){
       // driver.quit();

    //}


}

