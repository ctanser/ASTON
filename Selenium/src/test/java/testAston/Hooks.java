package testAston;


import PageObject.LandingPage;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;

public class Hooks {
    LandingPage landingPage;
    @Before
    public void prepareData() {
        //подготовить данные
    }

    @After
    public void close_browser() throws Throwable {
        System.out.println("This will run after the Scenario");
        landingPage = new LandingPage();
        landingPage.closeBrowser();
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