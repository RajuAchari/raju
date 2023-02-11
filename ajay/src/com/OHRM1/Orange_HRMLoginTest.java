package com.OHRM1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Orange_HRMLoginTest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		String ApplicationUrlAddress="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	@Test
	public void OrangeHrmFunctionalityText() throws InterruptedException, IOException
	{
		String Expected_LoginPanelText="LOGIN Panel";
		WebElement loginPanelElement=driver.findElement(By.id("logInPanelHeading"));
		String Actual_LoginPanelText=loginPanelElement.getText();
		if (Actual_LoginPanelText.equals(Expected_LoginPanelText))
		{
			System.out.println("OHRM Login Panel Text is Matched-PASS");
		}
		else
		{
			System.out.println("OHRM Login Panel Text is NotMatched-FAIL");
		}
		//Title validation
		
		String Expected_Title="OrangeHRM";
		String Actual_Title=driver.getTitle();
		if (Actual_Title.equals(Expected_Title))
		{
			System.out.println("OHRM Title is Matched-PASS");
	}
		else
		{
			System.out.println("OHRM Title is NotMatched-FAIL");
		}
		
		//Url validation
		String Expected_currentUrl="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
		String Actual_currentUrl=driver.getCurrentUrl();
		if(Actual_currentUrl.contains(Expected_currentUrl))
		{
			System.out.println("OHRM Url is Matched-PASS");
		}
		else
		{
			System.out.println("OHRM Url is NotMatched-FAIL");
		}
		//Login functionality
		By userName=By.name("txtUsername");
		WebElement userName1=driver.findElement(userName);
		userName1.sendKeys("Admin");
		By password=By.name("txtPassword");
		WebElement password1=driver.findElement(password);
		password1.sendKeys("Qedge123!@#");
		By loginButton=By.className("button");
		WebElement loginButton1=driver.findElement(loginButton);
		loginButton1.click();
		
		//welcome Admin Test
		String Expected_welcomeText="Welcome Suresh";
		String Actual_welcomeText=driver.getPageSource();
		if(Actual_welcomeText.contains(Expected_welcomeText))
		{
			System.out.println("OHRM Welcome Text is Matched-PASS");
		}
		else
		{
			System.out.println("OHRM Welcome Text is NotMatched-FAIL");
		}
		//pim Element
		By pimElement=By.linkText("PIM");
	    WebElement pimElement2=driver.findElement(pimElement);
	    Actions action=new Actions(driver);
	    action.moveToElement(pimElement2).build().perform();
	    Thread.sleep(5000);
	    action.sendKeys(Keys.TAB).build().perform();
	    //addEmployeelist
	    
       WebElement addEmployeelist=driver.findElement(By.linkText("PIM"));
       addEmployeelist.click();
       
       
       FileInputStream file=new FileInputStream("./src/com/OHRM1/addemployee;list.xlsx");
       XSSFWorkbook workbook=new XSSFWorkbook(file);
       XSSFSheet sheet=workbook.getSheet("Sheet1");
       
       
       WebElement addEmployee2list=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div"));
       java.util.List<WebElement>tablerows=addEmployee2list.findElements(By.tagName("tr"));
       int tablerows_length=tablerows.size();
       System.out.println(tablerows_length);
       String data=addEmployee2list.getText();
       System.out.println(data);
       for(int i=0;i<tablerows_length;i++)
       {
    	   Row row=sheet.createRow(i);
    	   java.util.List<WebElement>tablecells=tablerows.get(i).findElements(By.tagName("td"));
    	   int tablecells_length=tablecells.size();
    	   System.out.println(tablecells_length);
    	   for(int j=0;j<tablecells_length;j++)
    	   {
    		   Cell cell=row.createCell(j);
    		   String data1=tablecells.get(j).getText();
    		   cell.setCellValue(data1);
    		   System.out.println(data1);
    	   }
    	   FileOutputStream file1=new FileOutputStream("./src/com/OHRM1/addemployee;list.xlsx");
    	   workbook.write(file1);
    	   
    	   
    	   
       }
}
}