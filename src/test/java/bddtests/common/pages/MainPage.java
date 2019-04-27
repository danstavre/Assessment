package bddtests.common.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

@DefaultUrl("https://hexad.de/en/home.html")
public class MainPage {

    WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "header")
    private WebElement header;

    @FindBy(tagName ="li")
    private WebElement careerLink;

    public boolean verifyIfMainPageOpened() {
        return header.isDisplayed();
    }

    public void openMainPage(String URL) {
        webDriver.get(URL);
    }

    public void pressMyCareerLink() {
        careerLink.click();
    }
}
