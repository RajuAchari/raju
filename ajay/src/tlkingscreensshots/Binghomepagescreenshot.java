package tlkingscreensshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Binghomepagescreenshot {
	public static void main(String[] args) throws IOException {
		//Automation chrome browser
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Navigating to bing application home page
		driver.get("http://bing.com");
		//client Requirement the Title of bing page should be"bing"
		String expected_BinghomepageTitle="bing";
		//Client requirement saved into a variable
		System.out.println("The expected Title of Bing Home page is:-"+expected_BinghomepageTitle);
		//getting the title of the bing home page-develop by the developer
		String actual_BinghomepageTitle=driver.getTitle();
		System.out.println("The actual title of Bing Homepage is:-"+actual_BinghomepageTitle);
		//validating the title of the Bing home page
		if(actual_BinghomepageTitle.equals(expected_BinghomepageTitle))
		{
			System.out.println("both the actual and expected BingHomePageTitles are thesame-pass");
		}
		else
		{
			System.out.println("Both the actual andexpected BingHomePageTitle are notsame-fail");
		}
		//Take Screenshot-is on interface in selenium web driver
		//output type-scan interface in selenium webdriver
		//type casting 
		File bingHomepageScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bingHomepageScreenShot,new File("./ScreenShot/bing.png"));
		
		
}}
