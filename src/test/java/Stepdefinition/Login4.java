package Stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Login4 {
	
	@Given("application display Welcome")
	public void application_display_Welcome() {
	System.out.println("Welcome");
	}
	    

	@Given("un and password")
	public void un_and_password() {
		System.out.println("username and password is entered");
	}
	   
	@Given("click signin")
	public void click_signin() {
		System.out.println("click sign in");
	}
	   
	@When("user searches for product headphone")
	public void user_searches_for_product_headphone() {
		System.out.println("click headphone");
	}
	   

	@When("user assing product to cart")
	public void user_assing_product_to_cart() {
		System.out.println("click add to cart");
	}
	  

	@When("user performing payment process using netbanking")
	public void user_performing_payment_process_using_netbanking() {
		System.out.println("click payment");
	}
	   

	@When("user click signout")
	public void user_click_signout() {
		System.out.println("click sign out");
	}
	  



}
