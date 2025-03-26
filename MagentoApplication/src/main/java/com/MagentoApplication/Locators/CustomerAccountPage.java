package com.MagentoApplication.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MagentoApplication.Browser.browser;

public class CustomerAccountPage extends browser{
	public CustomerAccountPage()
	{ 
		PageFactory.initElements(driver, this); 
	} 
		 
	@FindBy(xpath = "//input[@id='firstname']") 
	public WebElement firstNameElement; 
		 
	@FindBy(xpath = "//input[@id='lastname'] ") 
	public WebElement lastnameElement; 
		 
	@FindBy(xpath = "//input[@id='email_address']   ") 
	public WebElement emailElement; 
		 
	@FindBy(xpath = "//input[@id='password']  ") 
	public WebElement passwordElement; 
		 
	@FindBy(xpath = "//input[@id='password-confirmation']    ") 
	public WebElement confirmPasswordElement; 
		 
	@FindBy(xpath = "//button[@title='Create an Account']    ") 
	public WebElement createAnAccountElement; 
		 
	@FindBy(xpath = "//div[@id='email_address-error']  ") 
	public WebElement errorElement; 

}
