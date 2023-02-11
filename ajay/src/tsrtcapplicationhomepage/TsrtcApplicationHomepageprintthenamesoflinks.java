package tsrtcapplicationhomepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TsrtcApplicationHomepageprintthenamesoflinks {
	 WebDriver driver;
public void launchBrouser()
{
	System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
driver=new ChromeDriver();

driver.get("https://www.tsrtconline.in/oprs-web/");

	//<a class="gb_7 gb_8 gb_de gb_dd" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ" target="_top">Sign in</a>
//	String applicationURLaddress="http://google.com";
	
	//To work with multiple elements of a similar type then we should find a comman property exesting emo the similar type of elements under test
	//navigate Tsrtc application homepage
	//automating cancel tickets-elements is of type link
	//<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
	//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
	//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
	//comman property among the links of the webpageis-an anchor tag
	//By linktagsl=By.tagName("a");
	//since multi elements are found and store-its a list
	//since elements are found-its list of webelemenmt-array list of java
	List<WebElement>Tsrtc_Homepagelinks=driver.findElements(By.tagName("a"));
	int Tsrtc_Homepagelinks_count=Tsrtc_Homepagelinks.size();
	//size is array list
	System.out.println("The number of links on the Tsrtc Apllication Homepage are:-"+Tsrtc_Homepagelinks_count);
	for(int index=0;index<Tsrtc_Homepagelinks.size();index++)
	{
		//to go to all the index's os array
		//going to every index of any array list and getting the text of it-identifed link name
		String linkname=Tsrtc_Homepagelinks.get(index).getText();
		System.out.println(index+""+linkname);
		//getting the linkname
	}
	driver.quit();
	
	
			
}
public static void main(String args[])
{
	TsrtcApplicationHomepageprintthenamesoflinks obj=new TsrtcApplicationHomepageprintthenamesoflinks();
	obj.launchBrouser();
}
}
