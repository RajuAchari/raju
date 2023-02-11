package com.Webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeAndDate_getFirstRowofFirstCellValue {
	WebDriver driver;
	String applicationurladdress=("https://www.timeanddate.com/worldclock/");
	public void applicatinlaunchl()
	{
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationurladdress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		public void getFirstRowofFirstCellValue() {
			By WebtableCityNameLocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
			WebElement CityNameElement=driver.findElement(WebtableCityNameLocator);
			String CityName=CityNameElement.getText();
		    System.out.println(CityName);
			
		}
		public void Applicationclose()
		{
			driver.quit();
		}
		public static void main(String[] args) {
			TimeAndDate_getFirstRowofFirstCellValue getData = new TimeAndDate_getFirstRowofFirstCellValue();
			getData.applicatinlaunchl();
			getData.getFirstRowofFirstCellValue();
			getData.Applicationclose();
		}
}
