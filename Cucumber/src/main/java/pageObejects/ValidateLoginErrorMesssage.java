package pageObejects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidateLoginErrorMesssage {
	public WebDriver driver;
	By Errormessage=By.id("spanMessage");
	
	public ValidateLoginErrorMesssage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement loginErrorMessage() {
		return driver.findElement(Errormessage);
	
	}
}
