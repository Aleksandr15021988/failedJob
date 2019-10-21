package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {
    private  String BASE_URL = "https://cloud.google.com/";
    @FindBy(xpath = "//*[@id='searchbox']/input")
    private   WebElement buttonSearch;
    @FindBy(xpath="//*[@id=':79']/div/a")
    private WebElement SearchCalc;

    public String getBASE_URL() {
        return BASE_URL;
    }

    public MainPage(WebDriver driver) {
            super(driver);
            PageFactory.initElements(this.driver, this);
    }
    public MainPage openPage () {
            driver.navigate().to(BASE_URL);
            return this;
    }
    public SearchPage inputAndFindDataInSearch () {
            buttonSearch.click();
            buttonSearch.sendKeys("Google Cloud Platform Pricing Calculator");
            SearchCalc.click();
            return new SearchPage(driver);
        }
    }

