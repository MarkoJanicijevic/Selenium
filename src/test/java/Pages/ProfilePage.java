package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage{

    WebDriver driver;
    WebElement logOutButton;

    public ProfilePage (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogOutButton() {
        return driver.findElement(By.cssSelector(".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));
    }

    //________________________

    public void clickOnLogOutButton () {
        getLogOutButton().click();
    }
}
