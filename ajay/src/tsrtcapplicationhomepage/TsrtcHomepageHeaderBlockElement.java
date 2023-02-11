package tsrtcapplicationhomepage;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TsrtcHomepageHeaderBlockElement {
public static void main(String[] args) {
	 WebDriver driver;
	 String applicationUrl="https://www.tsrtconline.in/oprs-web/";
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\rajua\\eclipse-workspace\\ajay\\DriverFiles\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get(applicationUrl);
	 //Navigated Tsrtc application homepage and maxmising the browser
	// driver.manage().window().maximize();
	 //navigated to tsrtc application homepage
	 //refer the above script to identify the elements of the headerblock and the getting the names of headerblock
	 //getting the elements names of the header blocks
	  By Tsrtc_HeaderblockL=By.className("menu-wrap");
	  WebElement tsrtc_Headerblock=driver.findElement(Tsrtc_HeaderblockL);
	  //Type of Elements in the Headerblock are-link
	 // <a href="/orps-web/home/aboutus.do">Aboutus</a>
	 // <a href="/orps-web/guest/ticket/cancel.do"">canceltickets</a>
	//  <a href="/orps-web/ticket/waitlist.do">Enquiry<a/a>
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  By headerblockElementLocater=By.tagName("a");
	  //going to the headerblock and finding the elements of the headerblock-which are of type link
	  List<WebElement>headerblocklinks=tsrtc_Headerblock.findElements(headerblockElementLocater);
	  int headerblocklinks_count=headerblocklinks.size();
	  System.out.println("headerblocklinks_count :" +headerblocklinks_count);
	  //getting the elements names of the headeblock 
	  for(int index=0;index<headerblocklinks_count;index++)
	  {
		  String headerblock_linkname=headerblocklinks.get(index).getText();
		  System.out.println(index + " "+ headerblock_linkname);
		  
		  headerblocklinks.get(index).click();
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  
		  driver.navigate().back();
		  tsrtc_Headerblock=driver.findElement(Tsrtc_HeaderblockL);
		  headerblocklinks=tsrtc_Headerblock.findElements(headerblockElementLocater);
	      
	
		
		
	  }
}
}


		  
		  
	

