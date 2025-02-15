package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.homePage;
import pageObjects.loginPage;
import pageObjects.myAccountPage;
import testBase.baseClass;

public class LoginTestCase extends baseClass {

	@Test(groups= {"regression","master"})
	public  void verify_login() 
	{
	 try
	 {
	 logger.info("Started the TCOO2....");
   	 homePage hp=new homePage(driver);
   	 logger.info("clicked on my account ");
   	 hp.setMyaccount();
   	 logger.info("clicked on login button ");
   	 hp.setLogin();
   	 
   	 loginPage lp =new loginPage(driver);
	 lp.setEmail("manish23@gmail.com");
	 lp.setPassword("manish#123");
	 lp.clicklgn();
     myAccountPage myAcc = new myAccountPage(driver);
	 boolean target=myAcc.isMyAccountPageExists();
	 Assert.assertTrue(target);
	}
	catch(Exception e ) {
		Assert.fail();
	}
	logger.info("finished the TCOO2....");
  }
}
