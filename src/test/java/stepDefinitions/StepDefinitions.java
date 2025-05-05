package stepDefinitions;

import base.ConfigReader;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.Page;
import base.Base;

public class StepDefinitions {

    private static WebDriver driver;
    Page page;

    public StepDefinitions() {
        if (driver == null) {
            Base base = new Base();
            driver = base.driverSetup();
        }
        page = new Page(driver);
    }




    public static WebDriver getDriver() {
        return driver;
    }

    @Given("I launch the distributor application")
    public void i_launch_the_application() {


    }

    @When("I enter the phone number")
    public void i_enter_the_phone_number() {
        page.getPhoneNo().sendKeys(ConfigReader.get("username"));
    }

    @When("I click on submit button")
    public void i_click_on_submit_button() {
        page.getSubmit().click();
    }

    @When("I enter the PIN")
    public void i_enter_the_pin() {
        page.getPin().sendKeys(ConfigReader.get("pin"));
    }

    @When("I click on submit button again")
    public void i_click_on_submit_button_again() {
        page.getSubmit().click();
    }

    @Then("I should see the product list")
    public void i_should_see_product_list() {
        page.getProductList().isDisplayed();
    }

    @When("I click on the product list")
    public void i_click_on_product_list() {
        page.getProductList().click();
    }

    @When("I click on add product")
    public void i_click_on_add_product() {
        page.getAddProduct().click();

    }
}

