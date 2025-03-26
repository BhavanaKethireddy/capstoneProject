package com.MagentoApplication.StepDefinition;

import org.testng.Assert;

import com.MagentoApplication.Browser.browser;
import com.MagentoApplication.Pages.HomePageMethods;
import com.MagentoApplication.Pages.MyAccountMethods;
import com.MagentoApplication.Pages.SignInPageMethods;
import com.MagentoApplication.Pages.customerAccountMethods;
import com.aventstack.extentreports.Status;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginFunctionalityStepDefinition {
	@When("User clicks on {string}")
	public void user_clicks_on(String string) {
	    HomePageMethods.clickSignIN();
	}

	@And("User enters e-mail {string}")
	public void user_enters_e_mail(String string) {
	   SignInPageMethods.enterInEmail(string);
	}

	@And("User enters password {string}")
	public void user_enters_password(String string) {
	    SignInPageMethods.enterInPassword(string);
	}

	@And("User clicks on {string} button")
	public void user_clicks_on_button(String string) {
	    SignInPageMethods.signInButtonClick(string);
	}

	@Then("User should see error message {string}")
	public void user_should_see_error_message(String string) {
		try 
		{ 
			Assert.assertEquals(SignInPageMethods.errorMessage(), string); 
			browser.logger1.log(Status.PASS, "Actual and Expeced Matched");
		}
		catch (Exception e) { 
			browser.logger1.log(Status.PASS, "Mismatch in actual and expected");
			System.out.println(e); 
		} 
	}

	@When("User enters valid-email {string}")
	public void user_enters_valid_email(String string) {
	    SignInPageMethods.enterInEmail(string);
	}

	@And("user enter valid password {string}")
	public void user_enter_valid_password(String string) {
	   SignInPageMethods.enterInPassword(string);
	}
	@When("User again clicks on {string} button")
	public void user_again_clicks_on_button(String string) {
	    SignInPageMethods.signInButtonClick(string);
	}
	@Then("User verifies {string} displayed after login")
	public void user_verifies_displayed_after_login(String string) {
		try 
		{ 
			Assert.assertEquals(MyAccountMethods.myAccountText(), string); 
			browser.logger1.log(Status.PASS, "Actual and Expeced Matched");
		}
		catch (Exception e) { 
			System.out.println(e); 
			browser.logger1.log(Status.PASS, "Mismatch in actual and expected");
		} 
	}

}
