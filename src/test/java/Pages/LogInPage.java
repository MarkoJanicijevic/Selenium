package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

    WebDriver driver;

    WebElement usernameField;
    WebElement passwordField;
    WebElement submitButton;


    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameField() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    //--------------------------------------------

    public void inputUsername (String x) {
        getUsernameField().clear();
        getUsernameField().sendKeys(x);
    }

    public void inputPassword (String x) {
        getPasswordField().clear();
        getPasswordField().sendKeys(x);
    }

    public void clickOnSubmitButton () {
        getSubmitButton().click();
    }


}
