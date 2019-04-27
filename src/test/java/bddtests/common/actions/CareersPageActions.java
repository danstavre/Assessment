package bddtests.common.actions;

import bddtests.common.pages.CareersPage;

public class CareersPageActions {

    CareersPage careersPage;

    public boolean verifyCareerApplyButtonPresent() {
        return careersPage.verifyCareersApplyButtonIsPresent();
    }

    public boolean verifyJobDescriptionButtonIsPresent() {
        return careersPage.verifyJobDescriptionButtonIsPresent();
    }

    public void careersPageActions() {
        careersPage.pressCareerApplyButton();
    }
}