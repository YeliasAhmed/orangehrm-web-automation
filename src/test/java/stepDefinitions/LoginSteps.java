package stepDefinitions;

import base.ConfigReader;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.LoginPage;
import base.Base;
import utils.ContextSetup;

import java.time.Duration;

public class LoginSteps {

    private static WebDriver driver;
    LoginPage loginPage;
    ContextSetup contextSetup;
    WebDriverWait wait;

    public LoginSteps( ContextSetup contextSetup) {
        this.contextSetup = contextSetup;
        this.driver = contextSetup.driver;
        loginPage = new LoginPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }


    @Given("I open orangeHRM application and login page is displayed")
    public void login_page() {
        wait.until(ExpectedConditions.visibilityOf(loginPage.getCompanyBranding()));
        Assert.assertTrue(loginPage.getCompanyBranding().isDisplayed());
    }

    @When("I enter the valid username")
    public void valid_username() {
        loginPage.getUsername().sendKeys(ConfigReader.get("valid_username"));
    }
    @When("I enter the invalid username")
    public void invalid_username() {
        loginPage.getUsername().sendKeys(ConfigReader.get("invalid_username"));
    }

    @When("I enter the valid password")
    public void valid_password() {
        loginPage.getPassword().sendKeys(ConfigReader.get("valid_password"));
    }

 @When("I enter the invalid password")
    public void invalid_password() {
        loginPage.getPassword().sendKeys(ConfigReader.get("invalid_password"));
    }

    @When("I click on login button")
    public void login_button() throws InterruptedException {
        loginPage.getLoginButton().click();
        Thread.sleep(5000);
    }

    @Then("I checked that the dashboard page is displayed")
    public void dashboard() {
        Assert.assertTrue(loginPage.getDashboard().isDisplayed());
    }

    @When("I checked that invalid credential message is displayed")
    public void invalid_credential() {
        wait.until(ExpectedConditions.visibilityOf(loginPage.getInvalidMessage()));
        Assert.assertTrue(loginPage.getInvalidMessage().isDisplayed());
    }

}

