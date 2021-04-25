package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\feature",glue= {"StepDefination"},monochrome = true,
//plugin = {"pretty","html:target/HtmlReport"}
//plugin = {"pretty","json:targert/JSONReport/report.json"}
plugin = {"pretty","json:targert/report1.json"},
tags = "@SmokeTest" )
public class Runner {

}
