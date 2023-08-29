package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class )
@CucumberOptions(features="C:\\Users\\16475\\eclipse-workspace\\AmazonAutomation\\src\\test\\java\\feature", glue= {"Stepdefination"}, 
plugin= {"pretty","html:target/HTmlreports.html"},monochrome=true, dryRun=true, tags= "@smoke" )

public class Testrunner {

}
