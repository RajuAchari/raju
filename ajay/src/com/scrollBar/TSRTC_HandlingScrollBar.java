package com.scrollBar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class TSRTC_HandlingScrollBar{

	 WebDriver driver;
	 String ApplicationUrlAddress=("https://www.tsrtconline.in/oprs-web/");
     public void ApplicationLaunch()
	{
     WebDriver driver;
	 String ApplicationUrlAddress=("https://www.tsrtconline.in/oprs-web/");
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\rajua\\eclipse-workspace\\ajay\\DriverFiles\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get(ApplicationUrlAddress);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
}
	 public void handlingScrollBar()
	 {
		//JavascriptExecutor driver = null;
		//JavaScriptExecutor-is an interface in webdriver
		 //type casting
		//((JavascriptExecutor)driver).executeScript("window.scrollTo(0,250)");
		 //Or
		 JavascriptExecutor js=((JavascriptExecutor)driver);
		 js.executeScript("window.scrollTo(0,250)");
	 }
	 public static void main(String[] args) {
	   TSRTC_HandlingScrollBar scrollBar=new TSRTC_HandlingScrollBar();
	   scrollBar.ApplicationLaunch();
	   scrollBar.handlingScrollBar();
	
		/*// TODO Auto-generated method stub
		 public void HandlingCookies()
		 {
			 Set<Cookie>TSRTCCookies=driver.manage().getCookies();
			 int TSRTcCookiescount=TSRTCCookies.size();
			 System.out.println("The number of Cookies of TSRTC Application Homepage are:-"+TSRTcCookiescount);
			 Iterator<Cookie>TSRTCCookiesIt=TSRTCCookies.iterator();
			 while(TSRTCCookiesIt.hasNext())
			 {
				 Cookie CookieIt=TSRTCCookiesIt.next();
				 System.out.println(CookieIt.getDomain()+""+CookieIt.getName());
			 }
			 driver.manage().deleteAllCookies();
			 TSRTCCookies=driver.manage().getCookies();
			 TSRTcCookiescount=TSRTCCookies.size();
			 System.out.println("The number of cookies of TsRTC Application Homepage are:-"+TSRTcCookiescount);*/
		
	
	

		
}}
		
	
	
		
		
	
	

