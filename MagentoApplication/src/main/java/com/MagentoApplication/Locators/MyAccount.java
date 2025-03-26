package com.MagentoApplication.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MagentoApplication.Browser.browser;

public class MyAccount extends browser{
	public MyAccount() 
	{ 
		  PageFactory.initElements(driver, this); 
	} 
		 
//	public By myAccountText = By.xpath("//span[@class='base']");
//		  
//	public By searchBox = By.xpath("//input[@id='search']  "); 
//		  
	public By searchItem = By.xpath(" //ul[@role='listbox']/li/span[1]"); 
//		  
//	public By registartionText=By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"); 
	 
		  
	@FindBy(xpath = "//span[@class='base']")
	public WebElement myAccountTextElement; 
		  
	@FindBy(xpath = "//input[@id='search']  ") 
	public WebElement searchBoxElement; 
		  
	@FindBy(xpath = "//ul[@role='listbox']/li/span[1] ") 
	public List<WebElement> searchList; 
		  
	@FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']") 
	public WebElement registrationtextElement;

}
