package com.MagentoApplication.StepDefinition;

import org.testng.Assert;

import com.MagentoApplication.Pages.AddtocartPageMethods;
import com.MagentoApplication.Pages.MyAccountMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MultipleItemsIncartStepDefinition {
	@And("User enters the data jacket {string} in the search textbox")
	public void user_enters_the_data_jacket_in_the_search_textbox(String string) {
	    MyAccountMethods.enterSearchQuery(string);
	}

	@And("User selects jacket for men from the auto-suggestion list  {string}")
	public void user_selects_jacket_for_men_from_the_auto_suggestion_list(String string) {
		MyAccountMethods.selectSuggestion(string);
	}

	@And("User enters the data jackets {string} in the search textbox")
	public void user_enters_the_data_jackets_in_the_search_textbox(String string) {
	    MyAccountMethods.enterSearchQuery(string);
	}

	@And("User selects jackets for women from the auto-suggestion list  {string}")
	public void user_selects_jackets_for_women_from_the_auto_suggestion_list(String string) {
		MyAccountMethods.selectSuggestion(string);
	}
	@And("User click on cart symbol")
	public void user_click_on_cart_symbol() throws InterruptedException {
	    AddtocartPageMethods.clickCartSymbol();
	    Thread.sleep(9000);
	}

	@Then("Verify whether the products are added to cart with message and total price {string}")
	public void verify_whether_the_products_are_added_to_cart_with_message_and_total_price(String string) {
		try {
			Assert.assertEquals(AddtocartPageMethods.getCartAmount(), string);
		} catch (Exception e) {
			System.out.println("Error in comparing:"+e);
		}
	}
}
