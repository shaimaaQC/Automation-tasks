package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By signInAndLoginLink = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a/i");
    public LoginPage clickOnSignInAndLoginLink () {
    click(signInAndLoginLink);
    return new LoginPage (driver);

    }

}
