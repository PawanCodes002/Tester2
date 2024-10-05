package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = ".//Features",  // Path to your feature files
    glue = "Stepdefination",   // Package where step definitions are located
    dryRun = false,            // Set to true to check if step definitions are missing
    monochrome = true,         // Makes the console output more readable
    		plugin = { "pretty", "html:target/cucumber-report/cucumber.html" },

    tags = "@regression",      // Tag from the feature file
    publish = true             // Enable publishing the report
)
public class Testrun {
}