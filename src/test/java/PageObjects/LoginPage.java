package PageObjects;

import Abstract.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By email = By.id("input-email");

    By password = By.id("input-password");

    By loginButton = By.xpath("//input[contains(@class,'btn-primary')]");

    public void loginEmail(String emailId) {
        driver.findElement(email).sendKeys(emailId);
    }

    public void loginPwd(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}
