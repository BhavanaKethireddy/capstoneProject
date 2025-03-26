package com.MagentoApplication.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MagentoApplication.Browser.browser;

public class SignInPageObjects extends browser{
	public SignInPageObjects() 
	{ 
		  PageFactory.initElements(driver, this); 
	}
	
	@FindBy(xpath="//input[@id='email'] ") 
	public WebElement emailInElement; 
		  
	@FindBy(xpath="//input[@title='Password'] ") 
	public WebElement passwordInElement; 
		  
	@FindBy(xpath="//button[@id='send2'] ") 
	public WebElement signInButton;
	
	@FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
	public WebElement errorInMsg;
	
	
}
