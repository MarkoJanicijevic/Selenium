package Base;

import Pages.HomepagePage;
import Pages.LogInPage;
import Pages.PracticePage;
import Pages.ProfilePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class BaseTest {
    public WebDriver driver;
    public HomepagePage homepagePage;
    public LogInPage logInPage;
    public PracticePage practicePage;
    public ProfilePage profilePage;
    public ExcelReader excelReader;


    @BeforeClass
    public void setUP () throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homepagePage = new HomepagePage(driver);
        logInPage = new LogInPage(driver);
        practicePage = new PracticePage(driver);
        profilePage = new ProfilePage(driver);
        excelReader = new ExcelReader("C:\\Users\\Djang\\Selenium\\TestData.xlsx");
    }
}
