package service;

import driver.DriverSingletone;
import org.openqa.selenium.JavascriptExecutor;
import java.util.ArrayList;

public class Switcher {
    static ArrayList<String> tabs;


    public static void openNewWindow() {
        ((JavascriptExecutor) DriverSingletone.getDriver()).executeScript("window.open()");

    }

    public static void switchToFirstPage() {
        ArrayList<String> tabs = new ArrayList(DriverSingletone.getDriver().getWindowHandles());
        DriverSingletone.getDriver().switchTo().window(tabs.get(0));
    }

    public static void switchToSecondPage() {
        ArrayList<String> tabs = new ArrayList(DriverSingletone.getDriver().getWindowHandles());
        DriverSingletone.getDriver().switchTo().window(tabs.get(1));
    }

}
