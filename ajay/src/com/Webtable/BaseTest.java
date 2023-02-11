package com.Webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver;
	String ApplicationUrlAddress="https://www.timeanddate.com/worldclock/"; 
	public void ApplicationLaunch()
	{
     System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
     driver=new ChromeDriver();
     driver.get(ApplicationUrlAddress);
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public void Applicationclose()
	{
		driver.quit();
}
}