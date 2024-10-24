package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTestWithExcel extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://practicetestautomation.com");
    }

    @Test
    public void userCanLogInExcell() {
        String username = excelReader.getStringData("sheet1", 1, 0);
        String password = excelReader.getStringData("sheet1", 1, 1);

        homepagePage.clickOnPracticeButton();
        practicePage.clickOnTestLoginPageButton();
        logInPage.inputUsername(username);
        logInPage.inputPassword(password);
        logInPage.clickOnSubmitButton();
        Assert.assertTrue(profilePage.getLogOutButton().isDisplayed());
    }



    @Test
    public void userCanNotLogInWithInvalidUsernameExcell () {
        for (int i = 1; i <= excelReader.getLastRow("sheet1"); i++) {
            String password = excelReader.getStringData("sheet1", 1, 1);
            String username = excelReader.getStringData("sheet1", i, 3);

            homepagePage.clickOnPracticeButton();
            practicePage.clickOnTestLoginPageButton();
            logInPage.inputUsername(username);
            logInPage.inputPassword(password);
            Assert.assertTrue(logInPage.getSubmitButton().isDisplayed());
        }
    }

    @Test
    public void userCanNotLogInWithInvalidPasswordExcell () {
        for (int i = 1; i <= excelReader.getLastRow("sheet1"); i++) {
            String username = excelReader.getStringData("sheet1", 1, 0);
            String password = excelReader.getStringData("sheet1", i, 3);

            homepagePage.clickOnPracticeButton();
            practicePage.clickOnTestLoginPageButton();
            logInPage.inputUsername(username);
            logInPage.inputPassword(password);
            Assert.assertTrue(logInPage.getSubmitButton().isDisplayed());
        }
    }
}
