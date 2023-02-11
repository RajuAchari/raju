package gettextgooglehomepagesignin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextmethodgooglesignin {
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
    	//driver.close();
		/*
		 * <a href="http://accogle.com/&amp;ec=GAZAmgq"target="-top">signin,/a>
		 * a- an anchor tag
		 * href-attribute
		 * http://accounts.goog.com/7amp;ec=GAZAmgq-value
		 * element-of type-link
		 * locator-linktext
		 * selector-signin
		 */
		//1.identify the element
		//2.perform the operation on the element
		By signinl=By.linkText("Sign in");
		WebElement signin=driver.findElement(signinl);
		//getting the text of"signin"element
		String signinelementtext=signin.getText();
		//get text method to get the text
		System.out.println("The text of an element signin is:-"+signinelementtext);
		//on the same element-using the variable-performing another operation
		signin.click();
		//driver.quit();
		
	}

}
