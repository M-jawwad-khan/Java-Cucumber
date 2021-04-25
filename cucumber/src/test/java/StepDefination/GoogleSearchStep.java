package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchStep {
	
	WebDriver driver = null;
   

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Browser is open");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@And("user is on google screen page")
	public void user_is_on_google_screen_page() {
		System.out.println("user is on search screen");

	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		System.out.println("user is on search text box");
		Thread.sleep(2000);
	    driver.findElement(By.name("q")).sendKeys("Rohi");
	}

	@And("hits the enter")
	public void hits_the_enter() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("User hits enter");

	}

	@Then("user is navigated to search result screen")
	public void user_is_navigated_to_search_result_screen() {
		System.out.println("User is go on search search result page");

		driver.getPageSource().contains("Rohi - Home | Facebook");
		driver.close();
	}

}
