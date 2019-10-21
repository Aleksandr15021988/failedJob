package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

    protected WebDriver driver;

    protected abstract AbstractPage openPage();

    protected AbstractPage(WebDriver driver) {

        this.driver = driver;
    }

    protected WebElement waitToBeClickable(String xpath) {
        return  new WebDriverWait(driver,180)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }
    protected WebElement waitToBePresenceOfElementLocated(String xpath) {
        return  new WebDriverWait(driver,10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }
}