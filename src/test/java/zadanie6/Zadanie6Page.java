package zadanie6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by student08 on 15.12.15.
 */
public class Zadanie6Page {
    private Zadanie6Locators zadanieHomePage;

    public Zadanie6Page(WebDriver driver) {

        zadanieHomePage = new Zadanie6Locators();
        PageFactory.initElements(driver,zadanieHomePage);
    }

    public void loginAss(String loginm, String pass){
        zadanieHomePage.login.sendKeys("user");
        zadanieHomePage.password.sendKeys("pass");
        zadanieHomePage.button.click();
    }
}
