package bddtests.common.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://hexad.de/en/home.html")
public class MainPage {

    WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//*[@id=\"main_navigation_menu\"]/li[6]/a")
    private WebElement myCareerLink;

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[1]/a")
    private WebElement homePageLogo;

    public boolean verifyIfMainPageOpened() {
        return homePageLogo.isDisplayed();
    }

    public void openMainPage(String URL) {
        webDriver.get(URL);
    }

    public void pressMyCareerLink() {
        myCareerLink.click();
    }
}
