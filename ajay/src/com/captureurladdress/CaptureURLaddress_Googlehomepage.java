   package com.captureurladdress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureURLaddress_Googlehomepage {
    	
    public static void main(String[] args) {
    	WebDriver driver;
    	String applicationURLaddress="http://google.com";
    	System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get(applicationURLaddress);
    	//getting the title of google homepage
    	String actual_GooglehomepageTitle=driver.getTitle();
    	System.out.println("The actual google homepage Title is:-"+actual_GooglehomepageTitle);
    	//getting the URL address of the current webpage-Google Homepage
    	String actual_GoogleHomepagecurrentURLaddress=driver.getCurrentUrl();
    	System.out.println("The current URL address of the Google Homepage is:"+actual_GoogleHomepagecurrentURLaddress);
    	driver.close();
	
}
}
