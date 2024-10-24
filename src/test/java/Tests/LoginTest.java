package Tests;

import org.testng.Assert;
import Base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://practicetestautomation.com");
    }

    @Test
    public void userCanLogIn() {
        homepagePage.clickOnPracticeButton();
        practicePage.clickOnTestLoginPageButton();
        logInPage.inputUsername("student");
        logInPage.inputPassword("Password123");
        logInPage.clickOnSubmitButton();
        Assert.assertTrue(profilePage.getLogOutButton().isDisplayed());

    }

    @Test
    public void userCanNotLogInWithInvalidUsername () {
        homepagePage.clickOnPracticeButton();
        practicePage.clickOnTestLoginPageButton();
        logInPage.inputUsername("non student");
        logInPage.inputPassword("Password123");
        logInPage.getSubmitButton();
        Assert.assertTrue(logInPage.getSubmitButton().isDisplayed());



    }

    @Test
    public void userCanNotLogInWithInvalidPassword () {
        homepagePage.clickOnPracticeButton();
        practicePage.clickOnTestLoginPageButton();
        logInPage.inputUsername("student");
        logInPage.inputPassword("Password456");
        logInPage.getSubmitButton();
        Assert.assertTrue(logInPage.getSubmitButton().isDisplayed());
    }
}
