package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDef"},
        features = {"src/test/resources/webFeatures"},
        plugin = {"pretty", "html:reports/cucumber-web.html", "json:reports/cucumber-web.json"},
        tags = "@web",
        monochrome = true
)
public class CucumberTest {
}