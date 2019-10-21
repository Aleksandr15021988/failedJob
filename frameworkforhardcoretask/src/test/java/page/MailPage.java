package page;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MailPage extends AbstractPage {
    private final static String MAIL_URL="https://10minutemail.net";
    @FindBy(xpath = "//*[@id='copy-button']")
    private WebElement CopyAdressButton;

    public MailPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    public MailPage openPage () {
        driver.navigate().to(MAIL_URL);
        return this;
    }

    public void copyEmail(){
       CopyAdressButton.click();
    }
    public ReadMailPage openLetter(){
        waitToBeClickable("//a[text()[contains(.,'Google Cloud Platform Price Estimate')]]").click();
        return new ReadMailPage(driver);
    }





}
