package com.MagentoApplication.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.MagentoApplication.Browser.browser;
import io.opentelemetry.sdk.logs.data.Body;

public class SignOutPageObjects extends browser{
	public SignOutPageObjects() 
	{ 
		PageFactory.initElements(driver, this); 
	} 
		  
		  
//	public By myAccountDropdown = By.xpath("//header/div[1]/div/ul/li[2]/span/button");
//	
//	public By signOutbutton = By.xpath("//header/div[1]/div/ul/li[2]/div/ul/li[3]/a");

	
	
	@FindBy(xpath = "//header/div[1]/div/ul/li[2]/span/button")
	public WebElement myAccountDropdownElemenet;
	
	@FindBy(xpath = "//header/div[1]/div/ul/li[2]/div/ul/li[3]/a")

	public WebElement signOutElement; 

}
