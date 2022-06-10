package pageObejects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {
	public WebDriver driver;
	By username = By.name("txtUsername");
	By password = By.name("txtPassword");
	By SignButton=By.name("Submit");
	By profilebutton=By.id("welcome");
	By logoutbuuton=By.linkText("Logout");
	

	public LandingPage(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getUsername() {
		return driver.findElement(username);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	
	}
	public WebElement lgnbttn() {
		return driver.findElement(SignButton);
	
	}
	public WebElement profilebutton() {
		return driver.findElement(profilebutton);
	
	}
	public WebElement logoutbutton() {
		return driver.findElement(logoutbuuton);
	
	}
	
}
