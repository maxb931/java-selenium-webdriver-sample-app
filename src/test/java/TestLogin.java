import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import zadanie6.HomePage;
import zadanie6.Zadanie6Locators;
import zadanie6.Zadanie6Page;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * Created by student08 on 15.12.15.
 */
public class TestLogin {

    private static WebDriver webDriver;
    private static HomePage homePage;
    private static Zadanie6Page zadanie6Page;

    @BeforeClass
    public static void setUp()
    {
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }


    @Test
    public void test() {
        webDriver.navigate().to("https://testingcup.pgs-soft.com");
        homePage = new HomePage(webDriver);
        zadanie6Page = new Zadanie6Page(webDriver);
        homePage.clickThisLink();
        zadanie6Page.loginAss("tester","123-xyz");
       task6Page = new Zadanie6Locators();
    }






    @AfterClass
    public static void tearDown(){
//        webDriver.close();
//        webDriver.quit();
    }
}
