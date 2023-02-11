package com.cookies;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_IdentifyingAndDeletingCookies {

	 WebDriver driver;
	 String ApplicationUrlAddress=("https://www.tsrtconline.in/oprs-web/");
    public void ApplicationLaunch()
	{
   // WebDriver driver;
	// String ApplicationUrlAddress=("https://www.tsrtconline.in/oprs-web/");
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\rajua\\eclipse-workspace\\ajay\\DriverFiles\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get(ApplicationUrlAddress);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 {
	 }
	 }
public void handlingcookies()
{
	Set<Cookie>tsrtccookies=driver.manage().getCookies();
	int tsrtccookiescount=tsrtccookies.size();
	System.out.println("The number of cookies of tsrtc application homepage are:-"+tsrtccookiescount);
	Iterator<Cookie>tsrtccookiesIt=tsrtccookies.iterator();
	while (tsrtccookiesIt.hasNext())
	{
		Cookie cookieIt=tsrtccookiesIt.next();
		System.out.println(cookieIt.getDomain()+" "+cookieIt.getName());
	}
	driver.manage().deleteAllCookies();
	tsrtccookies=driver.manage().getCookies();
	tsrtccookiescount=tsrtccookies.size();
	System.out.println("The number of cookies os tsrtc application homepage are:-"+tsrtccookiescount);
}
   public static void main(String[] args) {
	   Tsrtc_IdentifyingAndDeletingCookies handlingcookies=new  Tsrtc_IdentifyingAndDeletingCookies();
	   handlingcookies.ApplicationLaunch();
	   handlingcookies.handlingcookies();
	   handlingcookies.closeApplication();
   }
   public void closeApplication() {

   
	   driver.close();
}}