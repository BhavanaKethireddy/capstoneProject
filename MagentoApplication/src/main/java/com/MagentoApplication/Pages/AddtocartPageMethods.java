package com.MagentoApplication.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.MagentoApplication.Browser.browser;
import com.MagentoApplication.Locators.AddtoCartPageObjects;
import com.MagentoApplication.Locators.CustomerAccountPage;
import com.MagentoApplication.Screenshot.ScreenShot;
import com.aventstack.extentreports.Status;

import java.time.Duration;

public class AddtocartPageMethods extends browser{
	/* 
	 * Necessary objects declared globally 
	*/ 
	  
	 static AddtoCartPageObjects obj; 
	  
	 /* 
	  * Method for selecting product size
	 */ 
	  
	 public static void selectSize(String size) {
		// logger1 = extent.createTest("Selecting product size");
		 logger1.log(Status.INFO, "Product size selection");
	        try {
	            obj = new AddtoCartPageObjects();
	            wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.visibilityOfAllElements(obj.sizeOptions));
	            for (WebElement sizeOption : obj.sizeOptions) {
	                if (sizeOption.getText().equalsIgnoreCase(size)) {
	                    sizeOption.click();
	                    System.out.println("Selected size: " + size);
	                    logger1.log(Status.PASS, "Product size selected successfully");
	                    break;
	                }
	            }
	        } catch (Exception e) {
	        	logger1.log(Status.FAIL, "product size selection failed");
	            System.out.println("Exception in selectSize: " + e);
	        }
	     //   extent.flush();
	    }
	 /* 
	  * Method for selecting product color
	 */ 
	  

	    public static void selectColor(String color) {
	    //	logger1 = extent.createTest("Selecting product color");
			 logger1.log(Status.INFO, "Product color selection");
	        try {
	            obj = new AddtoCartPageObjects();
	           // wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.visibilityOfAllElements(obj.colorOptions));
	            for (WebElement colorOption : obj.colorOptions) {
	                if (colorOption.getDomAttribute("option-label").equalsIgnoreCase(color)) {
	                    colorOption.click();
	                    System.out.println("Selected color: " + color);
	                    logger1.log(Status.PASS, "Product color selected suffessfully");
	                    break;
	                }
	            }
	        } catch (Exception e) {
	        	logger1.log(Status.FAIL, "product color selection failed");
	            System.out.println("Exception in selectColor: " + e);
	        }
	      //  extent.flush();
	    }

	    /* 
		  * Method for selecting product quantity
		 */ 
		  
	    public static void enterQuantity(String quantity) {
	    //	logger1 = extent.createTest("selecting Product Quantity");
			//logger1.log(Status.INFO, "Product quantity selection");
	        try {
	            obj = new AddtoCartPageObjects();
	            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.visibilityOf(obj.quantityBox));
	            obj.quantityBox.clear();
	            obj.quantityBox.sendKeys(quantity);
	            System.out.println("Entered quantity: " + quantity);
	           // logger1.log(Status.FAIL, "product quantity selection successfull");
	        } catch (Exception e) {
	        	//logger1.log(Status.FAIL, "Product quantity selection failed");
	            System.out.println("Exception in enterQuantity: " + e);
	        }
	      //  extent.flush();
	    }
	    /* 
		  * Method for clicking add to cart button
		 */ 
		  
	    public static void clickAddToCart() {
	    //	logger1 = extent.createTest("Add to Cart Button Clicking");
			logger1.log(Status.INFO, "Cliking Add To Cart button");
	        try {
	        	obj = new AddtoCartPageObjects();
	            wait.until(ExpectedConditions.elementToBeClickable(obj.addToCartButton));
	            obj.addToCartButton.click();
	            System.out.println("Clicked on Add to Cart button");
	            logger1.log(Status.PASS, "Add to cart clicked successfully");
	        } catch (Exception e) {
	        	logger1.log(Status.FAIL, "Add to click failed");
	            System.out.println("Exception in clickAddToCart: " + e);
	        }
	      //  extent.flush();
	    }
	    /* 
		  * Method for getting cart message
		 */ 
		  
	    public static String getCartMessage() {
	    	//logger1 = extent.createTest("Cart Message after adding product");
			logger1.log(Status.INFO, "Cart Message");
	        try {
	            obj = new AddtoCartPageObjects();
	           // wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.visibilityOf(obj.cartMessage));
	            String message = obj.cartMessage.getText();
	            System.out.println("Cart message: " + message);
	           logger1.log(Status.PASS, "Cart msg verified successfully");
	            return message;
	        } catch (Exception e) {	
	        	logger1.log(Status.FAIL, "error in cart message");
	            System.out.println("Exception in getCartMessage: " + e);
	      
	            return null;
	        }
	        
	    }
	    /* 
		  * Method for getting cart amount
		 */ 
		  
	    public static String getCartAmount() {
	    	//logger1 = extent.createTest("Cart Message after adding product");
			logger1.log(Status.INFO, "Cart Total amount");
	        try {
	            obj = new AddtoCartPageObjects();
	           // wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.visibilityOf(obj.cartAmountElement));
	            String message = obj.cartAmountElement.getText();
	            System.out.println("Cart Amount: " + message);
	            return message;
	        } catch (Exception e) {	
	            System.out.println("Exception in getCartAmount: " + e);
	            return null;
	        }
	        
	    }
	    /* 
		  * Method for clicking add to cart symbol
		 */ 
		  
	    public static void clickCartSymbol() {
	    //	logger1 = extent.createTest("Add to Cart Button Clicking");
			logger1.log(Status.INFO, "Cliking Add To Cart Symbol");
	        try {
	        	obj = new AddtoCartPageObjects();
	            wait.until(ExpectedConditions.elementToBeClickable(obj.cartSymbolElement));
	            obj.cartSymbolElement.click();
	            System.out.println("Clicked on Add to Cart Symbol");
	            ScreenShot.screenShot("Cart image");
	            logger1.log(Status.PASS, "Cart Symbol clicked successfully");
	        } catch (Exception e) {
	        	logger1.log(Status.FAIL, "Clicking cart symbol failed");
	            System.out.println("Exception in clickCartSymbol: " + e);
	        }
	      //  extent.flush();
	    }
	    
	    

}
