package com.GetTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titleofbinghomepage {

	public static void main(String[] args) {
		//Automation chrome browser
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//navigating to bing application homepage
		driver.get("http://bing.com");
		String a=driver.getTitle();//get Title()method is used to identify the title of the webpage
		//printing the identified title of the bing appliction homrpage
		System.out.println("The Title of the bing Home page is:-"+a);
		//closing the Browser
		driver.close();

	}

}
