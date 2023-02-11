package monsterhomepageapplication;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monsterapllicationcurrentlocation {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    	 WebDriver driver=new ChromeDriver();
    	 driver.get("https://my.monsterindia.com/sponsered_popup.html");
 		String mymonsterindia="my.monsterindia.com";
 		System.out.println("The expected Title of the my.monsterindia:"+mymonsterindia);
 		String Mymonsterindial=driver.getTitle();
 		System.out.println("The actual title of the Mymonsterindia:"+mymonsterindia);
 		By currentLocationLocator=By.className("border_grey1");
 		WebElement currentlcation=driver.findElement(currentLocationLocator);
 	   Select currentlocationselection = new Select (currentlcation);
 	   currentlocationselection.selectByVisibleText("Gurgaon / Gurugram");
 	   By industrylocator=By.id("id_industry");
 	   WebElement industry=driver.findElement(industrylocator);
 	   Select industryselection=new Select(industry);
 	   industryselection.selectByVisibleText("Other");
 	   industryselection.selectByValue("4");
 	   industryselection.selectByIndex(3);
 	   industryselection.deselectByVisibleText("Banking/Accounting/Financial Services");
 	  industryselection.deselectByIndex(2);
 		
 	
 		
	}

}
