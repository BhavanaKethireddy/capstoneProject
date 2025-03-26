package com.MagentoApplication.StepDefinition;
import org.testng.Assert;
import com.MagentoApplication.Browser.browser;
import com.MagentoApplication.Browser.utility;
import com.MagentoApplication.Locators.CustomerAccountPage;
import com.MagentoApplication.Pages.HomePageMethods;
import com.MagentoApplication.Pages.MyAccountMethods;
import com.MagentoApplication.Pages.customerAccountMethods;
import com.aventstack.extentreports.Status;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationStepDefinition {
	@Given("User opens the browser")
	public void user_opens_the_browser() {
		browser.init("UserRegistration_ExtentReportss");
		//browser.init("LoginSearchAdd_ExtentReport");
		//browser.init("LoginFunctionality_ExtentReport");
		//browser.init("LoggingOut_ExtentReport");
		//browser.init("MultipleItemsInCart_ExtetRepot");
		browser.openbrowser(utility.properties("Browser")); 
	}
	@Given("User navigates to the application URL {string}")
	public void user_navigates_to_the_application_url(String string) {
	    browser.navigateTourl(string);
	}

	@When("User clicks on Create an account")
	public void user_clicks_on_create_an_account() {
		HomePageMethods.clickCreateNewAccount(); 
	}

	@And("User enters the valid {string} in firstname textbox")
	public void user_enters_the_valid_in_firstname_textbox(String string) {
		customerAccountMethods.EnteringFirstName(string); 
	}

	
	@And("User enters the valid {string} in lastname textbox")
	public void user_enters_the_valid_in_lastname_textbox(String string) {
		customerAccountMethods.EnteringLastName(string); 
	}

	@And("User enters the invalid {string} in email textbox")
	public void user_enters_the_invalid_in_email_textbox(String string) {
		customerAccountMethods.EnteringEmail(string); 
	}

	@And("User enters the valid {string} in password textbox")
	public void user_enters_the_valid_in_password_textbox(String string) {
		customerAccountMethods.EnteringPassword(string); 
	}

	@And("User enters the valid {string} in confirm password textbox")
	public void user_enters_the_valid_in_confirm_password_textbox(String string) {
		customerAccountMethods.EnteringConfirmPassword(string); 
	}

	@And("User clicks the Create an account button")
	public void user_clicks_the_create_an_account_button() {
		customerAccountMethods.clickingCreateAnAccountButton(); 
	}

	@Then("User verifies the {string} displayed under the email textbox")
	public void user_verifies_the_displayed_under_the_email_textbox(String string) {
		try 
		{ 
			Assert.assertEquals(customerAccountMethods.errorMessage(), string); 
			browser.logger1.log(Status.PASS, "Actual and Expected matched");
		}
		catch (Exception e) { 
			browser.logger1.log(Status.FAIL, "Mismatch in actual and expected"+e);
			System.out.println(e); 
		} 
	}

	@When("User re-enters the email with valid data {string}")
	public void user_re_enters_the_email_with_valid_data(String string) {
		customerAccountMethods.EnteringEmail(string); 
	}

	@And("User again clicks the Create an account button")
	public void user_again_clicks_the_create_an_account_button() {
		customerAccountMethods.clickingCreateAnAccountButton(); 
	}

	@Then("User verifies {string} in the next page")
	public void user_verifies_in_the_next_page(String string) {
		try { 
			Assert.assertEquals(MyAccountMethods.registrationText(), string); 
			browser.logger1.log(Status.PASS, "Actual and Expected matched");
		} catch (Exception e) { 
			browser.logger1.log(Status.FAIL, "Mismatch in actual and expected"+e);
		   System.out.println(e); 
		 } 
	}
}



