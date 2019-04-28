package bddtests.steps;

import bddtests.common.pages.CareersPage;
import bddtests.common.pages.MainPage;
import net.thucydides.core.annotations.Step;

import static bddtests.common.DriverSetUp.getDriver;

public class ApplyStep {

    private static final String URL = "https://hexad.de/home.html";

    public MainPage mainPage;

    @Step("Open main page")
    public void openHexadMainPage() {
        mainPage = new MainPage(getDriver());
        mainPage.openMainPage(URL);
    }

    @Step("Verify main page is opened")
    public boolean verifyMainPageIsOpened() {
        return mainPage.verifyIfMainPageOpened();
    }

    @Step("Click on careers link")
    public void clickOnCareerLink() {
        mainPage.pressMyCareerLink();
    }

    @Step
    public boolean verifyCareersPageIsOpen(){
        return new CareersPage(getDriver()).verifyCareersApplyButtonIsPresent();
    }

    @Step("Click on apply button")
    public void clickOnApplyButton() {
        mainPage.pressMyCareerLink();
    }
}