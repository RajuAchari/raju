package facebookl.ogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebookloginpage1 {
	

	public static void main(String[] args) {
    	String applicationURLaddress="http://www.facebook.com";
    	System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get(applicationURLaddress);
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String expected_titleoffacebookapplicationloginpage="https://www.facebook.com";
		System.out.println();
		System.out.println("The actual title of the facebook  application application webpage is:"+applicationURLaddress);
		String actual_facebookapplicationloginpage=driver.getTitle();
    	if(actual_facebookapplicationloginpage.equals(expected_titleoffacebookapplicationloginpage))
    	{
    		System.out.println("Its a login page of facebook application-Pass");
    	}
    	else
    	{
    		System.out.println("Its not a login page of facebook application-Fail");
    	}
    	String expected_urladdressfofacebookapplicationloginpage="https://www.facebook.com";
    	System.out.println("The expected url address of the facebook  login page is:"+expected_titleoffacebookapplicationloginpage);
    	String actual_urladdressoffacebookappliacationwebpage=driver.getCurrentUrl();
        System.out.println("The actual_title of facebook  login page is:"+expected_urladdressfofacebookapplicationloginpage);
    	if(actual_facebookapplicationloginpage.contains(expected_titleoffacebookapplicationloginpage))
    			{
    		System.out.println("Its a login page of facebook appliaction-url address matched-pass");
    			}
    	else
    	{
    		System.out.println("Its not a login of facebook application-url address not matched-fail");
    		
    	}
    	
    	 WebElement usernameelement=driver.findElement(By.id("email"));                           
    	
    	 usernameelement.sendKeys("Tejar445@gmail.com");
    	 //<button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login" data-testid="royal_login_button" type="submit" id="u_0_5_bS">Log in</button>
    	 
    	
    	 By passwordl=By.id("pass");
    	
    	 WebElement password=driver.findElement(passwordl);
    	 password.sendKeys("12029mng025");
//<button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login" data-testid="royal_login_button" type="submit" id="u_0_5_v6">Log in</button>
    	 By loginL=By.name("login");
    	 
    	 WebElement loginbutton=driver.findElement(loginL);
    	
    	 loginbutton.click();
    
    	 WebDriverWait wait=new WebDriverWait(driver,10);
    	
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log Out")));
    	
    	 By logoutl=By.linkText("Log out");
    	 WebElement Logout=driver.findElement(logoutl);
    	 Logout.click();
    	 driver.quit();
    	
    	
	}
	
}



		
	


