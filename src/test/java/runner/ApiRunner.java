package runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:reports/cucumber-api.html", "json:reports/cucumber-api.json"},
        glue = {"stepDef"},
        features = {"src/test/resources/apiFeatures"},
        tags = "@api",
        monochrome = true
)
public class ApiRunner {
}
