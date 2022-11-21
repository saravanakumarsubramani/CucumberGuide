package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="featurefile" , 
glue="stepdefifnitions",
dryRun=false,
monochrome=true,
plugin= {"pretty","html:report/WebReport","json:report/jsonreport.json"},
tags= "@TaggedHook"
)
public class RunnerClass {

}
