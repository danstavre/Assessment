package bddtests.common;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetUp extends ConfigurationProperties {

    static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    private static WebDriver initChromeDriver(String url) {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
        return driver;
    }

    public static void setDriver(String url) {
        driver = initChromeDriver(url);
    }

    @BeforeClass
    public static void initializeTestBaseSetup() {
        try {
            setDriver(CHROME_DRIVER_PATH);
        } catch (Exception e) {
            System.out.println("Error" + e.getStackTrace());
        }
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Closing browser. ");
        getDriver().manage().deleteAllCookies();
        getDriver().quit();
    }
}