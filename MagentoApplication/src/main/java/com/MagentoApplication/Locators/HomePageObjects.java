package com.MagentoApplication.Locators;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.MagentoApplication.Browser.browser;

public class HomePageObjects extends browser {
	public HomePageObjects() 
	{ 
		PageFactory.initElements(driver, this); 
	} 		  
		 
		  
	@FindBy(xpath="//div[@class='panel wrapper']//ul[@class='header links']/li[2]/a") 
	public WebElement signInLink; 
		  
	@FindBy(xpath="//div[@class='panel wrapper']//ul[@class='header links']/li[3]/a ") 
	public WebElement createNewAccountLink; 
		  
	@FindBy(xpath="//span[text()='Home Page'] ") 
	public WebElement homePagetext;

//	@FindBy(xpath = "//div[@class='minicart-wrapper']/a  ")
//	public WebElement cartIconElement;
//	
//	@FindBy(xpath = "//a[@title='Remove item'] ")
//	public List<WebElement> cartList;
//	
//	 
//	@FindBy(xpath = "//button[@class='action-primary action-accept'] ")
//	public WebElement popUpAcceptElement;
//	
//	@FindBy(xpath="//span[@class='counter qty'] /span[@class='counter-number']  ")
//	public List<WebElement> counterElement;
//	
//	@FindBy(xpath="//button[@id='top-cart-btn-checkout'] ")
//	public WebElement proceedToCartElement;
//	
//	@FindBy(xpath="//button[@data-action='close'] ")
//	public WebElement closingButtonElement;
}
