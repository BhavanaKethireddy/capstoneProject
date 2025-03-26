package com.MagentoApplication.Pages;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.MagentoApplication.Browser.browser;
import com.MagentoApplication.Locators.SignInPageObjects;
import com.MagentoApplication.Locators.SignOutPageObjects;
import com.MagentoApplication.Screenshot.ScreenShot;
import com.aventstack.extentreports.Status;

public class SignOutPageMethods extends browser{
	/* 
	 * Necessary objects declared globally 
	*/ 
	  
	 static SignOutPageObjects obj; 
	  
	 /* 
	  * Method for clicking my account dropdown
	 */ 
	  
	 public static void signOutDropdown(String str) 
	 { 
		 obj=new SignOutPageObjects(); 
		// logger1 = extent.createTest("Clicking Sign Out DropDown");
		 logger1.log(Status.INFO, "Sign out DropDown");
		 
		 try 
		 {  
			 wait.until(ExpectedConditions.visibilityOf(obj.myAccountDropdownElemenet));
			 obj.myAccountDropdownElemenet.click(); 
			 logger1.log(Status.PASS, "DropDown clicked successfully");
		 } 
		 catch(Exception e) 
		 { 
			 logger1.log(Status.FAIL, "DropDown clicking failed");
			 System.out.println("Exception in signOutDropdown method : "+e); 
		 } 
		// extent.flush();
	 } 
	  
	 /* 
	  * Method for clicking signout option
	 */ 
	  
	 public static void signOut(String str) 
	 { 
		// logger1 = extent.createTest("Clicking sign out");
		 logger1.log(Status.INFO, "Sign out");
	  try 
	  {  
		  wait.until(ExpectedConditions.visibilityOf(obj.signOutElement)); 
		  obj.signOutElement.click(); 
		  ScreenShot.screenShot("sign-out");
		  logger1.log(Status.PASS, "Sign Out clicked successfully");
	  } 
	  catch(Exception e) 
	  { 
		  logger1.log(Status.FAIL, "Sign Out clicking failed");
		  System.out.println("Exception in signOut method : "+e); 
	  } 
	//  extent.flush();
	 } 

}
