package com.MagentoApplication.Pages;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.MagentoApplication.Browser.browser;
import com.MagentoApplication.Locators.HomePageObjects;
import com.MagentoApplication.Screenshot.ScreenShot;
import com.aventstack.extentreports.Status;

public class HomePageMethods extends browser{
	/* 
	 * Necessary objects declared globally 
	*/ 
	  
	 static HomePageObjects obj; 
	  
	 /* 
	  * Method for clicking new Account link 
	 */ 
	  
	 public static void clickCreateNewAccount() 
	 { 
	  obj=new HomePageObjects(); 
	 // logger1 = extent.createTest("clicking create Account");
	  logger1.log(Status.INFO, "create account Link");
	  try 
	  {  
		  wait.until(ExpectedConditions.visibilityOf(obj.createNewAccountLink)); 
		  obj.createNewAccountLink.click(); 
		  logger1.log(Status.PASS, "create account clicked successfully");
	  } 
	  catch(Exception e) 
	  { 
		  logger1.log(Status.FAIL, "create account clicking failed");
	   System.out.println("Exception in clickCreateNewAccount method : "+e); 
	  } 
	// .HomePageMethods extent.flush();
	 } 
	  
	 /* 
	  * Method for clicking new Sign In link 
	 */ 
	  
	 public static void clickSignIN() 
	 { 
	  obj=new HomePageObjects(); 
	 // logger1 = extent.createTest("Clicking Sign In Link");
	  logger1.log(Status.INFO, "Sign In Link Clicking");
	  try 
	  {  
		  wait.until(ExpectedConditions.visibilityOf(obj.signInLink)); 
		  obj.signInLink.click(); 
		  logger1.log(Status.PASS, "Sign in link clicking successfully");
	  } 
	  catch(Exception e) 
	  { 
		  logger1.log(Status.FAIL, "sign in link clicking failed");
	   System.out.println("Exception in clickSignIN method : "+e); 
	  } 
	  //extent.flush();
	 } 
	  
	 /* 
	  * Method for getting home page text 
	 */ 
	  
	  
	 public static String  homePageText() 
	 { 
	  obj=new HomePageObjects(); 
	  String text=null; 
	 // logger1 = extent.createTest("To get home page text");
	  logger1.log(Status.INFO, "Home Page text");
	  try 
	  {  
		  wait.until(ExpectedConditions.visibilityOf(obj.homePagetext)); 
		  text=obj.homePagetext.getText(); 
		  ScreenShot.screenShot("Home text image");
		  logger1.log(Status.PASS, "Home page text dispalyed successfully");
	  } 
	  catch(Exception e) 
	  { 
		  logger1.log(Status.FAIL, "homw page text dispalying failed");
	   System.out.println("Exception in  homePageText method : "+e); 
	  } 
	 // extent.flush();
	  return text; 
	 }
	 /* 
	  * Method for clearing cart elements
	 */
//	 public static void deleteingCartData() {
//		    obj = new HomePageObjects();
//		    if (js == null) {
//		        js = (JavascriptExecutor) driver; // Ensure js is initialized
//		    }
//
//		    logger1.log(Status.INFO, "Dynamically deleting products from cart");
//		    try {  
//		        if (obj.counterElement.isEmpty()) {
//		            return;
//		        }
//
//		        wait.until(ExpectedConditions.elementToBeClickable(obj.counterElement.getFirst()));
//		        obj.cartIcon.click();
//
//		        while (true) {
//		            List<WebElement> cartItems = obj.cartList;
//		            if (cartItems.isEmpty()) {
//		                break;
//		            }
//
//		            WebElement firstItem = cartItems.get(0);
//		            wait.until(ExpectedConditions.visibilityOf(firstItem));
//		            js.executeScript("arguments[0].click()", firstItem); // No more NullPointerException
//
//		            wait.until(ExpectedConditions.elementToBeClickable(obj.popUpAcceptElement));
//		            js.executeScript("arguments[0].click()", obj.popUpAcceptElement);
//
//		            if (cartItems.size() == 1) {
//		                wait.until(ExpectedConditions.elementToBeClickable(obj.closingButtonElement));
//		                js.executeScript("arguments[0].click()", obj.closingButtonElement);
//		                break;
//		            }
//
//		            wait.until(ExpectedConditions.stalenessOf(firstItem));
//		        }
//		        logger1.log(Status.PASS, "Successfully deleted the products from cart");
//
//		    } catch (Exception e) {
//		        logger1.log(Status.FAIL, "Error in deleting products from cart: " + e);
//		        System.out.println("Exception in deleteingCartData method: " + e);
//		    }
//		}

}
