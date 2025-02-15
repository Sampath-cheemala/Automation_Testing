package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends basePage{
   
    public AccountRegistration(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
    WebElement firstname;	
	@FindBy(xpath="//input[@id='input-lastname']")
    WebElement lastname;	
	@FindBy(xpath="//input[@id='input-email']")
    WebElement email ;	
	@FindBy(xpath="//input[@id='input-telephone']")
    WebElement telephone;	
	@FindBy(xpath="//input[@id='input-password']")
    WebElement password;
	@FindBy(xpath="//input[@id='input-confirm']")
    WebElement confirmpassword ;
	@FindBy(xpath="//label[normalize-space()='Yes']")
    WebElement subradiobtn ;
	@FindBy(xpath="//input[@name='agree']")
    WebElement policychkbox ;	
	@FindBy(xpath="//input[@value='Continue']")
    WebElement continuebtn ;
	
	@FindBy(xpath="//h2[normalize-space()='Your Account Has Been Created!']")
    WebElement MessageConfirmation ;
	
	public void setFirstname(String fname) {
		firstname.sendKeys(fname);
	}
	
	public void setLastname(String lname) {
		lastname.sendKeys(lname);
	}
	
	public void setEmail(String mail) {
		email.sendKeys(mail);
	}
	
	public void setTelephone(String mobile ) {
		telephone.sendKeys(mobile);
	}
	
	public void setPassword(String pwd ) {
		password.sendKeys(pwd);
	}
	
	public void setConfirmpwd(String confmpwd ) {
		confirmpassword.sendKeys(confmpwd);
	}
	
	public void clickSubRadiobutton( ) {
		subradiobtn.click();
	}
	
	public void clickChkbox( ) {
		policychkbox.click();
	}
	
	public void clickContinuebutton( ) {
		continuebtn.click();
	}
	
	public String getconfirmationMsg() {
		try {
		      return (MessageConfirmation.getText());
	    }
	    catch(Exception e){
	    	return (e.getMessage());
	    }
	}
}
