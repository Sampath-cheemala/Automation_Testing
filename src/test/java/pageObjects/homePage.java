package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage {

	public homePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement myAccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement register;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement login;
	
	
	
	
	public void setMyaccount() {
	myAccount.click();
	
	}
	
	public void setRegister() {
		register.click();
		
    }
	
	public void setLogin() {
		login.click();
		
    }
	
	
	
	
}
