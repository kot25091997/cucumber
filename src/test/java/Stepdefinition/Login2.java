package Stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login2 {
	
	@When("user enter the username as {string} And password as {string}")
	public void user_enter_the_username_as_And_password_as(String un, String psd) {
	    System.out.println("Enter the username as"+un+"and password as"+psd+"of application");
	}
	@When("submit login form")
	public void submit_login_form() {
		System.out.println("valid login");
	}
	   	

	@Then("verify login failure")
	public void verify_login_failure() {
		System.out.println("invalid login");
	    
	}


}
