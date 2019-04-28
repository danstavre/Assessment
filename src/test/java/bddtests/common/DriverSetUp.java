package bddtests.common;

import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeStories;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetUp {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    private static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        return driver;
    }

    private static void setDriver() {
        driver = initChromeDriver();
    }

    @BeforeStories
    public void initializeTestBaseSetup() {
        try {
            setDriver();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @AfterStories
    public void tearDown() {
        System.out.println("Closing browser. ");
        getDriver().manage().deleteAllCookies();
        getDriver().quit();
    }
}