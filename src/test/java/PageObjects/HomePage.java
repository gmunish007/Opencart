package PageObjects;

import Abstract.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    //WebDriver driver;
    public HomePage(WebDriver driver) {
        super(driver);
        //this.driver = driver;
    }

    By myAccount = By.xpath("//ul[@class='list-inline']/li[2]");

    By register = By.linkText("Register");

    By login = By.linkText("Login");

    //click on my Account button
    public void clickMyAccount() {
        driver.findElement(myAccount).click();
    }

    //click on Register button
    public void clickRegister() {
        driver.findElement(register).click();
    }

    //click on login button
    public void clickLoginButton() {
        driver.findElement(login).click();
    }
}
