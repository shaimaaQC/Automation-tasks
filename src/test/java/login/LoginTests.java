package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.io.FileNotFoundException;

import static Reader.ReadDataFromJson.dataModel;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {
WebDriver driver;
@Test
    public void testSuccessfulLogin () throws FileNotFoundException {

    LoginPage loginPage = homePage.clickOnSignInAndLoginLink();
    loginPage.loginFeature(
            dataModel().Login.ValidCredentials.Username,
            dataModel().Login.ValidCredentials.Password);

    WebElement button = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
    boolean isDisplayed = button.isDisplayed();

    // Assert using TestNG
    Assert.assertTrue(isDisplayed, "The button is not displayed!");

    System.out.println("Button is displayed: " + isDisplayed);



}

}
