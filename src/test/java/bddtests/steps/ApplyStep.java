package bddtests.steps;

import bddtests.common.pages.CareersPage;
import bddtests.common.pages.MainPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplyStep {

    private static final String URL = "https://hexad.de/home.html";

    public MainPage mainPage;

    @Step("Open main page")
    public void openHexadMainPage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(URL);
        mainPage = new MainPage(driver);
        mainPage.openMainPage(URL);
    }

    @Step("Verify main page is opened")
    public boolean verifyMainPageIsOpened() {
        return mainPage.verifyIfMainPageOpened();
    }

    @Step("Click on careers link")
    public void clickOnCareerLink() {
        mainPage.pressMyCareerLink();
    }
}