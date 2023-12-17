package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="G://Java WorkSpace//orangeHRMCucumberAutomation//Features//orangeHRM.feature",
glue = "stepDefinations")
public class testRunner {
}
