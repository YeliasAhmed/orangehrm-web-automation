package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage {

    WebDriver driver;

    By admin = By.xpath("//span[normalize-space()='Admin']");





    public AdminPage(WebDriver driver) {this.driver = driver;}

    public WebElement getAdmin() {return driver.findElement(admin);}
}
