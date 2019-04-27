package bddtests.common.actions;

import bddtests.common.pages.CareersApplyPage;

public class CareersApplyPageActions {

    CareersApplyPage careersApplyPage;

    public void fillInMandatoryFields(String title, String fullName, String adress, String email, String phoneField, String uploadResumePath, String position, String jobType) {
        careersApplyPage.fillTitleField(title);
        careersApplyPage.fillFullNameField(fullName);
        careersApplyPage.setAddressField(adress);
        careersApplyPage.setEmailField(email);
        careersApplyPage.setPhoneField(phoneField);
        careersApplyPage.uploadResume(uploadResumePath);
        careersApplyPage.selectPositionField(position);
        careersApplyPage.selectJobType(jobType);
        careersApplyPage.pressOnAgreeCheckBox();
        careersApplyPage.pressSubmitButton();
    }
}