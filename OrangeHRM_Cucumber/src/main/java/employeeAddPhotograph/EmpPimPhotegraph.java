package employeeAddPhotograph;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Log;



public class EmpPimPhotegraph {
WebDriver driver;
String ApplicatinUrlAddress="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

@BeforeTest
public void launch() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\rajua\\Desktop\\Eclipse\\OrangeHRM_Cucumber\\photos\\chromedriver.exe");
driver=new ChromeDriver();
driver.get(ApplicatinUrlAddress);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


}

@Test(priority=1)
public void loginPage()
{  //id="txtUsername"
By UserNameLocator=By.id("txtUsername");
WebElement UserName=driver.findElement(UserNameLocator);
UserName.sendKeys("Admin");

Log.info("username enter success");
By passwordLocator=By.name("txtPassword");
WebElement password=driver.findElement(passwordLocator);
password.sendKeys("Qedge123!@#");

By LoginLocator=By.className("button");
WebElement Login=driver.findElement(LoginLocator);
Login.click();
}
//
@Test(priority=2)
public void pim()
{
//<b>PIM</b>
//id="menu_pim_viewPimModule"

By pimLocator=By.id("menu_pim_viewPimModule");
WebElement pim=driver.findElement(pimLocator);
Actions action=new Actions(driver);
action.moveToElement(pim).build().perform();
}
@ Test(priority=3)
public void addEmployee()
{
//id="menu_pim_addEmployee"
By AddEmployeeLocator=By.id("menu_pim_addEmployee");
     WebElement AddEmployee=driver.findElement(AddEmployeeLocator);
AddEmployee.click();
}

@Test(priority=4)
public void enterAddemployeeList() throws InterruptedException, IOException
{
 //id="firstName"
By FirstNameLocator=By.id("firstName");
    WebElement FirstName =driver.findElement(FirstNameLocator);
    FirstName.sendKeys("usha");
   
    Actions act=new Actions(driver);
    act.sendKeys(Keys.TAB).build().perform();
   
 //automating middlename
    act.sendKeys("MiddleNameText").build().perform();

 //automating LastNmae
   
       act.sendKeys(Keys.TAB).build().perform();
   act.sendKeys("LastNameText").build().perform();
 //employeeId
   act.sendKeys(Keys.TAB).build().perform();
   
  //automating photograph
   act.sendKeys(Keys.TAB).build().perform();
   act.sendKeys(Keys.ENTER).build().perform();
   Thread.sleep(2000);
   
  
   Runtime.getRuntime().exec("./photos/Murali.123.exe");
   
   
  Thread.sleep(5000);

  By savebutton=By.id("btnSave");
  WebElement savebuttonl=driver.findElement(savebutton);
  savebuttonl.click();
  
  
}
}
