package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\feature",glue= {"StepDefination"},monochrome = true,
//plugin = {"pretty","html:target/HtmlReport"},
plugin = {"pretty","json:targert/report3.json"},
//plugin = {"pretty","junit:targert/juintreport/report.xml"},
 tags = "@GoogleSearchTest")
public class Runnergoogletest {

}
