


package captureurladdress1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Captureurladdress_googlehomepage1 {

	public static void main(String[] args) {
		WebDriver driver;
    	String applicationURLaddress="http://google.com";
    	System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get(applicationURLaddress);
    	//getting the title of google homepage
    	String actual_GooglehomepageTitle=driver.getTitle();
    	System.out.println("The actual google homepage Title is:-"+actual_GooglehomepageTitle);
    	//getting the URL address of the current webpage-Google Homepage
    	String actual_GoogleHomepagecurrentURLaddress=driver.getCurrentUrl();
    	System.out.println("The current URL address of the Google Homepage is:"+actual_GoogleHomepagecurrentURLaddress);
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\rajua\\Desktop\\chromedriver.exe");
		String Expected_GoogleHomepageTitle="Google";
		System.out.println("The expected Title of Google Home page is:"+Expected_GoogleHomepageTitle);
		//getting the tilte of the google homepage
		String actual_googleHomepagetitle=driver.getTitle();
		System.out.println("The actual Google Homepage title is:"+actual_googleHomepagetitle);
		//validating Title of Google homepage
		if (actual_googleHomepagetitle.equals(Expected_GoogleHomepageTitle))
		{
			System.out.println("Google Home page Title matched-pass");
		}
		else
		{
			System.out.println("Google Home page Title not matched-fail");
	    }
		String expected_GoogleHomepageUrladdress="google";
		System.out.println("The actual url address of Google homepage is:-"+expected_GoogleHomepageUrladdress);
		//getting the url address of the current webpage_googlehomepage
		String actual_googleHomepagecurrenturladdress=driver.getCurrentUrl();
		System.out.println("The actual currenturladdress of the google homepage is:-"+actual_googleHomepagecurrenturladdress);
		if(actual_googleHomepagecurrenturladdress.contains(expected_GoogleHomepageUrladdress))
		{
			System.out.println("The url address of the homepage matched-pass");
		}
		else
		{
			System.out.println("The url address of the homepage not matched-fail");
		}
		driver.close();
}
}
