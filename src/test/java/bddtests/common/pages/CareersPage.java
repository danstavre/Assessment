package bddtests.common.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

@DefaultUrl("https://hexad.de/careers.html")
public class CareersPage extends PageObject {

    public CareersPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public boolean verifyCareersApplyButtonIsPresent() {
        return getCareerApplyButton().isDisplayed();
    }


    public boolean verifyJobDescriptionButtonIsPresent() {
        return getJobDescriiptionButton().isDisplayed();
    }

    public void pressCareerApplyButton() {
        getCareerApplyButton().click();
    }

    public void pressJobDescriptionButton() {
        getJobDescriiptionButton().click();
    }

    private WebElement getCareerApplyButton() {
        return getDriver().findElement(By.buttonText("Jetzt bewerben"));
    }

    private WebElement getJobDescriiptionButton() {
        return getDriver().findElement(By.buttonText("Stellenbeschreibung"));
    }

    CareersPage(){}
}