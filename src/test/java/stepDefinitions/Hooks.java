package stepDefinitions;


import io.cucumber.java.After;

import utils.ContextSetup;

public class Hooks {
     ContextSetup contextSetup;

    public Hooks(ContextSetup contextSetup) {
        this.contextSetup = contextSetup;
    }

    @After
    public void afterScenario() {
        if (contextSetup.base.driver != null) {
            contextSetup.base.driver.quit();
        }
    }
}
