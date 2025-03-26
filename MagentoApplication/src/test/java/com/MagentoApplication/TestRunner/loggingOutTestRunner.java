package com.MagentoApplication.TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.MagentoTesting.Feature\\6_loggingOut.feature", 
glue= {"com.MagentoApplication.StepDefinition","com.Magento.Hooks"},  
plugin= {"pretty","html:target/com.Magento.CucumberReport/logout_report.html"}) 
public class loggingOutTestRunner extends AbstractTestNGCucumberTests{

}
