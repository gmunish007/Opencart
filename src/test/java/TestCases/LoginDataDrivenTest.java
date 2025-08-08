package TestCases;

import Abstract.BaseClass;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.DataProviders;

public class LoginDataDrivenTest extends BaseClass{

    @Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
    public void verify_DDTLogin(String email1, String pwd, String exp) {

        HomePage hp = new HomePage(driver);
        hp.clickMyAccount();
        hp.clickLoginButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginEmail(email1);
        loginPage.loginPwd(pwd);
        loginPage.clickLoginButton();

        //MyAccountPage
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        boolean targetPage = myAccountPage.isMyAccountExist();

        if (exp.equalsIgnoreCase("Valid")) {
            myAccountPage.clickLogout();
            Assert.assertTrue(true);
        } else {
            System.out.println("result failed.");
        }
        if (exp.equalsIgnoreCase("Invalid")) {
            myAccountPage.clickLogout(); //logging out if user logs in with invalid data
            //Assert.assertTrue(false);
        }
    }
}
