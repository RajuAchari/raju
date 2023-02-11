package com.validatingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validatingTitle_Binghomepage {

	public static void main(String[] args) {
		//Automation chrome browser
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
		//driver.close();
		driver.quit();
		
	}
		

	}


