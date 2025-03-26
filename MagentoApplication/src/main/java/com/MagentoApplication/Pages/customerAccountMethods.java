package com.MagentoApplication.Pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.MagentoApplication.Browser.browser;
import com.MagentoApplication.Locators.CustomerAccountPage;
import com.aventstack.extentreports.Status;

public class customerAccountMethods extends browser{
	/* 
	 * Necessary objects declared globally 
	*/ 
	  
	 static CustomerAccountPage obj; 
	  
	 /* 
	  * Method for enterning data in firstname textbox 
	 */ 
	  
	 public static void EnteringFirstName(String str) 
	 { 
		 obj=new CustomerAccountPage(); 
			//logger1 = extent.createTest("Entering first Name");
			logger1.log(Status.INFO, "first Name");
		 try 
		 {  
			 wait.until(ExpectedConditions.visibilityOf(obj.firstNameElement)); 
			 obj.firstNameElement.sendKeys(str); 
			 logger1.log(Status.PASS, "first name entered successfully");
		 } 
		 catch(Exception e) 
		 { 
			 logger1.log(Status.FAIL, "first name entering failed");
			 System.out.println("Exception in Enteringfirstname method : "+e); 
		 } 
		// extent.flush();
	 } 
	  
	 /* 
	  * Method for enterning data in LastName textbox 
	 */ 
	  
	 public static void EnteringLastName(String str) 
	 { 
		// logger1 = extent.createTest("Entering last Name");
		logger1.log(Status.INFO, "last Name");
	  try 
	  {  
		  wait.until(ExpectedConditions.visibilityOf(obj.lastnameElement)); 
		  obj.lastnameElement.sendKeys(str); 
		  logger1.log(Status.PASS, "last name entered successfully");
	  } 
	  catch(Exception e) 
	  { 
		  logger1.log(Status.FAIL, "last name entering failed");
	   System.out.println("Exception in Entering LastName method : "+e); 
	  } 
	 // extent.flush();
	 } 
	  
	 /* 
	  * Method for enterning data in email textbox 
	 */ 
	  
	 public static void EnteringEmail(String str) 
	 { 
		//logger1 = extent.createTest("Entering Email");
		logger1.log(Status.INFO, "E-mail");
	  try 
	  {  
		  wait.until(ExpectedConditions.visibilityOf(obj.emailElement)); 
		  obj.emailElement.clear(); 
		  obj.emailElement.sendKeys(str); 
		  logger1.log(Status.PASS, "E-mail entered successfully");
	  } 
	  catch(Exception e) 
	  { 
		  logger1.log(Status.FAIL, "E-mail entering failed");
	   System.out.println("Exception in Enteringemail method : "+e); 
	  } 
	//  extent.flush();
	 } 
	  
	 /* 
	  * Method for enterning data in password textbox 
	 */ 
	  
	 public static void EnteringPassword(String str) 
	 { 
		//logger1 = extent.createTest("Entering Password");
		logger1.log(Status.INFO, "Password");
	  try 
	  {  
		  wait.until(ExpectedConditions.visibilityOf(obj.passwordElement)); 
		  js.executeScript("arguments[0].setAttribute('value',arguments[1]);", 
		  obj.passwordElement,str); 
		  logger1.log(Status.PASS, "password entered successfully");
	  } 
	  catch(Exception e) 
	  { 
		  logger1.log(Status.FAIL, "password entering failed");
	   System.out.println("Exception in EnteringPassword method : "+e); 
	  } 
	//  extent.flush();
	 } 
	  
	 /* 
	  * Method for enterning data in Confirmpassword textbox 
	 */ 
	  
	 public static void EnteringConfirmPassword(String str) 
	 { 
	//	logger1 = extent.createTest("Entering first confirm password");
		logger1.log(Status.INFO, "confirm password");
	  try 
	  {  
		  wait.until(ExpectedConditions.visibilityOf(obj.confirmPasswordElement)); 
		  js.executeScript("arguments[0].setAttribute('value',arguments[1]);", 
		  obj.confirmPasswordElement,str); 
		  logger1.log(Status.PASS, "confirm password entered successfully");
	  } 
	  catch(Exception e) 
	  { 
		  logger1.log(Status.FAIL, "confirm password entering failed");
	   System.out.println("Exception in EnteringConfirmPassword method : "+e); 
	  } 
	 // extent.flush();
	 } 
	  
	  
	  
	 /* 
	  * Method for clicking  createAnAccount 
	 */ 
	  
	 public static void clickingCreateAnAccountButton() 
	 { 
		//logger1 = extent.createTest("Clicking Create account button");
		logger1.log(Status.INFO, "Create Account Button");
	  try 
	  {  
	   js.executeScript("arguments[0].click()", obj.createAnAccountElement); 
	   logger1.log(Status.PASS, "create account button clicked successfully");
	  } 
	  catch(Exception e) 
	  { 
		  logger1.log(Status.FAIL, "create account button clicking failed");
	   System.out.println("Exception in EnteringConfirmPassword method : "+e); 
	  } 
	 // extent.flush();
	 } 
	  
	 /* 
	  * Method for getting error message text 
	 */ 
	  
	  
	 public static String errorMessage() 
	 { 
	  String text=null; 
	//  logger1 = extent.createTest("Error message for account exit");
	  logger1.log(Status.INFO, "Error message");
	  try 
	  {   
		  wait.until(ExpectedConditions.visibilityOf(obj.errorElement)); 
		  text=obj.errorElement.getText(); 
		  logger1.log(Status.PASS, "Error message dispalyed successfully");
	  } 
	  catch(Exception e) 
	  { 
		  logger1.log(Status.FAIL, "error message displaying failed");
	   System.out.println("Exception in  errorMessage method : "+e);
	  }
	  
	  //extent.flush();
	  return text; 
	  
	 }

}
