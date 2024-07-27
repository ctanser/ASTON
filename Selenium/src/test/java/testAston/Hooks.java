package testAston;


import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;

import static testAston.Driver.driver;

public class Hooks {

    @Before
    public void prepareData() {
        //подготовить данные
    }

    @After
    public void close_browser() throws Throwable {
        driver.quit();
    }

    @After
    public void getScenarioInfo(Scenario scenario) {
        System.out.println(scenario.getId());
        System.out.println(scenario.getName());
        System.out.println(scenario.getStatus());
        System.out.println(scenario.isFailed());
        System.out.println(scenario.getSourceTagNames());
    }
}