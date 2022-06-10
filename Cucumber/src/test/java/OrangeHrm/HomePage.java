package OrangeHrm;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObejects.LandingPage;
import resources.base;

public class HomePage extends base {
public	LandingPage l;
public	WebDriver driver;

public static Logger log=LogManager.getLogger(base.class.getName());
@BeforeTest
public void intialize() throws IOException {

	driver = intializeDriver();
	log.info("Browser is intialized");
}
@Test(dataProvider="getData")
public void basepagenavigation(String Username,String Password) {
	
	driver.get(prop.getProperty("baseURL"));

	l = new LandingPage(driver);
	// l.getUsername().sendKeys(prop.getProperty("username"));//from property file
	l.getUsername().sendKeys(Username);
	log.info("User entered username successfully");
	// l.getPassword().sendKeys(prop.getProperty("password"));//from property file
	l.getPassword().sendKeys(Password);
	log.info("User entered password successfully");

	l.lgnbttn().click();
	log.debug("User  successfully Logged in");
	
	l.profilebutton().click();
	log.debug("User  successfully clicked on welcomebutton");
	l.logoutbutton().click();
	log.info("User  successfully Logged out");
	
	
	
	log.error("button is not displayed");
	log.fatal("button is missing");

}


@DataProvider
public Object[][] getData() {
	Object[][] data = new Object[4][2];

	data[0][0] = "Admin";
	data[0][1] = "admin123";

	data[1][0] = "Admin";
	data[1][1] = "admin1243";

	data[2][0] = "Admin12@";
	data[2][1] = "admin123";
	
	data[3][0] = "Admin12@";
	data[3][1] = "admin1234";

	return data;

}
 
@AfterTest
public void teardown() {
	driver.close();
}
}
