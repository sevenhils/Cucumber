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

public class HomePage_Excel extends base {
public	LandingPage l;
public	WebDriver driver;

public static Logger log=LogManager.getLogger(base.class.getName());
@BeforeTest
public void intialize() throws IOException {

	driver = intializeDriver();
	log.info("Browser is intialized");
}
@Test(dataProvider="LoginData")
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
@DataProvider(name = "LoginData")
public String[][] getLoginData() throws IOException {

	String path = System.getProperty("user.dir")+"/src/test/java/resources/Logindata.xlsx";
	int rownum =resources.XLUtils.getRowCount(path, "Sheet1");
	int colcount = resources.XLUtils.getCellCount(path, "Sheet1", 1);
	String[][] LoginData = new String[rownum][colcount];
	for (int i = 1; i < rownum; i++) {
		for (int j = 0; j < colcount; j++) {
			LoginData[i - 1][j] = resources.XLUtils.getCellData(path, "Sheet1", i, j);

		}
	}

	return (LoginData);
}


@AfterTest
public void teardown() {
	driver.close();
}
}
