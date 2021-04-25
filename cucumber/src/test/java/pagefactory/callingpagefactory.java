package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class callingpagefactory {
	WebDriver driver = null;
    pagefactorytest login;
    logout lgt;
    

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
	    login = new pagefactorytest(driver);
		Thread.sleep(2000);
		login.enter_username_and_password(username, password);
	}

	@And("user was navigated to the Next page")
	public void navigatetosecondpage() throws InterruptedException {
	    login = new pagefactorytest(driver);
	    lgt = new logout(driver);
		login.hitenter();
		Thread.sleep(2000);
		System.out.println("title of second page is : "+driver.getTitle());
		lgt.navbarclick();
		Thread.sleep(2000);
		lgt.clicklogout();
		Thread.sleep(2000);
		driver.close();
	}

}
