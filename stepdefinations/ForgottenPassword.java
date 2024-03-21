package stepdefinations;

import io.cucumber.java.en.*;

public class ForgottenPassword {
	
	/*@Given("User opens the Application")
	public void user_opens_the_application() {
	
		System.out.println(">>Application got opened");
	}*/
	
	@When("^User clicks on MyAccount$")
	public void user_clicks_on_my_account() {
		
		System.out.println(">>User clicked on my acccount link");
	    
	}

	@When("^Selects login option$")
	public void selects_login_option() {
	   
		System.out.println(">>Selected login option");
	}

	@When("^Clicks on Forgotten password option$")
	public void clicks_on_forgotten_password_option() {
		
		System.out.println(">>Clicked on forgotton password");
	}

	@When("^Enters valid email address$")
	public void enters_valid_email_address() {
		
		System.out.println(">>Enters valid email address");
	}
	
	@And("Clicks on continue button")
	public void Click_on_continue_button() {
		
		System.out.println(">>User has clicked on continue button");
	}

	@Then("^proper confirmation message should be displayed$")
	public void proper_confirmation_message_should_be_displayed() {
		
		System.out.println(">>proper confirmation message is displayed");
	}




}
