package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    By companyBranding = By.xpath("//img[@alt='company-branding']");
    By username = By.xpath("//input[@placeholder='Username']");
    By password = By.xpath("//input[@placeholder='Password']");
    By loginButton = By.xpath("//button[@type='submit']");
    By dashboard = By.xpath("//h6[normalize-space()='Dashboard']");
    By invalidMessage = By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']");


    public WebElement getCompanyBranding(){return driver.findElement(companyBranding);}
    public WebElement getUsername(){return driver.findElement(username);}
    public WebElement getPassword(){
        return driver.findElement(password);
    }
    public WebElement getLoginButton(){
        return driver.findElement(loginButton);
    }
    public WebElement getDashboard(){
        return driver.findElement(dashboard);
    }
    public WebElement getInvalidMessage(){
        return driver.findElement(invalidMessage);
    }
}
