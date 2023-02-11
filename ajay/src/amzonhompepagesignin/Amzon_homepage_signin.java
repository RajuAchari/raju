
package amzonhompepagesignin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amzon_homepage_signin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajua\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.Amazon.in");
		 String actual_amazon_HomepageTitle=driver.getTitle();
		 System.out.println("The actual amazon homepage title:-"+actual_amazon_HomepageTitle);
		 String actual_amazonHomepagecurrentUrlAddress=driver.getCurrentUrl();
		 System.out.println("The current Url address of the amazon homepage is:-"+actual_amazonHomepagecurrentUrlAddress);
		 driver.manage().window().maximize();
		  By Amazon_Headerblockl=By.id("nav-link-accountList");//id="navbarSupportedContent"
		  WebElement AmaZon_Headerblockl=driver.findElement(Amazon_Headerblockl);
		  By headerblockElementlocater=By.tagName("a");
		  List<WebElement>headerblockLinks=AmaZon_Headerblockl.findElements(headerblockElementlocater);
		   for(int index=0;index<headerblockLinks.size();index++)
		  {
			  String headerblock_linkname=headerblockLinks.get(index).getText();
				  System.out.println(index+" "+headerblock_linkname);
			  
		  }
		 By hellosigninlocater=By.id("nav-link-accountList");
		 WebElement hellosignin=driver.findElement(hellosigninlocater);
		 Actions action=new Actions(driver);
		 action.moveToElement(hellosignin).build().perform();
		 By yourwishlistlocater=By.linkText("Your Wish List");
		 WebElement yourwishlist=driver.findElement(yourwishlistlocater);
		 yourwishlist.click();
		 System.out.println(driver.getTitle());
		 System.out.println();driver.getCurrentUrl();
		 driver.quit();
		
	}

}
