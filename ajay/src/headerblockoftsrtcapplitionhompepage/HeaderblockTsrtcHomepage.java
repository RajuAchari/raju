package headerblockoftsrtcapplitionhompepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderblockTsrtcHomepage {
public static void main(String[] args) {
	 
	 WebDriver driver;
	 String ApplicationUrlAddress=("https://www.tsrtconline.in/oprs-web/");
	 System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.tsrtconline.in/oprs-web/");
	 String actual_Tsrtc_HomepageTitle=driver.getTitle();
	 System.out.println("The actual Tsrtc homepage title:-"+actual_Tsrtc_HomepageTitle);
	 String actual_TsrtcHomepagecurrentUrlAddress=driver.getCurrentUrl();
	 System.out.println("The current Url address of the tsrtc homepage is:-"+actual_TsrtcHomepagecurrentUrlAddress);
	 //Navigated Tsrtc application homepage and maxmising the browser
	 driver.manage().window().maximize();
	 //Identifying the header block of tsrtc application
	 //class="menu-wrap"
	  By tsrtc_Headerblock=By.className("menu-wrap");
	  WebElement Tsrtc_Headerblock=driver.findElement(tsrtc_Headerblock);
	  //Type of Elements in the Headerblock are-link
	  //<a href="/orps-web/home/aboutus.do">Aboutus</a>
	 // <a href="/orps-web/guest/ticket/cancel.do"">canceltickets</a>
	 // <a href="/orps-web/ticket/waitlist.do">Enquiry<a/a>
	  By headerblockElementlocater=By.tagName("a");
	  //going to the headerblock and finding the elements of the headerblock-which are of type link
	  List<WebElement>headerblockLinks=Tsrtc_Headerblock.findElements(headerblockElementlocater);
	  int headerblockLinks_count=headerblockLinks.size();
	  System.out.println("The number of Elements of the type links in the header"+"BlockofTsrtcapplicationHomepageare:-"+headerblockLinks_count);
	  //getting the elements names of the headeblock 
	  for(int index=0;index<headerblockLinks_count;index++)
	  {
		  String headerblock_linkname=headerblockLinks.get(index).getText();
		  System.out.println(index+" "+headerblock_linkname);
		  
	  }
	  driver.close();
	  

}
}
