package com.Magento.Hooks;
import com.MagentoApplication.Browser.browser;
import com.aventstack.extentreports.gherkin.model.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll; 
 
public class hooks extends browser{  
	
	@After 
	public void closeapplication()  
	{ 
		browser.closeBrowser(); 
	} 
	@AfterAll
	public static void flushingExtent() {
		extent.flush();
	}
 } 
