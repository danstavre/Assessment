package bddtests.steps;

import bddtests.common.pages.CareersApplyPage;
import bddtests.common.pages.CareersPage;
import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

import static junit.framework.TestCase.assertTrue;

public class ApplyStepDefinitions extends SerenityStories {

    @Steps
    ApplyStep applySteps;

    @Steps
    CareersPage careersPage;

    @Steps
    CareersApplyPage careersApplyPage;

    @Given("Customer is on the Hexad main page")
    public void openHexadmainPage() {
        applySteps.openHexadMainPage();
        assertTrue("Main page is not opened ", applySteps.verifyMainPageIsOpened());
    }

    @Given("Customer navigates to Careers page")
    public void pressCareerLink() {
        applySteps.clickOnCareerLink();
        assertTrue("Careers page is not opened ", applySteps.verifyCareersPageIsOpen());
    }

    @When("Customer clicks on 'Apply now' for a position")
    public void pressCareerButton() {
        careersPage.pressCareerApplyButton();
    }

    @Then("Customer is redirected to an 'Careers Apply' page")
    public void verifyCustomerIsOnProperPage(){
        assertTrue("Careers Apply page is not opened", careersApplyPage.verifyCustomerIsOnCareerApplyPage());
    }

    @Then("Customer is able to apply for a position with next data:$examplesTable")
    public void customerAppliesForAPosition(ExamplesTable examplesTable) {
        Map<String, String> examplesTableRow = examplesTable.getRow(0);
        careersApplyPage.fillTitleField(examplesTableRow.get("title"));
        careersApplyPage.fillFullNameField(examplesTableRow.get("fullName"));
        careersApplyPage.setAddressField(examplesTableRow.get("address"));
        careersApplyPage.setEmailField(examplesTableRow.get("email"));
        careersApplyPage.setPhoneField(examplesTableRow.get("phone"));
        careersApplyPage.selectPositionField(examplesTableRow.get("position"));
        careersApplyPage.selectJobType(examplesTableRow.get("jobType"));
        careersApplyPage.uploadResume("../resources/cv.txt");
        careersApplyPage.pressOnAgreeCheckBox();
        careersApplyPage.pressSubmitButton();
    }
}
