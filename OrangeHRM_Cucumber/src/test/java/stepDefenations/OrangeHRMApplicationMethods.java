package stepDefenations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplicationMethods {
	WebDriver driver;
	 String applicationURLaddress="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
	@Given("^User Should Open Chrome Browser in the sysyem$")
	public void user_Should_Open_Chrome_Browser_in_the_sysyem() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajua\\Desktop\\Eclipse\\OrangeHRM_Cucumber\\driverFile\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

	@When("^User enterd OrangeHRM Application Url Address$")
	public void user_enterd_OrangeHRM_Application_Url_Address() {
		driver.get(applicationURLaddress);
		
	}

	@Then("^User Should be navigated to OrangeHRM Application LogIn Page$")
	public void user_Should_be_navigated_to_OrangeHRM_Application_LogIn_Page(){
		String expected_titleofOrangeHrmapplicationloginpage="OrangeHRM";
    	System.out.println("The expected Title of the orangeHRM application login page is:"+expected_titleofOrangeHrmapplicationloginpage);
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
		
		
	}

	@Then("^User Should enter UserName and Password and click on LogIn button$")
	public void user_Should_enter_UserName_and_Password_and_click_on_LogIn_button() {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    	driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
    	driver.findElement(By.className("button")).click();
		
		
		
	}

	@Then("^User Should be able to navigated to OrangeHRM Application HomePage$")
	public void user_Should_be_able_to_navigated_to_OrangeHRM_Application_HomePage() {
		String expected_OrangeHRMApplicationHomePage="OrangeHRM";
		
		System.out.println("The expected Title of The OrangeHRM Application HomePage is :"+expected_OrangeHRMApplicationHomePage);
		String actual_OrangeHRMApplicationHomePage=driver.getTitle();
		
		
		System.out.println("The actual Title of The OrangeHRM Application HomePage is:"+actual_OrangeHRMApplicationHomePage);
	  if(actual_OrangeHRMApplicationHomePage.equals(expected_OrangeHRMApplicationHomePage))
	  {
		  System.out.println("its homePage of OHRM Application");
	  }
	  else
	  { 
		  
		  System.out.println("its not homePage of OHRM Application");
	  }  
	  }
	

	@Then("^User Should LogOut of the OrangeHRM Application$")
	public void user_Should_LogOut_of_the_OrangeHRM_Application() {
		WebElement userNameElement=driver.findElement(By.id("txtUsername"));
	    userNameElement.sendKeys("Admin");
	    By passwordL=By.name("txtPassword");
	    WebElement password=driver.findElement(passwordL);
	    password.sendKeys("Qedge123!@#");
	    By LoginButtonL=By.className("button");
	    WebElement LoginButton=driver.findElement(LoginButtonL);
	    LoginButton.click();
		
		
	}

	@Then("^User Should Close the OrangeHRM Application with the Browser$")
	public void user_Should_Close_the_OrangeHRM_Application_with_the_Browser() {
		
		driver.close();
		
	}

	


}
