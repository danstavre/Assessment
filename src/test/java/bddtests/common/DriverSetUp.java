package bddtests.common;

import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeStories;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetUp {

    static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    private static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static void setDriver() {
        driver = initChromeDriver();
    }

    @BeforeStories
    public void initializeTestBaseSetup() {
        try {
            setDriver();
        } catch (Exception e) {
            System.out.println("Error" + e.getStackTrace());
        }
    }

    @AfterStories
    public void tearDown() {
        System.out.println("Closing browser. ");
        getDriver().manage().deleteAllCookies();
        getDriver().quit();
    }
}