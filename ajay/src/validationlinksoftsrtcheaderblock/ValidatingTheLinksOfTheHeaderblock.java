package validationlinksoftsrtcheaderblock;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTheLinksOfTheHeaderblock {
public static void main(String[] args) {
	WebDriver driver;
	String applicationUrl="https://www.tsrtconline.in/oprs-web/";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rajua\\eclipse-workspace\\ajay\\DriverFiles\\chromedriver.exe");
	driver=new ChromeDriver(); 
	driver.get(applicationUrl);
	By tsrtc_headerblockl=By.className("menu-wrap");
	WebElement tsrtc_headerblock=driver.findElement(tsrtc_headerblockl);
	By headerblockelementlocator=By.tagName("a");
	List<WebElement>headerblocklinks=tsrtc_headerblock.findElements(headerblockelementlocator);
      int headerblocklinks_count=headerblocklinks.size();
      System.out.println("The number of elements of type of links in the header"+"block of tsrtc application homepage are:-"+headerblocklinks_count);
      for(int index=0;index<headerblocklinks_count;index++)
      {
    	  
    	  String headerblock_linkname=headerblocklinks.get(index).getText();
    	  System.out.println(index+" "+headerblock_linkname);
    	  String expected_linkurladdress=headerblocklinks.get(index).getAttribute("href");
    	  System.out.println("The expected url address of link is:-"+expected_linkurladdress);
    	  headerblocklinks.get(index).click();
    	  String actual_webpageurladdress=driver.getCurrentUrl();
    	  System.out.println("The actual url address after the links is clicked:-"+actual_webpageurladdress);
    	  if(actual_webpageurladdress.equals(expected_linkurladdress))
    	  {
    		  System.out.println("successfully navigated to the link webpage url address-pass");
    	  }
    	  else
    	  {
    		  System.out.println("failed to navigated to the link webpage url address-fail");
	}
    	  driver.navigate().back();
    	  tsrtc_headerblock=driver.findElement(tsrtc_headerblockl);
    	  headerblocklinks=tsrtc_headerblock.findElements(headerblockelementlocator);
}
}
}