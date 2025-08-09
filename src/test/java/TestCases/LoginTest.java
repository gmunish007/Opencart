package TestCases;

import Abstract.BaseClass;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    //public WebDriver driver;

    @Test(groups="Sanity")
    public void verify_login() {

        //HomPage
        HomePage hp = new HomePage(driver);
        hp.clickMyAccount();
        hp.clickLoginButton();

        //LoginPage
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginEmail(p.getProperty("email"));
        loginPage.loginPwd(p.getProperty("password"));

        loginPage.clickLoginButton();

        //MyAccountPage
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        boolean targetPage = myAccountPage.isMyAccountExist();

        //Assert.assertEquals(targetPage, true, "Login failed");
        Assert.assertTrue(targetPage);

        System.out.println("Updated again.");
    }
}
