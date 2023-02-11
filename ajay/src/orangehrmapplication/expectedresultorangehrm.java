package orangehrmapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class expectedresultorangehrm {
public static void main(String[] args) {
	WebDriver driver;
	String ApplicationUrlAddress="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
	System.setProperty("webdriver.chrome.driver","DriverFiles/chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get(ApplicationUrlAddress);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	String expected_TitleofOrangeHrmApplication="OrangeHRM";
	System.out.println("The expected Title of OrangeHrm Application Login page is:-"+expected_TitleofOrangeHrmApplication);
	String actual_TitleofOrangeHrmApplication=driver.getTitle();
	System.out.println("The actual Title of google homepage is:-"+actual_TitleofOrangeHrmApplication);
	if(actual_TitleofOrangeHrmApplication.equals(expected_TitleofOrangeHrmApplication))
	{
		System.out.println("Its a login page of OrangeHrm Application-pass");
	}
	else
	{
		System.out.println("Its not a login page of OrangeHrm Application-fail");
	}
	String expected_UrlAddressofOrangeHrmApplicationLoginpage="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
	System.out.println("The expected Url Address of OrangeHrm Application Loginpage is:-"+expected_UrlAddressofOrangeHrmApplicationLoginpage);
    String actual_UrlAddressofOrangeHrmApplicationLoginpage=driver.getCurrentUrl();
    System.out.println("The actual Url Address of OrangeHrm Application Loginpage is:-"+expected_UrlAddressofOrangeHrmApplicationLoginpage);
    if(actual_UrlAddressofOrangeHrmApplicationLoginpage.equals(expected_UrlAddressofOrangeHrmApplicationLoginpage))
    {System.out.println("Its a login page of OrangeHrm Application-Url Address matched-pass");
    }
    else
    {
    	System.out.println("Its not a login page of OrangeHrm Application-Url Address not matched-fail");
    }
    WebElement userNameElement=driver.findElement(By.id("txtUsername"));
    userNameElement.sendKeys("Admin");
    By passwordL=By.name("txtPassword");
    WebElement password=driver.findElement(passwordL);
    password.sendKeys("Qedge123!@#");
    By LoginButtonL=By.className("button");
    WebElement LoginButton=driver.findElement(LoginButtonL);
    LoginButton.click();
    By PIML=By.linkText("PIM");
    WebElement PIM=driver.findElement(PIML);
    PIM.click();
    By AddEmployeeL=By.linkText("Add Employee");
    WebElement AddEmployee=driver.findElement(AddEmployeeL);
    AddEmployee.click();
    By firstNameL=By.name("firstName");
    WebElement firstName=driver.findElement(firstNameL);
    firstName.sendKeys("Vadla");
    By middleNameL=By.id("middleName");
    WebElement middleName=driver.findElement(middleNameL);
    middleName.sendKeys("Raju");
    By lastNameL=By.name("lastName");
    WebElement lastName=driver.findElement(lastNameL);
    lastName.sendKeys("Achari");
    By SaveL=By.id("btnSave");
    WebElement Save=driver.findElement(SaveL);
    Save.click();
    By welComeAdminl=By.linkText("Welcome SANJEEV");
    WebElement WelComeAdmin=driver.findElement(welComeAdminl);
    WelComeAdmin.click();
    By logOutL=By.linkText("Logout");
    WebElement logOut=driver.findElement(logOutL);
    logOut.click();
    driver.quit();

}}
