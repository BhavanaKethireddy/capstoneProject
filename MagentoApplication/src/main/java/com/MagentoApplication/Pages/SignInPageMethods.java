package com.MagentoApplication.Pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.MagentoApplication.Browser.browser;
import com.MagentoApplication.Locators.CustomerAccountPage;
import com.MagentoApplication.Locators.SignInPageObjects;
import com.MagentoApplication.Screenshot.ScreenShot;
import com.aventstack.extentreports.Status;

public class SignInPageMethods extends browser{
	/* 
	 * Necessary objects declared globally 
	*/ 
	  
	 static SignInPageObjects obj; 
	  
	 /* 
	  * Method for entering data in email textbox 
	 */ 
	  
	 public static void enterInEmail(String str) 
	 { 
		 obj=new SignInPageObjects(); 
		 //logger1 = extent.createTest("Entering email for sign in");
		 logger1.log(Status.INFO, "email for sign in");
		 try 
		 {  
			 wait.until(ExpectedConditions.visibilityOf(obj.emailInElement));
			 obj.emailInElement.clear();
			 obj.emailInElement.sendKeys(str); 
			 logger1.log(Status.PASS, "E-mail entered successfully");
		 } 
		 catch(Exception e) 
		 { 
			 logger1.log(Status.FAIL, "Entering email failed");
			 System.out.println("Exception in enterInEmail method : "+e); 
		 } 
		// extent.flush();
	 } 
	  
	 /* 
	  * Method for enterning data in password textbox 
	 */ 
	  
	 public static void enterInPassword(String str) 
	 { 
		// logger1 = extent.createTest("Entering password for sign In");
		 logger1.log(Status.INFO, "password for sign in");
	  try 
	  {  
		  wait.until(ExpectedConditions.visibilityOf(obj.passwordInElement)); 
		  obj.passwordInElement.sendKeys(str); 
		  logger1.log(Status.PASS, "password entered successfully");
	  } 
	  catch(Exception e) 
	  { 
		  logger1.log(Status.FAIL, "password entering failed");
	   System.out.println("Exception in enterInPassword method : "+e); 
	  } 
	 // extent.flush();
	 } 
	  
	 /* 
	  * Method for clicking sign in button
	 */ 
	  
	 public static void signInButtonClick(String str) 
	 { 
	//	 logger1 = extent.createTest("Sign in Button clicking");
		 logger1.log(Status.INFO, "Sign In button");
	  try 
	  {  
		  wait.until(ExpectedConditions.visibilityOf(obj.signInButton)); 
		  obj.signInButton.click();
		  logger1.log(Status.PASS, "sign In button clicked successfully");
	  } 
	  catch(Exception e) 
	  { 
		  logger1.log(Status.FAIL, "Sign In button clicking failed");
	   System.out.println("Exception in signInButtonClick method : "+e); 
	  } 
	//  extent.flush();
	 } 
	  
	 /* 
	  * Method for getting error message text 
	 */ 
	  
	  
	 public static String errorMessage() 
	 { 
	  String text=null; 
	 // logger1 = extent.createTest("Error message foe incorect details");
	  logger1.log(Status.INFO, "Sign In error");
	  try 
	  {   
		  wait.until(ExpectedConditions.visibilityOf(obj.errorInMsg)); 
		  text=obj.errorInMsg.getText(); 
		  ScreenShot.screenShot("errorMessage");
		  logger1.log(Status.PASS, "Error message displayed successfully");
	  } 
	  catch(Exception e) 
	  { 
		  logger1.log(Status.FAIL, "Error message dispalying failed");
	   System.out.println("Exception in  errorMessage method : "+e); 
	  } 
	//  extent.flush();
	  return text; 
	  
	 }
	
	 


}
