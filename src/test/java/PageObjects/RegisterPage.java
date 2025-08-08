package PageObjects;

import Abstract.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    By txtFirstName = By.xpath("//input[@id='input-firstname']");

    By txtLastName = By.xpath("//input[@id='input-lastname']");

    By txtEmail = By.xpath("//input[@id='input-email']");

    By txtTelephone = By.xpath("//input[@id='input-telephone']");

    By txtPassword = By.xpath("//input[@id='input-password']");

    By txtCofirmPassword = By.xpath("//input[@id='input-confirm']");

    By checkPolicy = By.xpath("//input[@name='agree']");

    By btnContinue = By.xpath("//input[@value='Continue']");

    By msgConfirmation = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");


    public void setFirstName(String fname) {
        driver.findElement(txtFirstName).sendKeys(fname);
    }

    public void setLastName(String lname) {
        driver.findElement(txtLastName).sendKeys(lname);
    }

    public void setEmail(String email) {
        driver.findElement(txtEmail).sendKeys(email);
    }

    public void setTelephone(String telephone){
        driver.findElement(txtTelephone).sendKeys(telephone);
    }

    public void setPassword(String password) {
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void setConfirmPassword(String password){
        driver.findElement(txtCofirmPassword).sendKeys(password);
    }

    public void setPrivacyPolicy() {
        driver.findElement(checkPolicy).click();
    }

    public void clickContinue() {
        driver.findElement(btnContinue).click();
    }

    public String getConfirmationMsg() {
        return driver.findElement(msgConfirmation).getText();
    }

}
