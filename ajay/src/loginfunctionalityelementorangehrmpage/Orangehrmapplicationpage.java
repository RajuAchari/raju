
package loginfunctionalityelementorangehrmpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Orangehrmapplicationpage {
	public static void main(String[] args) {
		  String applicationURLaddress="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
	    	System.setProperty("webdriver.chrome.driver",".//DriverFiles//chromedriver.exe");
	    	WebDriver driver=new ChromeDriver();
	    	//driver=new ChromeDriver();
	    	driver.get(applicationURLaddress);
	    	//Implicit wait is a global wait,its a smart wait-it is applicable to all the elements
	    	//to be identified on the webpage to be loaded
	    	//since its a global wait-set to the driver-it will be applicable for all the elements
	    	//of all the navigated web pages
	    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    	// validating the login page of Orangehrm application
	    	String expected_titleofOrangeHrmapplicationloginpage="OrangeHRM";
	    	System.out.println();
	    	String actual_titleorangeHRMapplicationloginpage=driver.getTitle();
	    	System.out.println("The actual title of the orange HRM application application webpage is:"+actual_titleorangeHRMapplicationloginpage);
	    	if(actual_titleorangeHRMapplicationloginpage.equals(expected_titleofOrangeHrmapplicationloginpage))
	    	{
	    		System.out.println("Its a login page of orangeHRM application-Pass");
	    	}
	    	else
	    	{
	    		System.out.println("Its not a login page of orangeHRM application-Fail");
	    	}
	    	String expected_urladdressfororangeHRMapplicationloginpage="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
	    	System.out.println("The expected url address of the orangehRM application login page is:"+expected_urladdressfororangeHRMapplicationloginpage);
	    	String actual_urladdressoforangeHRMappliacationwebpage=driver.getCurrentUrl();
	        System.out.println("The actual_urladdress of orangeHRM appliaction login page is:"+actual_urladdressoforangeHRMappliacationwebpage);
	    	if(actual_urladdressoforangeHRMappliacationwebpage.contains(expected_urladdressfororangeHRMapplicationloginpage))
	    			{
	    		System.out.println("Its a login page of orangeHRM appliaction-url address matched-pass");
	    			}
	    	else
	    	{
	    		System.out.println("Its not a login of orangeHRM application-url address not matched-fail");
	    		
	    	}
	    	//validating the login page of orange hrm application-writescript for validation
	    	//Testing the login functionality of orange hrm application
	    	//<inputname="txtusername" id="txtusername" type="text"
	    	//driver.findElement(By.id("txtusername")).sendKeys("srini");
	    	 WebElement usernameelement=driver.findElement(By.id("txtUsername"));                           
	    	 //idetifying the element of a webpage and assiging it to a variable
	    	 //since the variable (User name element)is saved with an element-the declaration should
	    	 //be of type element(from the package import org.openqa.selenium.webelement)
	    	 usernameelement.sendKeys("Admin");
	    	 //using the variable perforaming the operation
	    	 //<inputname="txtpassword" id="txtpassword"autocomplete="off"type="password">
	    	// WebElement passwordelement=driver.findElement(By.name("txtpassword"));
	    	 //passwordelement.sendKeys("Q@Trainer7");
	    	 //locator-name
	    	 //selector-txtpassword
	    	 By passwordl=By.id("txtPassword");
	    	 //identifying a property and assigning to a variable
	    	 WebElement password=driver.findElement(passwordl);
	    	 password.sendKeys("Qedge123!@#");
	    	 //input type="submit"name="submit"class="button"id="btnlogin"value="Login">
	    	 By loginbuttonl=By.className("button");
	    	 //property of an element-Login button
	    	 WebElement loginbutton=driver.findElement(loginbuttonl);
	    	 //identifying the element on the web page
	    	 loginbutton.click();
	    	 //Automating welcome admin element
	    	 //<a href="#"id="Welcome"class="paneltriggeractivated-welcome">welcomeadmin</a>
	    	 By piml=By.linkText("PIM");
	     	WebElement pim=driver.findElement(piml);
	     	pim.click();
	     	By addemployee=By.linkText("Add Employee");
	    	WebElement addemployeel=driver.findElement(addemployee);
	    	addemployeel.click();
	    	driver.findElement(By.id("firstName")).sendKeys("RajuRa12");
	    	driver.findElement(By.id("middleName")).sendKeys("RajuRa123");
	    	driver.findElement(By.id("lastName")).sendKeys("Rajura1234");
	    	By savel=By.xpath("//input[@value=\"Save\"]");
	    	WebElement Save=driver.findElement(savel);
	    	Save.click();
	    	 By welcomeadminl=By.linkText("Welcome Suresh");	
	    	 WebElement welcomeadmin=driver.findElement(welcomeadminl);
	    	 welcomeadmin.click();
	    	 //Synchronization
	    	// Thread.sleep(1000);//java wait-explict wait
	    	 //synchronization-of webdriver
	    	 //waits 0nly the respected elements to be located on the webpage
	    	// WebDriverWait wait=new WebDriverWait(driver,10);
	    	 //Explict wait-10 seconds
	    	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
	    	 //Automating logout element
	    	 //<a href="/orangehrmauth/logout">Logout</a>
	    	 //<a href="orangehrm-4.2.0.01/symfuny/web/index.php/auth//logout">Logout</a>
	    	 By logoutl=By.linkText("Logout");
	    	 WebElement Logout=driver.findElement(logoutl);
	    	 Logout.click();
	    	 driver.quit();
	    	 
	    	 
	    	
	    	
	    	
		
	}

}
