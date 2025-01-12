package cucumberOptions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",glue ="StepDefinitions",monochrome=true
        , tags ="@regression",plugin = { "pretty", "com.epam.reportportal.cucumber.ScenarioReporter",
        "rerun:rerun.txt" })
public class TestRunnerTest  {
}
