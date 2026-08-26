import Tests.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginTest extends base {
    WebDriver driver;

    @Test
    public void clickLoginButton() throws InterruptedException {
        homePage.clickLoginButton();
    }

    /*@AfterTest
    public void tearDown(){
        driver.quit();
    }*/

}
