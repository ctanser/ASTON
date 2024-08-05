package testAston;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report/smoketest"},
        features = "src/test/features",
        glue = "testAston",
        tags = "@mts"
)
public class RunnerTest {
}