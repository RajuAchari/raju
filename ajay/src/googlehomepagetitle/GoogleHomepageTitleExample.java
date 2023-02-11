
package googlehomepagetitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomepageTitleExample {
    public static void main(String[] args) {
		//Automation chrome browser
    	 System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
    	 WebDriver driver=new ChromeDriver();
    	 driver.get("http://google.com");
 		String googlehomepagetitle="Google";
 		System.out.println("The expected Title of the Goolge Homepage:"+googlehomepagetitle);
 		String googlehomepageTitle=driver.getTitle();
 		System.out.println("The actual title of the Google Homepage:"+googlehomepageTitle);
 		String string1="Google";
 		System.out.println("The string value string1 converted to upperrcase:+string1");
 		System.out.println(string1.charAt(0));
 		char charAtindex=string1.charAt(0);
 		System.out.println("The value of the variable charAt index is:"+charAtindex);
 		if(googlehomepageTitle.equals(googlehomepageTitle))
 		{
 			System.out.println("both the actual and expected google home is same-Pass");
 		}
 		else
 		{
 			System.out.println("Both the actual and expected google home Page same-fail");
 		}
 		//driver.close();
 		driver.quit();
 		
}
    }
