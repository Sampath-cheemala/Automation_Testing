package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistration;
import pageObjects.homePage;
import testBase.baseClass;

public class accountRegistrationTesttCase extends baseClass{
   
     @Test(groups= {"sanity","master"})
     public void verify_Accountregistration()  {
     try 
     {
    	 
    	 logger.info("Started the TCOO1....");
    	 homePage hp=new homePage(driver);
    	 logger.info("clicked on my account ");
    	 hp.setMyaccount();
    	 logger.info("clicked on register ");
    	 hp.setRegister();
    	 AccountRegistration ar=new AccountRegistration(driver);
    	 logger.info("providing the customer details");
    	 ar.setFirstname("rayesh");
    	 ar.setLastname("redy");
    	 Thread.sleep(3000);
    	 ar.setEmail("rajeshh@gmail.com");
    	 ar.setTelephone("9997654230");
    	 ar.setPassword("sinkkh#123");
    	 ar.setConfirmpwd("sinkkh#123");
    	 ar.clickSubRadiobutton();
    	 ar.clickChkbox();
    	 ar.clickContinuebutton();
    	 logger.info("validating the getconfirmation message");
    	 String confmsg=ar.getconfirmationMsg();
    	 System.out.println(confmsg);
    	 //Assert.assertEquals(confmsg, "Your Account Has Been Created!");
    	 
     }
     catch(Exception e) 
     {
    	 logger.error("Test Failed");
         logger.debug("debug logs");
    	 Assert.fail();
     }
     logger.info("TC001 execution is completed");
     
     }
     
     
     
     
     
}
