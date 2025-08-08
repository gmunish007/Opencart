package TestCases;

import Abstract.BaseClass;
import PageObjects.HomePage;
import PageObjects.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class RegistrationTest extends BaseClass {

    //public WebDriver driver;

    @Test(groups={"Regression", "Master"})
    public void verifyAccountRegistration() {

        HomePage hp = new HomePage(driver);
        RegisterPage rp = new RegisterPage(driver);

        hp.clickMyAccount();
        hp.clickRegister();

        rp.setFirstName(randomString().toUpperCase());
        rp.setLastName(randomString().toUpperCase());
        rp.setEmail(randomString().toUpperCase() + "@gmail.com");

        String password = randomNumber();
        rp.setTelephone(password);
        rp.setPassword(password);
        rp.setConfirmPassword(password);

        rp.setPrivacyPolicy();
        rp.clickContinue();

        String confirmMsg = rp.getConfirmationMsg();
        System.out.println(confirmMsg);
    }
}
