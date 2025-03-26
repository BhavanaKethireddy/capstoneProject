package com.MagentoApplication.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src\\test\\resources\\com.MagentoTesting.Feature\\5_MultipleitemsToCart.feature", 
glue= {"com.MagentoApplication.StepDefinition","com.Magento.Hooks"},  
plugin= {"pretty","html:target/com.Magento.CucumberReport/MultipleItemsInCart_report.html"}) 
public class MultipleItemsInCartTestRunner extends AbstractTestNGCucumberTests{

}
