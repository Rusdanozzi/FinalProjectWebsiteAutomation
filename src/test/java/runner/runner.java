package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue= {"stepDef"},
        plugin = {"pretty", "html:target/cucumber-report-1.html"},
        tags = "@Board"
)

public class runner {
}
