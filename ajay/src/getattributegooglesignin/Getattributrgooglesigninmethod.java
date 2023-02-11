package getattributegooglesignin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattributrgooglesigninmethod {
	public static void main(String[] args) {
		//Automation chrome browser
		WebDriver driver;
		//<a class="gb_7 gb_8 gb_de gb_dd" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ" target="_top">Sign in</a>
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
    	//1.identify the element
    	//2.perform the operation on the element
    	By signinl=By.linkText("Sign in");
    	WebElement signin=driver.findElement(signinl);
    	//getting the text of "signin"element
    	String signinelement=signin.getText();
    	//get text metyhod used to get the text 
    	System.out.println("The text of an element signin is:+signinelementtext");
    	String signinclassAttributevalue=signin.getAttribute("class");
    	System.out.println("The class Attribute value of signin element is:-"+signinclassAttributevalue);
    	String signinhrefAttributevalue=signin.getAttribute("href");
    	System.out.println("The href Attribute value of signin element is:-"+signinhrefAttributevalue);
    	//on the same element-using the variable-performing another operation
    	signin.click();
    	driver.quit();
    	
	}

}
