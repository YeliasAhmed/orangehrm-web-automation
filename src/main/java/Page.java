import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {

    public WebDriver driver;

    public Page(WebDriver driver){
        this.driver=driver;
    }

    By phoneNo = By.xpath("//input[@id='number']");
    By submit = By.xpath("//button[@type='submit']");
    By pin = By.xpath("//input[@id='PIN']");
    By productList = By.xpath("(//p[normalize-space()='প্রোডাক্ট লিস্ট'])[1]");
    By addProduct = By.xpath("//button[contains(text(),'পণ্য যোগ করুন')]");


    public WebElement getPhoneNo(){
        return driver.findElement(phoneNo);
    }
    public WebElement getSubmit(){
        return driver.findElement(submit);
    }
    public WebElement getPin(){
        return driver.findElement(pin);
    }
    public WebElement getProductList(){
        return driver.findElement(productList);
    }
    public WebElement getAddProduct(){
        return driver.findElement(addProduct);
    }
}
