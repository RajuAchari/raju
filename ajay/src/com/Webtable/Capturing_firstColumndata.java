package com.Webtable;

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

public class Capturing_firstColumndata {
	WebDriver driver;
	String applicationurladdress=("https://www.timeanddate.com/worldclock/");
	public void applicatinlaunchl()
	{
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationurladdress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		public void getFirstRowofFirstCellValue() {
			By WebtableCityNameLocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
			WebElement CityNameElement=driver.findElement(WebtableCityNameLocator);
			String CityName=CityNameElement.getText();
		    System.out.println(CityName);
		
			
		}
		public void Applicationclose()
		{
			driver.quit();
		}
		public void getfirstColumndata() throws IOException
		{
			String xpathExpressionpart1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
			String xpathExpressionpart2="]/td[1]";
			FileInputStream File=new FileInputStream("C:\\Users\\rajua\\eclipse-workspace\\ajay\\src\\com\\excell\\Book12.xlsx");
			Workbook wb = new XSSFWorkbook(File);
			Sheet sheet=wb.getSheet("sheet1");
			for(int index=1;index<=36;index++)
			{
				By xpathRowLocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td[1]");
				By xpathRowLocator1=By.xpath(xpathExpressionpart1+index+xpathExpressionpart2);
				WebElement CityName=driver.findElement(xpathRowLocator);
				String CityNameText=CityName.getText();
				System.out.println(CityNameText);
				Row row=sheet.createRow(index);
				Cell cell=row.createCell(0);
				cell.setCellValue(CityNameText);
			}
			FileOutputStream file1=new FileOutputStream("C:\\\\Users\\\\rajua\\\\eclipse-workspace\\\\ajay\\\\src\\\\com\\\\excell\\\\Book12.xlsx");
             wb.write(file1);
             wb.close();
		}
		public static void main(String[] args) throws IOException {
			Capturing_firstColumndata cfcd=new Capturing_firstColumndata();
			cfcd.applicatinlaunchl();
			cfcd.getfirstColumndata();
			cfcd.Applicationclose();
		}
}
