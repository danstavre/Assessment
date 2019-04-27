package bddtests.common.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://hexad.de/en/careers.html")
public class CareersPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"inner-content\"]/div/div[2]/div[3]/button[1]")
    private WebElement careerApplyButton;

    @FindBy(xpath = "//*[@id=\"inner-content\"]/div/div[2]/div[3]/button[2]")
    private WebElement jobJescriptionButton;

    public boolean verifyCareersApplyButtonIsPresent() {
        return careerApplyButton.isDisplayed();
    }

    public boolean verifyJobDescriptionButtonIsPresent() {
        return jobJescriptionButton.isDisplayed();
    }

    public void pressCareerApplyButton() {
        careerApplyButton.click();
    }

    public void pressJobDescriptionButton() {
        jobJescriptionButton.click();
    }
}