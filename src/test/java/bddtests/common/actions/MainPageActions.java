package bddtests.common.actions;

import org.openqa.selenium.WebDriver;
import bddtests.common.pages.MainPage;

public class MainPageActions {

    WebDriver webDriver;

    MainPage mainPage;

    public void pressMyCareerLink() {
        mainPage.pressMyCareerLink();
    }

    public boolean openMainPage() {
        return mainPage.verifyIfMainPageOpened();
    }

    public boolean verifyIfMainPageOpened() {
        return mainPage.verifyIfMainPageOpened();
    }
}