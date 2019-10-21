package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadMailPage extends AbstractPage {
    private String  ReadMailPage_URL = "https://10minutemail.net/readmail.html?mid=WR0bvu";
    @FindBy(xpath = "//h3[contains(text(),'USD')]")
    private WebElement TotalCost;

    public WebElement getTotalCost() {
        return TotalCost;
    }
    public ReadMailPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public ReadMailPage openPage () {
        driver.navigate().to(ReadMailPage_URL);
        return this;
    }
}
