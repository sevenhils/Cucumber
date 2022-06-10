package resources;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base   {

	public WebDriver driver;

	public Properties prop;
	public ExtentReport report;

	@Test
	public WebDriver intializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\akula\\eclipse-workspace\\Cucumber\\src\\test\\java\\resources\\data.properties");
		prop.load(fis);
	//String browsername=	System.getProperty("browser");//for running through maven &jenkins parameterized browsers on command line mvn test -Dbrowser=chrome
		String browsername = prop.getProperty("browser");
		System.out.println(browsername);
		if (browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("no browser found");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}
public String getScreentShot(String testcasename,WebDriver driver) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
File Sourcefile=	ts.getScreenshotAs(OutputType.FILE);
String destinationfile=System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
FileUtils.copyFile(Sourcefile, new File(destinationfile));
return destinationfile;
}




}
