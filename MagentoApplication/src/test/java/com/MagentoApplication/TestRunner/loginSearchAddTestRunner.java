package com.MagentoApplication.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.MagentoTesting.Feature\\2_loginSearchAdd.feature", 
glue= {"com.MagentoApplication.StepDefinition","com.Magento.Hooks"},  
plugin= {"pretty","html:target/com.Magento.CucumberReport/AddtoCart_report.html"}) 
public class loginSearchAddTestRunner extends AbstractTestNGCucumberTests{

}

