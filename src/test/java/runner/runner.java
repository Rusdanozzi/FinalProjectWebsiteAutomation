package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Feature",
        glue= {"stepDef"},
        plugin = {"pretty", "html:target/cucumber-report-final.html"},
        tags = "@GroupChat"
)

public class runner {
}
