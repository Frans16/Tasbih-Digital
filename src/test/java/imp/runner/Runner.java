package imp.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\source\\imp.feature", 
		glue = "imp.stepDefinition",
		plugin = {}
		)
public class Runner {

}
