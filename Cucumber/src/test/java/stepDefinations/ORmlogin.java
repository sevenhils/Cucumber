package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObejects.LandingPage;
import resources.base;

public class ORmlogin extends base {
	public	LandingPage l;
	public	WebDriver driver;
	 @Given("^Intialize the browser with Chrome$")
	    public void intialize_the_browser_with_chrome() throws Throwable {
		 driver = intializeDriver();
	    }
	  @And("^navigated to \"([^\"]*)\"site$")
	    public void navigated_to_somethingsite(String strArg1) throws Throwable {
	      driver.get(strArg1);
	    }
@When("^User Enters Username(.*)$")
public void user_enters_Username(String username) {
	l=new LandingPage(driver);
  	 l.getUsername().sendKeys(username);
}
@And("^User Enters Password(.*)$")
public void user_enters_Password(String password) {
	l=new LandingPage(driver);
  	 l.getPassword().sendKeys(password);
  	l.lgnbttn().click();
}
	


@When("^User Enters Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	    public void user_enters_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	    	l=new LandingPage(driver);
	   	 l.getUsername().sendKeys(prop.getProperty("username"));
	   	 l.getPassword().sendKeys(prop.getProperty("password"));
	   	 l.lgnbttn().click();
	   	 Thread.sleep(3000);

	    	
	    }

	    @Then("^Logged in successfully$")
	    public void logged_in_successfully() throws Throwable {
	    	System.out.println("successfully logged in");
	      
	    }

	    @And("^close the Browser$")
	    public void close_the_browser() throws Throwable {
	        driver.close();
	    } 
	  
	



	



}
