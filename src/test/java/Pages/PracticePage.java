package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePage{
    WebDriver driver;
    WebElement testLoginPageButton;

    public PracticePage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getTestLoginPageButton() {
        return driver.findElement(By.cssSelector("a[href='https://practicetestautomation.com/practice-test-login/']"));
    }

    //---------------------------------------

    public void clickOnTestLoginPageButton () {
        getTestLoginPageButton().click();
    }
}
