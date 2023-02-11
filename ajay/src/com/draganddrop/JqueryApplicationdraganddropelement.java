package com.draganddrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryApplicationdraganddropelement {
public static void main(String[] args) {
	 WebDriver driver;
	 String ApplicationUrlAddress="https://jqueryui.com/droppable/";
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\rajua\\eclipse-workspace\\ajay\\DriverFiles\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get(ApplicationUrlAddress);
	 driver.manage().window().maximize();
	 driver.get(ApplicationUrlAddress);
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 //demo-frame
	 //http://jquery.com/droppable/
	 //identifying the frame of the webpage
	 //<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
	 By jQueryFrameLocator=By.className("demo-frame");
	 WebElement jQueryFrame=driver.findElement(jQueryFrameLocator);
	 //switching into the frame of the webpage -beause the Element under test are
	 //inside the frame
	 driver.switchTo().frame(jQueryFrame);
	 //Drag Me to My Target Element property
	 //id="draggable"
	 //id="draggable"
	 By dragMetoMyTargetLocator=By.id("draggable");
	 WebElement dragMetoMyTarget=driver.findElement(dragMetoMyTargetLocator);
	String dragMetoMyTargetText=dragMetoMyTarget.getText();
	System.out.println("The Text Of An Element dragMetoMyTarget is:-"+dragMetoMyTargetText);
	By dropherelocator=By.id("droppable");
     WebElement drophere=driver.findElement(dragMetoMyTargetLocator);
     Actions action=new Actions(driver);
     action.dragAndDrop(dragMetoMyTarget, drophere).build().perform();
     //getting out of the frame-since the focus is within the frame, switchingback to actual webpage
     driver.switchTo().defaultContent();
     //automate Resizable element 
     //<a href="http://jqueryui.com/resizable/">Resizable</a>
     By Resizablelocator=By.linkText("Resizable");
     WebElement Resizable=driver.findElement(Resizablelocator);
     Resizable.click();
     System.out.println(driver.getTitle());
     driver.quit();
}
}
