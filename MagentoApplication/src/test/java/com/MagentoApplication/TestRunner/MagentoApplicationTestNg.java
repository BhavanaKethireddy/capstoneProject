package com.MagentoApplication.TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.MagentoTesting.Feature\\1_UserRegistration.feature", 
glue= {"com.MagentoApplication.StepDefinition","com.Magento.Hooks"},  
plugin= {"pretty","html:target/com.Magento.CucumberReport/userRegistration_report.html"}) 
public class MagentoApplicationTestNg extends AbstractTestNGCucumberTests {
	
}
