package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.homePage;
import pageObjects.loginPage;
import pageObjects.myAccountPage;
import testBase.baseClass;
import utilities.ExcelDataProvider;

public class TC003_LoginDDT extends baseClass {
    @Test(dataProvider="excelData",dataProviderClass=ExcelDataProvider.class,groups= {"datadriven"})
	public void verify_LoginDDT(String eml,String pwd,String exp ) {
    	 try 
    	 {
         logger.info("Started the TCOO3....");
      	 homePage hp=new homePage(driver);
      	 hp.setMyaccount();
      	 hp.setLogin();
      	 loginPage lp =new loginPage(driver);
   	     lp.setEmail(eml);
   	     lp.setPassword(pwd);
   	     lp.clicklgn();
   	     myAccountPage myAcc = new myAccountPage(driver);
 	     boolean target=myAcc.isMyAccountPageExists();
 	     if(exp.equalsIgnoreCase("Valid")) {
 	    	 if(target==true) {
 	    		myAcc.clickLogout();
 	    		Assert.assertTrue(true);
 	    	 }
 	    	 else{
 	    		 
 	    		 Assert.assertTrue(false);
 	    		 
 	    	 }
 	     }
 	     
 	    if(exp.equalsIgnoreCase("Invalid")) {
	    	 if(target==true) {
	    		myAcc.clickLogout();
	    		Assert.assertTrue(false);
	    	 }
	    	 else{
	    		 
	    		 Assert.assertTrue(true);
	    		 
	    	 }
	     }
    	 }
    	 catch(Exception e ) {
    			Assert.fail();
    	 }
         logger.info("finished the TCOO3....");
    	 
 	     
 	     
 	     
	}
}
