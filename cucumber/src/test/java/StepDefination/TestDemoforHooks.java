package StepDefination;


import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/HooksDemo/HooksDemo.feature",glue= {"Stepsforhooks"},monochrome = true
 )
public class TestDemoforHooks {

}
