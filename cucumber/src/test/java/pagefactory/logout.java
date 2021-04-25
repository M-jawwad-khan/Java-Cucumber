package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class logout {
	
	WebDriver driver;
	public logout(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, logout.this);
	}
	
	@FindBy(id = "react-burger-menu-btn")
	WebElement clickbar;
	
	
	@FindBy(id = "logout_sidebar_link")
	WebElement hitlogout;
	
	
	public void clicklogout() {
		hitlogout.click();
	}
	public void navbarclick() {
		// TODO Auto-generated method stub
		clickbar.click();
	}
	

}
