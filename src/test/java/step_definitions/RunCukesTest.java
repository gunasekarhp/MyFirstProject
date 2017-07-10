package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {}
		)
//@CucumberOptions(plugin = { "html:target/cucumber-html-report",
//		"json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
//		"usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
//		features = { "./src/test/java/com/github/mkolisnyk/cucumber/features" },
//		glue = { "com/github/mkolisnyk/cucumber/steps" })

public class RunCukesTest{
	
}