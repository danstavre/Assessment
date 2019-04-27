package bddtests.common.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("https://hexad.de/en/home.html")
public class CareersApplyPage {

    @FindBy(xpath = "//*[@id=\"Title\"]")
    private WebElement titleField;

    @FindBy(xpath = "//*[@id=\"Full Name\"]")
    private WebElement fullNameField;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id=\"Address\"]")
    private WebElement addressField;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement phoneField;

    @FindBy(xpath = "document.querySelector('#carrerForm > div:nth-child(6) > div > input[type=\"file\"]')")
    private WebElement fileUpload;

    @FindBy(xpath = "//*[@id=\"carrerForm\"]/div[7]/div/select")
    private WebElement positionField;

    @FindBy(xpath = "//*[@id=\"carrerForm\"]/div[8]/div/select")
    private WebElement jobTypeField;

    @FindBy(xpath = "//*[@id=\"carrerForm\"]/div[9]/div/div/label/input")
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

    public void setAddressField(String addressFieldValue) {
        addressField.sendKeys(addressFieldValue);
    }

    public void setPhoneField(String phoneFieldValue) {
        phoneField.sendKeys(phoneFieldValue);
    }

    public void uploadResume(String pathToMyResume){
        fileUpload.sendKeys(pathToMyResume);
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
}