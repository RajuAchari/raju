package orhmbaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		String ApplicationUrlAddress="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
		driver=new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		
}
}