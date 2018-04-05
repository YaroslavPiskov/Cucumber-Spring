package CucumberTest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report/CucumberTest1"},
                features = "src/test/java/CucumberTest/features/",
                glue = "CucumberTest/stepDefs"
                )
public class RunCucumberTest1 {
}
