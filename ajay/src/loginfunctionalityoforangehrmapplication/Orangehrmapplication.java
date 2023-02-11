


package loginfunctionalityoforangehrmapplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orangehrmapplication {
	public static void main(String[] args) {
	   String applicationURLaddress="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
    	System.setProperty("webdriver.chrome.driver",".//DriverFiles//chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	//driver=new ChromeDriver();
    	driver.get(applicationURLaddress);
    	// validating the login page of Orangehrm application
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
    	//Testing the login functionality of orangeHRM application
    	//Identifying the properties of username element under test-by inspecting the element
    	//<input name="txt username" id="txt username" type="text"
    	//In the properties- identify the locators and its corresponding selector
    	//Locator(attribute)-Id
    	//selector (value)-txt username
    	//To identify an element atleast one locater and its corresponding selector is required
    	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    	driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
    	driver.findElement(By.className("button")).click();
    	//menu_pim_viewPimModule
        By orangehrm_headerblockl=By.id("mainMenuFirstLevelUnorderedList");
    	WebElement orangehrm_headerblock=driver.findElement(orangehrm_headerblockl);
    	By headerblockelementlocator=By.tagName("ul");
    	List<WebElement>headerblocklinks=orangehrm_headerblock.findElements(headerblockelementlocator);
    	int headerblocklinks_count=headerblocklinks.size();
    	System.out.println("The number of elements of type links in the header"+"blockof orangehrm applicaton homepage are:-"+headerblocklinks_count);
    	for(int index=0;index<headerblocklinks_count;index++)
    	{
    		String headerblock_linkname=headerblocklinks.get(index).getText();
    		System.out.println(index+""+headerblock_linkname);
    	}	By piml=By.linkText("PIM");
    	WebElement pim=driver.findElement(piml);
    	//System.out.println("The text of an Element pim is:-"+applicationURLaddress);
    	pim.click();
    	driver.manage().window().maximize();
    	
    	//driver.close();
    	//menu_pim_addEmployee
    	By addemployee=By.linkText("Add Employee");
    	WebElement addemployeel=driver.findElement(addemployee);
    	System.out.println("The text of an Element addemployee is:-"+applicationURLaddress);
    	addemployeel.click();
    	driver.findElement(By.id("firstName")).sendKeys("RajuRa12");
    	driver.findElement(By.id("middleName")).sendKeys("RajuRa123");
    	driver.findElement(By.id("lastName")).sendKeys("Rajura1234");
    	By button=By.linkText("btnSave");
    	WebElement Save=driver.findElement(button);
    	System.out.println("The text of an Element btnSave is:-"+applicationURLaddress);
    	Save.click();
    	//
    	//
    	//driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
    	//driver.findElement(By.className("button")).click();
    	 By welcomeadminl=By.linkText("Welcome Prathap");
    	 WebElement welcomeadmin=driver.findElement(welcomeadminl);
    	 welcomeadmin.click();
    	 driver.close();
    	WebDriverWait wait=new WebDriverWait(driver,10);
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("/symfony/web/index.php/auth/logout")));
    	 By logoutl=By.linkText("/symfony/web/index.php/auth/logout");
         WebElement Logout=driver.findElement(logoutl);
         Logout.click();
//<a href="/symfony/web/index.php/auth/logout">Logout</a>*/
    	
	}
	

}
