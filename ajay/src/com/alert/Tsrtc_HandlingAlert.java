package com.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_HandlingAlert {
	public static void main(String[] args) {
		 WebDriver driver;
		 String applicationUrl="https://www.tsrtconline.in/oprs-web/";
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\rajua\\eclipse-workspace\\ajay\\DriverFiles\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(applicationUrl);
		 By Tsrtc_HeaderblockL=By.className("menu-wrap");
		 WebElement tsrtc_Headerblock=driver.findElement(Tsrtc_HeaderblockL);
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 By checkavailabilitylocator=By.id("searchBtn");
		 WebElement checkAvalibility=driver.findElement(checkavailabilitylocator);
		 System.out.println("The Text of the button availability is:-"+checkAvalibility.getAttribute("value"));
		  checkAvalibility.click();
		 //Alert is an interface for the package-impororg.openqa.selenium.Alert;
		 //from the current webpage -switching into the Alert and performing operation
		 Alert alert=driver.switchTo().alert();
		// Thread.sleep(1000);
		 alert.dismiss();
		 //will perform operation on the cancell button
		 //sending text into an alert
		// alert.sendKeys("sending the data into the into the alert text element");
		 driver.quit();
	}

}
