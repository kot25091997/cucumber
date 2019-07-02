package Stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login3 {
	@Given("open signup page")
	public void open_signup_page() {
	    System.out.println("opened the signup page");
	}
	@When("user enters firstname as {string}")
	public void user_enters_firstname_as(String fn) {
		 System.out.println("firstname as"+fn+"in firstname field");
	}

	@When("user enters the lastname as{string}")
	public void user_enters_the_lastname_as(String ln) {
		 System.out.println("lastname as"+ln);
	}
	@When("user enters the DOB as{string}")
	public void user_enters_the_DOB_as(String dob) {
		 System.out.println("DOB as"+dob);
	}
	@When("user enters the password as{string}")
	public void user_enters_the_password_as(String psd) {
		 System.out.println("password as"+psd);
	}
	@When("user enters the confirm password as{string}")
	public void user_enters_the_confirm_password_as(String pwd) {
		 System.out.println("confirm password"+pwd);
	}
	@Then("click signup button")
	public void click_signup_button() {
		 System.out.println("click signup button");
	}

	@Then("verify the signup success message")
	public void verify_the_signup_success_message() {
		 System.out.println(" signup success");


	}
}
