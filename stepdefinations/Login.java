package stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Login {
	
	@Before(order=0,value ="@search")
	public void setUp() {
		System.out.println("Browser got opened");
	}
	
	
	@After(value="@search")
	public void tearDown() {
		System.out.println("Browser got closed");
	}
	/*@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
		
		System.out.println(">> user got navigated to login page");
	    
	}

	@When("User enters valid email address (.+)$")
	public void user_enters_valid_email_address(String emailAddressText) {
		
		System.out.println(">> user enters valid email address:" +emailAddressText);
	    
	}

	@And("Enters valid password (.+)$")
	public void enters_valid_password(String passwordText) {
		
		System.out.println(">> user enters valid password address:" +passwordText);
	   
	}

	@And("Clicks on Login button")
	public void clicks_on_login_button() {
		
		System.out.println(">> user clicks on login button");
	    
	}

	@Then("User should Login successfully")
	public void user_should_login_successfully() {
		
		System.out.println(">> user got logged in successfully");
	    
	}

	@Given("User navigate to Login page")
	public void user_navigate_to_login_page() {
		
		System.out.println(">> user got navigated to login page");
	    
	}

	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidemailAddressText) {
		
		System.out.println(">> user enters invalid email address:" +invalidemailAddressText);
	    
	}

	@When("Enters invalid password {string}")
	public void enters_invalid_password(String invalidpassword) {
		
		System.out.println(">> user enters invalid password address:" +invalidpassword);
	    
	}

	@Then("User should get proper warning message")
	public void user_should_get_proper_warning_message() {
		
		System.out.println(">> user got a proper warning message");
	    
	}

	@When("User dont enters any credentials")
	public void user_dont_enters_any_credentials() {
		
		System.out.println(">>user has not enter any credentials");
	   
	}*/




}
