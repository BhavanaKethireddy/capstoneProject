package com.MagentoApplication.StepDefinition;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import com.MagentoApplication.Excel.Excel;
import com.MagentoApplication.Pages.AddtocartPageMethods;
import com.MagentoApplication.Pages.HomePageMethods;
import com.MagentoApplication.Pages.MyAccountMethods;
import com.MagentoApplication.Pages.ProductSearchAddToCartMethods;
import com.MagentoApplication.Pages.SignInPageMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSearchAddStepDefinition {
	@When("User clicks the {string} link on the homepage")
	public void user_clicks_the_link_on_the_homepage(String string) {
	    HomePageMethods.clickSignIN();
	}

	@And("User enters the valid Login Credentials")
	public void user_enters_the_valid_login_credentials(io.cucumber.datatable.DataTable dataTable) throws Exception {
		List<List<String>> data = Excel.dataFromExcel(System.getProperty("user.dir") + "\\src\\test\\resources\\LoginDetails.xlsx", 0);
		dataTable = DataTable.create(data);
		SignInPageMethods.enterInEmail(dataTable.cell(0, 0));
		SignInPageMethods.enterInPassword(dataTable.cell(0, 1));

	}

	@And("User enters the data {string} in the search textbox")
	public void user_enters_the_data_in_the_search_textbox(String string) {
	    MyAccountMethods.enterSearchQuery(string);
	}

	@And("User selects jackets for men from the auto-suggestion list  {string}")
	public void user_selects_jackets_for_men_from_the_auto_suggestion_list(String string) {
	    MyAccountMethods.selectSuggestion(string);
	}

	@And("User clicks on the {string}  from the search results")
	public void user_clicks_on_the_from_the_search_results(String string) {
	    ProductSearchAddToCartMethods.selectingSearchData(string);
	}

	@And("User selects size, color, and quantity from")
	public void user_selects_size_color_and_quantity_from(io.cucumber.datatable.DataTable dataTable) {
		try {
	        List<List<String>> data = Excel.dataFromExcel(System.getProperty("user.dir") + "\\src\\test\\resources\\LoginDetails.xlsx", 0);
	            
	            if (data.size() > 1) {
	                dataTable = DataTable.create(data);
	                AddtocartPageMethods.selectSize(dataTable.cell(1, 0));
	                AddtocartPageMethods.selectColor(dataTable.cell(1, 1));
	                AddtocartPageMethods.enterQuantity(dataTable.cell(1, 2));
	            } else {
	                System.out.println("Insufficient data in Excel");
	            }
	        } catch (IndexOutOfBoundsException e) {
	            System.out.println("Index out of bounds: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Exception: " + e.getMessage());
	        }
	}
	@And("User clicks the Add to Cart button")
	public void user_clicks_the_add_to_cart_button() {
	    AddtocartPageMethods.clickAddToCart();
	}

	@Then("Verify whether the product is added to cart with message {string}")
	public void verify_whether_the_product_is_added_to_cart_with_message(String string) {
		try {
			Assert.assertEquals(AddtocartPageMethods.getCartMessage(), string);
		} catch (Exception e) {
			System.out.println("Error in comparing:"+e);
		}
	}

	}


