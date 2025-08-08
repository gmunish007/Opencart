package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyAccountPage extends BasePage {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    By msgHeading = By.xpath("//h2[text()='My Account']");
    By logout = By.xpath("//a[@class='list-group-item'][text()='Logout']");

    public boolean isMyAccountExist() {
        String msg = driver.findElement(msgHeading).getText();
        Assert.assertEquals(msg, "My Account");
        return driver.findElement(msgHeading).isDisplayed();
    }

    public void clickLogout() {
        driver.findElement(logout).click();
    }
}
