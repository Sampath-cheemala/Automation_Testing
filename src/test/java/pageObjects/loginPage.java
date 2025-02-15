package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends basePage {
    
	public loginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement lgnbtn;
	
	
	public void setEmail(String eml) 
	{
	  email.sendKeys(eml);
	}
	
	public void setPassword(String pwd)
	{
		  password.sendKeys(pwd);
    }
	
	public void clicklgn() 
	{
		  lgnbtn.click();
	}
			
	
}
