package bddtests.common.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

@DefaultUrl("https://hexad.de/home.html")
public class MainPage {

    private WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "header")
    private WebElement header;

    public boolean verifyIfMainPageOpened() {
        return header.isDisplayed();
    }

    public void openMainPage(String URL) {
        webDriver.get(URL);
    }

    public void pressMyCareerLink() {
        webDriver.findElement(By.partialLinkText("Karriere")).click();
    }
}
