package valuelabsapllication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NamesofHeaderblockValueLabsapplication {
public static void main(String[] args) {
	 WebDriver driver;
	 String ApplicationUrlAddress=("https://www.valuelabs.com/");
	 System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.valuelabs.com/");
	 String actual_valuelab_HomepageTitle=driver.getTitle();
	 System.out.println("The actual valuelab homepage title:-"+actual_valuelab_HomepageTitle);
	 String actual_valuelabHomepagecurrentUrlAddress=driver.getCurrentUrl();
	 System.out.println("The current Url address of the valuelab homepage is:-"+actual_valuelabHomepagecurrentUrlAddress);
	 driver.manage().window().maximize();
	 // By valuelab_Headerblock=By.className("menu");
	 // By headerblockElementlocater=By.tagName("a");
	
	 /* By headerBlocklocater=By.xpath("//*[@type='button']");
	  WebElement headerblock=driver.findElement(headerBlocklocater);
	  List<WebElement>headerblocklinks=headerblock.findElements(headerBlocklocater);
	 // System.out.println("number of elelment"+"valuelabBlockofHomepageare:-"+headerblock);
	  for(int index=0;index<headerblocklinks.size();index++)
	  {
		  if(headerblocklinks.get(index).isDisplayed())
{
			  String headerblocklinkname=headerblocklinks.get(index).getText();
			  System.out.println(headerblocklinkname);
}}
	  driver.quit();*/
	 By valuelab_HeaderblockL=By.id("navbarSupportedContent");//id="navbarSupportedContent"
	  WebElement valuelab_Headerblock=driver.findElement(valuelab_HeaderblockL);
	  //Type of Elements in the Headerblock are-link
	  //<a href="/orps-web/home/aboutus.do">Aboutus</a>
	 // <a href="/orps-web/guest/ticket/cancel.do"">canceltickets</a>
	 // <a href="/orps-web/ticket/waitlist.do">Enquiry<a/a>
	  By headerblockElementlocater=By.tagName("a");
	  //going to the headerblock and finding the elements of the headerblock-which are of type link
	  List<WebElement>headerblockLinks=valuelab_Headerblock.findElements(headerblockElementlocater);
	 // int headerblockLinks_count=headerblockLinks.size();
	 // System.out.println("The number of Elements of the type links in the header"+"blockvaluelabHomepageare:-"+headerblockLinks_count);
	  //getting the elements names of the headeblock 
	 // for(int index=0;index<headerblockLinks_count;index++)
	  for(int index=0;index<headerblockLinks.size();index++)
	  {
		  String headerblock_linkname=headerblockLinks.get(index).getText();
		  System.out.println(index+" "+headerblock_linkname);
		  
	  }
	  
		
		  By headerBlocklocater=By.id("navbarSupportedContent");
		  WebElement headerblock=driver.findElement(headerBlocklocater);
		  List<WebElement>headerblocklinks=headerblock.findElements(headerBlocklocater);
		 // System.out.println("number of elelment"+"valuelabBlockofHomepageare:-"+headerblock);
		  for(int index=0;index<headerblocklinks.size();index++)
		  {
			  if(headerblocklinks.get(index).isDisplayed())
	{
				  String headerblocklinkname=headerblocklinks.get(index).getText();
				  System.out.println(headerblocklinkname);
	}}
		  driver.quit();
	  
	
}}