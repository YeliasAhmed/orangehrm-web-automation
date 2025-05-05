import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Base {
    public WebDriver driver;
    public WebDriver driverSetup(){


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://distibutor-web-design.vercel.app/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
    }
    public void CloseDriver(){
        if (driver!=null){
            driver.quit();
        }

    }
}
