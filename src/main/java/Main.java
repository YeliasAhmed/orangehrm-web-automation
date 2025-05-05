import org.openqa.selenium.WebDriver;


public class Main {

    public static void main(String[] args) {
        Base base = new Base();
        WebDriver driver = base.driverSetup();
        Test test = new Test(driver);
        test.testSteps();
        base.CloseDriver();

    }

}