package resources;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinations {
	

	@Given("user is on landing page")
	public void user_is_on_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to site");
		
	
	}
	@When("user Enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user successfully Entered username and password"); 
	}
	@Then("user successfully logged in and Welcome message populated")
	public void user_successfully_logged_in_and_welcome_message_populated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user successfully logged in and Welcome message displayed");
	}
	@Then("Dashboard icon appears on left side")
	public void dashboard_icon_appears_on_left_side() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user able to see Dash board icon on the left side");
	}





}
