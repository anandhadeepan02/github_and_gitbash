package runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\anand\\eclipse-workspace\\cheapair.com\\src\\test\\resources\\Featurefile",
glue="stepdefenition",dryRun=!true)
public class Runnerclass {

}
