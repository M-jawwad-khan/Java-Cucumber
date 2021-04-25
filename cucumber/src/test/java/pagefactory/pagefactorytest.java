package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagefactorytest {

	WebDriver driver;
	public pagefactorytest(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,pagefactorytest.this );
		
	}
	
	@FindBy(id ="user-name")
	WebElement txt_username;
	
	@FindBy(id ="password")
	WebElement txt_password;
	
	
	@FindBy(id ="login-button")
	WebElement btn_login;
	
	
	public void enter_username_and_password(String username,String password) {
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
	}
	public void hitenter() {
		btn_login.click();
	}
	
}
