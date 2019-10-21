package page;
import model.CalculatorData;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import service.CalculatorDataCreator;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class CalculatorPage extends AbstractPage {

    private final String CALC_URL ="https://cloud.google.com/products/calculator/";
    private   CalculatorData calculatorData = CalculatorDataCreator.withCredentialsFromProperty();
    @FindBy(xpath = "//*[@id='resultBlock']/md-card/md-card-content/div/div/div/h2/b")
    private WebElement totalCost;
    @FindBy(id="idIframe")
    private WebElement switchFrame;
    @FindBy(xpath = "//*[@id='dialogContent_407']/form/md-dialog-actions/button[2]")
    private WebElement sendEmail;
    @FindBy(xpath = "//*[@id='compute']/md-list/md-list-item[3]/div")
    private WebElement valueOfMachineTypeFromTable;
    @FindBy(xpath = "//*[@id='compute']/md-list/md-list-item[2]/div")
    private WebElement valueOfMachineClassFromTable;


    public WebElement getTotalCost()
    {
        return totalCost;
    }

    public CalculatorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    public CalculatorPage openPage (){
        driver.navigate().to(CALC_URL);
        driver.switchTo().frame(switchFrame);
        return this;
    }
    public void switchFrame(){
            driver.switchTo().frame(switchFrame);
    }

    public void pasteEmail(){
        String buffer= null;
            try {
                buffer = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
            } catch (UnsupportedFlavorException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            waitToBeClickable(calculatorData.getEmail()).sendKeys(buffer);
    }

    public void sendEmail(){
        sendEmail.click();

    }

    public void findAndClickCalculatorElements()  {
        waitToBeClickable(calculatorData.getSearchForAProduct()).click();
        waitToBeClickable(calculatorData.getNumberOfInstances()).sendKeys("4");
        waitToBeClickable(calculatorData.getOperatingSystemLocator()).click();
        waitToBeClickable(calculatorData.getValueOfOperatingSystem()).click();
        waitToBeClickable(calculatorData.getMachineClass()).click();
        waitToBeClickable(calculatorData.getValueOfMachineClass()).click();
        waitToBeClickable(calculatorData.getMachineType()).click();
        waitToBeClickable(calculatorData.getValueOfMachineType()).click();
        waitToBeClickable(calculatorData.getAddGPU()).click();
        waitToBeClickable(calculatorData.getNumberOfGPUs()).click();
        waitToBeClickable(calculatorData.getValueOfNumberOfGPUs()).click();
        waitToBeClickable(calculatorData.getGPUType()).click();
        waitToBeClickable(calculatorData.getValueOfGPUType()).click();
        waitToBeClickable(calculatorData.getLocalSSD()).click();
        waitToBeClickable(calculatorData.getValueOfLocalSSD()).click();
        waitToBeClickable(calculatorData.getDatacenterLocation()).click();
        waitToBeClickable(calculatorData.getValueOfDatacenterLocation()).click();
        waitToBeClickable(calculatorData.getCommitedUsage()).click();
        waitToBeClickable(calculatorData.getValueOfCommitedUsage()).click();
        waitToBeClickable(calculatorData.getAddToEstimate()).click();
        waitToBeClickable(calculatorData.getEmailEstimate()).click();
    }
    public String getValueOfMachineClassFromTable() {
        return valueOfMachineClassFromTable.getText();
       }

    public String getValueOfMachineClassFromDropDown() {
      return  waitToBePresenceOfElementLocated
              (calculatorData.getValueOfMachineClass()).getText();
    }

    public String getValueOfMachineTypeFromTable() {
        return valueOfMachineTypeFromTable.getText();
    }

    public String getValueOfMachineTypeFromDropDown() {
      return waitToBePresenceOfElementLocated(calculatorData.getValueOfMachineType()).getText();
    }
}
