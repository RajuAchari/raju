package baseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;


public class BaseTest {
	public WebDriver driver;
	@BeforeTest
	public void setup()
	{
	String ApplicatinUrlAddress="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

	System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(ApplicatinUrlAddress);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterTest
	public void teardown()
	{
	driver.close();
	



}
	}

