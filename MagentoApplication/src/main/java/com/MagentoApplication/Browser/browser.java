package com.MagentoApplication.Browser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.time.Duration; 

public class browser {
	/* 
	* Necessary objects declared globally 
	*/ 
	 public static WebDriver driver; 
	 public static WebDriverWait wait; 
	 public static JavascriptExecutor js; 
	 public static Actions act; 
	 public static ExtentReports extent;
	 public static ExtentSparkReporter reporter;
	 public static ExtentTest logger1;
	 
	 /* 
	  * to generate extent reports
	  */ 
	 public static void init(String reportName) {
		extent = new ExtentReports();
		reporter = new ExtentSparkReporter(System.getProperty("user.dir")+"//target//ExtentReport//"+reportName+".html");
		extent.attachReporter(reporter);	
		}
	 /* 
	  * Open the browser based on the choice 
	  */ 
	  
	 public static void openbrowser(String browser) 
	 { 
		 logger1 = extent.createTest("Checking Logout Functionality ");
		 logger1.log(Status.INFO, "Opening the browser");
		 try 
		 { 
			 if(browser.equalsIgnoreCase("chrome")) 
				 driver=new ChromeDriver(); 
			 else if(browser.equalsIgnoreCase("edge")) 
				 driver=new FirefoxDriver(); 
			 else if(browser.equalsIgnoreCase("edge")) 
				 driver=new EdgeDriver(); 
			 else 
				 throw new Exception("Invalid browser"); 
			 	 logger1.log(Status.PASS, "The Browser opened successfully");
		 } 
		 catch(Exception e) 
		 { 
			 logger1.log(Status.FAIL, "The browser not opened");
			 System.out.println("Exception in openbrowser method : "+e); 
			 System.exit(0); 
		 } 
		// extent.flush();
	 } 
	  
	 /* 
	  * Navigating to the given Url on the choice 
	  */ 
	  
	 public static void navigateTourl(String url) 
	 { 
		// logger1 = extent.createTest("Navigating to Browser");
		 logger1.log(Status.INFO, "Navigated to browser");
		 try 
		 { 
			 //url = "https://magento.softwaretestingboard.com/";
			 driver.get(url); 
			 driver.manage().window().maximize(); 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
			 wait=new WebDriverWait(driver, Duration.ofSeconds(10)); 
			 js=(JavascriptExecutor)driver; 
			 act=new Actions(driver); 
			 logger1.log(Status.PASS, "Navigated to browser successfully");
		 } 
		 catch(Exception e) 
		 { 
			 logger1.log(Status.FAIL, "Navigation to browser failed");
			 System.out.println("Exception in navigateToUrl method : "+e); 
			 System.exit(0); 
		 } 
	   
	 } 
	  
	 /* 
	  * Closing the browser 
	  */ 
	  
	 public static void closeBrowser() 
	 { 
		// logger1 = extent.createTest("Closing Browser");
		 logger1.log(Status.INFO, "Closing the browser");
		 try 
		 { 
			 driver.quit(); 
			 logger1.log(Status.PASS, "The Browser closed successfully");
		 } 
		 catch(Exception e) 
		 { 
			 logger1.log(Status.FAIL, "The browser not closed");
			 System.out.println("Exception in closeBrowser method : "+e); 
		 } 
	   
	 } 
	
}
