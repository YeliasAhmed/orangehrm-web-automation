
import org.openqa.selenium.WebDriver;


public class Test extends Page{

    WebDriver driver;

    public Test(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public void testSteps(){
        getPhoneNo().sendKeys("01581578235");
        getSubmit().click();
        getPin().sendKeys("12345");
        getSubmit().click();
        getProductList().isDisplayed();
        getProductList().click();
        getAddProduct().click();
    }

}
