package stepdefinations;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	/*@Before(order=0)
	public void setUpOne() {
		
		System.out.println("++setupone before hook method got executed ++ ");
	}
	@Before(order=1)
    public void setUpTwo() {
		
		   System.out.println("++setupone before hook method got executed ++ ");
	}
	
	@Before(order=2)
    public void setUpThree() {
		
		   System.out.println("++setupone before hook method got executed ++ ");
	}
	
	
	@After(order=2)
	public void tearDownOne() {
		
		 System.out.println("--tearDownone after hook method got executed -- ");
	}
	
	@After(order=1)
	public void tearDownTwo() {
		
		 System.out.println("--tearDownone after hook method got executed -- ");
	}
	
	@After(order=0)
	public void tearDownThree() {
		
		 System.out.println("--tearDownone after hook method got executed -- ");
	}*/
	@When("User enters below details into mandatory fields")
	public void User_enters_below_details_into_mandatory_fields(DataTable datatable) {
		
		Map<String, String> map = datatable.asMap(String.class,String.class);
		
		System.out.println("User has entered the first name as"+map.get("firstname"));
		System.out.println("User has entered the last name as"+map.get("lastname"));
		System.out.println("User has entered the email as"+map.get("firstname"));
		System.out.println("User has entered the telephone as"+map.get("telephone"));
		System.out.println("User has entered the password as"+map.get("password"));
		
	}
	
	@Given("^User navigate to Register Account page$")
	public void User_navigate_to_Register_Account_page() {
		
		System.out.println(">>User got navigated to Register account page");
		
	}	
	/*@When("User enters firstname {string} into the First name field")
	public void User_enters_firstname_into_the_First_name_field(String firstNameText ) {
		
		System.out.println(">> User has entered firstname: "+firstNameText+" into the firstname field");
		
		
	}
	@And("Enters lastname {string} into Last name field")	
	public void Enters_lastname_into_Last_name_field(String lastNameText) {
		
		System.out.println(">> User has entered lastname: "+lastNameText+" into the lastname field");
		
	}
	@When("Enters email {string} into Email field")
	public void enters_email_into_email_field(String emailText) {
		
		System.out.println(">> User has entered email: "+emailText+" into the email field");
	    
	}

	@When("Enters telephone {string} into the Telephone field")
	public void enters_telephone_into_the_telephone_field(String telephoneNo) {
		
		System.out.println(">> User has entered telephone no: "+telephoneNo+" into the Telephone field");
	    
	}

	@When("Enters password {string} into the password field")
	public void enters_password_into_the_password_field(String passwordText) {
		
		System.out.println(">> User has entered password no: "+passwordText+" into the Password field");
	    
	}

	@When("Enters password {string} into Confirm password field")
	public void enters_password_into_confirm_password_field(String confirmpwdText) {
		
		System.out.println(">> User has entered confirm password no: "+confirmpwdText+" into the Confirm Password field");
	    
	}*/

	@When("Selects privacy policy field")
	public void selects_privacy_policy_field() {
	    
		System.out.println(">>privacy policy is selected");
	}

	@And("Click on continue button")
	public void Click_on_continue_button() {
		
		System.out.println(">>User has clicked on continue button");
	    
	}

	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() {
	   
		System.out.println(">> User account has successfully created");
	}

	@When("select Yes for Newsletter")
	public void select_yes_for_newsletter() {
	    
		System.out.println(">>User has selected Yes for Newsletter");
	}

	@Given("User navigates to register field")
	public void user_navigates_to_register_field() {
	    
		System.out.println(">>User navigated to register field");
	}

	@When("User dont enter details into any fields")
	public void user_dont_enter_details_into_any_fields() {
	   
		System.out.println(" User kept all the fields blank");
	}

	@When("clicks on continue button")
	public void clicks_on_continue_button() {
		
		System.out.println(">>User has clicked on continue button");
	    
	}

	@Then("warning mmessages should be displayed for the mandatory fields")
	public void warning_mmessages_should_be_displayed_for_the_mandatory_fields() {
	    
		System.out.println("warning mmessages should be displayed for the mandatory fields");
	}




		
	}


