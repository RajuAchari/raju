package com.Webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableAssignment {
	WebDriver driver;
	String applicationurladdress=("https://www.timeanddate.com/worldclock/");
	public void applicatinlaunchl()
	{
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationurladdress);
	}
	public static void main(String[] args) {
		WebtableAssignment cityname=new WebtableAssignment();
		cityname.applicatinlaunchl();
		cityname.mm();
	}
public void mm()
{
	
//By suu=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a");
  // {
   for (int i=1;i<=36;i++)
   {
	   WebElement data=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]/a"));
	   String mm=data.getText();
	   System.out.println(mm);}
}}