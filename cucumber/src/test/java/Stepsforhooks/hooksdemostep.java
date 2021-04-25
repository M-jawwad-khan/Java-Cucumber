package Stepsforhooks;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooksdemostep {
	
	WebDriver driver = null;
	
	@Before(order=1)
	public void openbrowser() {
		System.out.println("---Inside browser setup-------");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Before(order=0)
	public void teardownbefore() {
		System.out.println("---tear down before-------");
	  
	}
	
	@After(order=1)
	public void teardownafter() {
		System.out.println("---tear down after-------");
		
	}
	
	@After(order=2)
	public void closebrowser() {
		System.out.println("---close browser setup-------");
		driver.close();
		driver.quit();
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("1");
	}

	@When("Enter un ps")
	public void enter_un_ps() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("2");
	}

	@And("click on btn")
	public void click_on_btn() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("3");
	}

	@Then("user switch")
	public void user_switch() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("4");
	}
}
