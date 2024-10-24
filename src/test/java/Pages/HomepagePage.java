package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepagePage {

    WebDriver driver;
    WebElement practiceButton;

    public HomepagePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPracticeButton() {
        return driver.findElement(By.id("menu-item-20"));
    }


    //----------------------------------------------------------

    public void clickOnPracticeButton(){
        getPracticeButton().click();
    }


}
