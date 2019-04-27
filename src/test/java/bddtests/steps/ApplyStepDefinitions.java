package bddtests.steps;

import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;

import static junit.framework.TestCase.assertTrue;

public class ApplyStepDefinitions extends SerenityStories {

    @Steps
    ApplyStep applySteps;

    @Given("Customer is on the Hexad main page")
    public void openHexadmainPage() {
        applySteps.openHexadMainPage();
        assertTrue("Main page is not opened ", applySteps.verifyMainPageIsOpened());
    }

    @Given("Customer navigates to Careers page")
    public void pressCareerLink() {
        applySteps.clickOnCareerLink();
    }
}