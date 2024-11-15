package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginPage extends MethodHandles {
    public LoginPage (WebDriver driver) {
        super(driver);
    }
    private final By emailField =By.name("email");

    private final By passwordField =By.name("password");

    private final By loginButton = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");

    private  void insertEmail (String username) {
    sendKeys(emailField,username);
}
    private  void insertPassword (String password) {
        sendKeys(passwordField,password);
    }
    private void clickOnLoginButton () {
    click(loginButton);
}
public LoginPage loginFeature (String email, String password) {
       insertEmail(email);
       insertPassword(password);
        clickOnLoginButton();
        return new LoginPage(driver);
}

}
