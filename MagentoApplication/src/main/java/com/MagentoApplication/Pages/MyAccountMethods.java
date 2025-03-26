package com.MagentoApplication.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.MagentoApplication.Browser.browser;
import com.MagentoApplication.Locators.MyAccount;
import com.aventstack.extentreports.Status;

public class MyAccountMethods extends browser{
	/* 
	  * Necessary objects declared globally 
	 */ 
	  
	 static MyAccount obj; 
	 /* 
	  * Method for getting Successfully registration text 
	 */ 
	  
	 
	 public static String myAccountText() 
	 { 
	  String text=null; 
	  obj=new MyAccount(); 
	 // logger1 = extent.createTest("To get My Account text");
	  logger1.log(Status.INFO, "My account text");
	  try 
	  {  
		  wait.until(ExpectedConditions.visibilityOf(obj.myAccountTextElement)); 
		  text=obj.myAccountTextElement.getText();
		  logger1.log(Status.PASS, "My account text displayed successfully");
	  } 
	  catch(Exception e) 
	  { 
		  logger1.log(Status.FAIL, "My account text displaying failed");
	   System.out.println("Exception in MyAccountText method : "+e); 
	  } 
	 // extent.flush();
	  return text; 
	 }
	  
	 /* 
	  * Method for getting Successfully registration text 
	 */  
	  
	 public static String registrationText() { 
		 String text=null; 
		 obj=new MyAccount(); 
		// logger1 = extent.createTest("To get Registration text");
		 logger1.log(Status.INFO, "Registration successful text ");
		 try {  
			 wait.until(ExpectedConditions.visibilityOf(obj.registrationtextElement)); 
			 text=obj.registrationtextElement.getText(); 
			 logger1.log(Status.PASS, "Registration text displayed successfully");
		 } catch(Exception e) { 
			 logger1.log(Status.FAIL, "Registration text displaying failed");
			 System.out.println("Exception in registrationText method : "+e); 
		 } 
		// extent.flush();
		 return text; 
	 }
	 /* 
	  * Method to search for an item in search textbox
	 */ 
	 public static void enterSearchQuery(String searchQuery) {
		 obj=new MyAccount();
		// logger1 = extent.createTest("Entering search query in textbox");
		 logger1.log(Status.INFO, "Searching for product");
	        try {
	            wait.until(ExpectedConditions.visibilityOf(obj.searchBoxElement));
	            obj.searchBoxElement.clear(); // Clear any existing text
	            obj.searchBoxElement.sendKeys(searchQuery);
	            logger1.log(Status.PASS, "query dispalyed successfully");
	        } catch (Exception e) {
	        	logger1.log(Status.FAIL, "Query displaying failed");
	            System.out.println("Exception in enterSearchQuery: " + e);
	        }
	       // extent.flush();
	    }
	 /* 
	  * Method to select category from autosuggested search elements
	 */ 
	 public static void selectSuggestion(String suggestion) {
		// logger1 = extent.createTest("Categories of product based on selection");
		 logger1.log(Status.INFO, "Displaying Categories in product");
	        try {
//	        	Thread.sleep(4000);
				wait.until(ExpectedConditions.presenceOfElementLocated(obj.searchItem));
				for(WebElement e : obj.searchList) {
					System.out.println(e.getText());
					if(e.getText().contains(suggestion))
					{
						e.click();
						break;
						
					}
					logger1.log(Status.PASS, "categories dispalyed successfully");
				}
			} catch (Exception e) {
				logger1.log(Status.FAIL, "Categories dispalying failed");
				// TODO: handle exception
			}
	      //  extent.flush();

	 }
}
