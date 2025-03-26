package com.MagentoApplication.StepDefinition;

import org.testng.Assert;

import com.MagentoApplication.Browser.browser;
import com.MagentoApplication.Pages.HomePageMethods;
import com.MagentoApplication.Pages.SignInPageMethods;
import com.MagentoApplication.Pages.SignOutPageMethods;
import com.aventstack.extentreports.Status;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loggingOutStepDefinition {
	@When("User clicks the link {string}")
	public void user_clicks_the_link(String string) {
	    HomePageMethods.clickSignIN();
	}

	@And("User enters valid email {string}")
	public void user_enters_valid_email(String string) {
	    SignInPageMethods.enterInEmail(string);
	}

	@And("User enter password {string}")
	public void user_enter_password(String string) {
	    SignInPageMethods.enterInPassword(string);
	}

	@And("User clicks the {string} button")
	public void user_clicks_the_button(String string) {
	    SignInPageMethods.signInButtonClick(string);
	}

	@When("User clicks {string}")
	public void user_clicks(String string) {
	    SignOutPageMethods.signOutDropdown(string);
	}

	@Then("User clicks {string} from my account")
	public void user_clicks_from_my_account(String string) {
	    SignOutPageMethods.signOut(string);
	}

	@Then("User verifies that the session ends and user is redirected to the homepage")
	public void user_verifies_that_the_session_ends_and_user_is_redirected_to_the_homepage()  {
		try 
		{ 
			Assert.assertEquals(HomePageMethods.homePageText(), "Home Page"); 
			browser.logger1.log(Status.PASS, "Actual and Expected matched successfully");
		}
		catch (Exception e) { 
			browser.logger1.log(Status.PASS, "Mismatch in actual and Expected");
			System.out.println(e); 
		}
	}


}
