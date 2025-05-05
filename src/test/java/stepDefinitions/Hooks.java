package stepDefinitions;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;

public class Hooks {
    @After
    public void tearDown() {
        WebDriver driver = StepDefinitions.getDriver();
        if (driver != null) {
            driver.quit();
        }
    }
}
