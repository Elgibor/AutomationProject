package Tests;

import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import Pages.HomePage;
import org.openqa.selenium.support.PageFactory;

public class base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.launchBrowser("edge","https://ndosisimplifiedautomation.vercel.app/");

    public HomePage homePage = PageFactory.initElements(driver, HomePage.class);
}
