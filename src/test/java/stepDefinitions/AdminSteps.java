package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.AdminPage;
import utils.ContextSetup;

import java.time.Duration;

public class AdminSteps {
    WebDriver driver;
    AdminPage adminPage;
    ContextSetup contextSetup;
    WebDriverWait wait;


    public AdminSteps(ContextSetup contextSetup) {
        this.contextSetup = contextSetup;
        this.driver = contextSetup.driver;
        adminPage = new AdminPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }



    @Given("I click on the Admin")
    public void i_click_on_the_admin() {
        wait.until(ExpectedConditions.visibilityOf(adminPage.getAdmin()));
        Assert.assertTrue(adminPage.getAdmin().isDisplayed());
        adminPage.getAdmin().click();
    }


}
