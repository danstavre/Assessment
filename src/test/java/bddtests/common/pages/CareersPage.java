package bddtests.common.pages;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

//TODO(danstavre): use EN version.
@DefaultUrl("https://hexad.de/careers.html")
public class CareersPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"inner-content\"]/div/div[2]/div[3]/button[2]")
    private WebElement jobJescriptionButton;

    public boolean verifyCareersApplyButtonIsPresent() {
        return getCareerApplyButton().isDisplayed();
    }

    public boolean verifyJobDescriptionButtonIsPresent() {
        return jobJescriptionButton.isDisplayed();
    }

    public void pressCareerApplyButton() {
        getCareerApplyButton().click();
    }

    public void pressJobDescriptionButton() {
        jobJescriptionButton.click();
    }

    private WebElement getCareerApplyButton() {
        WebDriver webDriver = getDriver();
        PageFactory.initElements(webDriver, this);
        return webDriver.findElement(By.partialLinkText(" Jetzt bewerben"));
    }
}