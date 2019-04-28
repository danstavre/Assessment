package bddtests.common.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.components.FileToUpload;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.Paths;

@DefaultUrl("https://hexad.de/careers-apply.html")
public class CareersApplyPage extends PageObject {

    public CareersApplyPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id="Title")
    private WebElement titleField;

    @FindBy(id="Full Name")
    private WebElement fullNameField;

    @FindBy(id ="Email")
    private WebElement emailField;

    @FindBy(id = "Address")
    private WebElement addressField;

    @FindBy(id = "phone")
    private WebElement phoneField;

    @FindBy(name = "file")
    private WebElement fileUpload;

    @FindBy(name= "position")
    private WebElement positionField;

    @FindBy(name= "jobtype")
    private WebElement jobTypeField;

    @FindBy(className = "checkbox")
    private WebElement agreeCheckBox;

    @FindBy(xpath = "//*[@id=\"carrerForm\"]/div[10]/div/button")
    private WebElement submitButton;

    public void fillTitleField(String titleValue) {
        titleField.sendKeys(titleValue);
    }

    public void fillFullNameField(String fullNameValue) {
        fullNameField.sendKeys(fullNameValue);
    }

    public void setEmailField(String emailFieldValue) {
        emailField.sendKeys(emailFieldValue);
    }

    public void setPhoneField(String phoneFieldValue) {}

    public void setAddressField(String addressFieldValue) {
        addressField.sendKeys(addressFieldValue);
    }

    public void uploadResume(String pathToMyResume){
        FileToUpload fileToUpload = new FileToUpload(getDriver(), Paths.get(pathToMyResume).getFileName().toString());
        fileToUpload.fromLocalMachine().to(fileUpload);
    }

    public void selectPositionField(String positionValue) {
        Select position = new Select(positionField);
        position.selectByVisibleText(positionValue);
    }

    public void selectJobType(String jobType) {
        Select position = new Select(jobTypeField);
        position.selectByVisibleText(jobType);
    }

    public void pressOnAgreeCheckBox() {
        if (agreeCheckBox.isSelected()) {
            agreeCheckBox.click();
        }
    }

    public void pressSubmitButton() {
        submitButton.click();
    }

    public boolean verifyCustomerIsOnCareerApplyPage(){
       return submitButton.isDisplayed();
    }

    CareersApplyPage(){}
}