package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./features", glue = "stepDefination.rest", plugin = { "pretty",
		"html:target/cucumber-reports.html", "json:target/cucumber.json",
		}, tags = "@RestDemo")

public class Runner {
	public static void sendEmail() {

		System.out.println("Send Email of execution");
		
	}
	
}
