package utils;

import base.Base;
import org.openqa.selenium.WebDriver;

public class ContextSetup {

    public WebDriver driver;
    public Base base;

    public ContextSetup() {
         base = new Base();
        driver = base.driverSetup();
    }
}

