package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogintestSelenium {

	WebDriver driver = null;

	@Given("Open browser goto the login page")
	public void browser_is_open() {
		System.out.println("Browser is open");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@Then("^Enter the (.*) and (.*) and hits the Enter$")
	public void userEnterTheUserNameAndPassword(String username,String password) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@And("user was navigated to the Next page")
	public void navigatetosecondpage() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		System.out.println("title of second page is : "+driver.getTitle());
		driver.close();
	}

}
