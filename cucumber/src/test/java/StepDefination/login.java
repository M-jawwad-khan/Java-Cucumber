package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

//	@Given("user is on login page")
//	public void verifyLoginpage() {
//		System.out.println("Given Statement");
//	}
	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Given Statement");
	}

	@When("when enter username and password")
	public void when_enter_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("When Statement");
	}

	@And("Click on login button")
	public void click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("And Statement");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Then Statement");
	}

}
