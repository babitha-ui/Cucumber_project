package stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class Search {
	/*@Before("@register")  //Hooks
	public void setUp() {
		System.out.println("Browser got opened");
		
	}
	@After("@register")
	public void tearDown() {
		System.out.println("Browser got closed");
		
	}*/
	@BeforeStep("@register")
	public void beforeEverystep() {
		
		System.out.println("++Before every step hook");
	}
	@AfterStep("@register")
   public void afterEverystep() {
		
		System.out.println("++After every step hook");
	}
	
	@Given("User opens the Application")
	public void user_opens_the_application() {
	
		System.out.println(">>Application got opened");
		    
	}

	@When("User enter valid product into search field")
	public void user_enter_valid_product_into_search_field() {
		
		System.out.println(">> User entered valid product into search field");
	    
	}

	@When("User click on search button")
	public void user_click_on_search_button() {
	   
		System.out.println(">> User clicked on search button");
	}

	@Then("valid product should get displayed in search results")
	public void valid_product_should_get_displayed_in_search_results() {
	    
		System.out.println(">>valid product got displayed in search results");
	}

	@When("user enters non existin product into ssearch field")
	public void user_enters_non_existin_product_into_ssearch_field() {
	   
		System.out.println(">> non existing product got entered into search field");
	}

	@Then("proper text informing user about no product matching should be displayed")
	public void proper_text_informing_user_about_no_product_matching_should_be_displayed() {
	   
		System.out.println(">> non existing product got entered into search field");
	}

	@Given("User dont enter any product name")
	public void user_dont_enter_any_product_name() {
	    
		System.out.println(">> non existing product got entered into search field");
	}


}
