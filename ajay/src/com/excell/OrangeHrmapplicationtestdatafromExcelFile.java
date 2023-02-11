package com.excell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmapplicationtestdatafromExcelFile {
public static void main(String[] args) throws IOException {
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
    FileInputStream logintestdatafile=new FileInputStream("C:\\Users\\rajua\\Desktop\\Book1.xlsx");
    Workbook wb=new XSSFWorkbook(logintestdatafile);
    Sheet sheet= wb.getSheet("sheet1");
    Row row=sheet.getRow(1);
    Cell usernametestdatacell=row.getCell(0);
    String usernametestdata=usernametestdatacell.getStringCellValue();
    System.out.println("The password is:-"+usernametestdata);
    By usernamelocator=By.id("txtUsername");
    WebElement userName=driver.findElement(usernamelocator);
    userName.sendKeys(usernametestdata);
    
    
   // FileInputStream logintestdatafile=new FileInputStream("C:\\Users\\rajua\\Desktop\\Book1.xlsx");
    //Workbook wb=new XSSFWorkbook(logintestdatafile);
   // Sheet sheet= wb.getSheet("sheet1");
   // Row row=sheet.getRow(1);
    Cell passwordtestdatacell=row.getCell(0);
   String passwordtestdata=passwordtestdatacell.getStringCellValue();
    System.out.println("The username is:-"+passwordtestdata);
   By passwordlocator=By.id("txtPassword");
   WebElement password=driver.findElement(passwordlocator);
    password.sendKeys(passwordtestdata);
    
    By loginButtonlocator=By.className("button");
    WebElement loginButton=driver.findElement(loginButtonlocator);
    loginButton.click();
    
    By WelcomeAdminloctor=By.id("Welcome SANJEEV");
    WebElement WelcomeAdmin=driver.findElement(WelcomeAdminloctor);
    
    String expected_OrangeHrmApplicationHomepageText="Admin";
    String actual_OrangeHrmApplicationHomepageText=WelcomeAdmin.getText();
    if(actual_OrangeHrmApplicationHomepageText.contains(expected_OrangeHrmApplicationHomepageText))
    {
    	System.out.println("Successfully navigated to home page-pass");
    	Cell newRowofcell=row.createCell(2);
    	newRowofcell.setCellValue("succcessfully navigated to home page-pass");
    }
    else {
    	System.out.println("failed navigated to home page-faIL");
    	Cell newRowofcellCell=row.createCell(2);
    	newRowofcellCell.setCellValue("failed navigated to home page-fail");
    }
   FileOutputStream logintestresultfile=new FileOutputStream("C:\\Users\\rajua\\Desktop\\Book1.xlsx");
   wb.write(logintestresultfile);
   WelcomeAdmin.click();


    


   
    
   

}}

