package com.MagentoApplication.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MagentoApplication.Browser.browser;

public class ProductSearchAddToCartObjects extends browser{
	public ProductSearchAddToCartObjects() 
	{ 
		  PageFactory.initElements(driver, this); 
	}

	
	@FindBy(xpath = "//div[@class='product details product-item-details' ]/strong/a")
	public List<WebElement> productsItem;
	
	@FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[3]/div[2]/ul[1]/li[4]/a[1]")
	public WebElement nextElemnet;


}
