package com.MagentoApplication.TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.MagentoTesting.Feature\\4_loginFunctionality.feature", 
glue= {"com.MagentoApplication.StepDefinition","com.Magento.Hooks"},  
plugin= {"pretty","html:target/com.Magento.CucumberReport/login_report.html"}) 
public class loginFunctionalityTestRunner extends AbstractTestNGCucumberTests{

}
