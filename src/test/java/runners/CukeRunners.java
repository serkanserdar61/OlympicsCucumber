package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "stepdefinitions",
		dryRun = false,
		//monochrome=true,
		//strict=true,
		//tags = "@smoke_test",

		plugin = {"html:target/default-cucumber-reports",
				"json:target/cucumber.json",
				"rerun:target/rerun.txt"

				//"pretty","html:target/cucumber"
				//"junit:target/cukes.xml"

		}
)

public class CukeRunners {
}
