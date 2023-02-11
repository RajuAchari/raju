package orangehrmapplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Webtable.Capturing_firstColumndata;

public class ORHM_ApplicationEmployeelist {
	public static void main(String[] args) throws IOException {
		WebDriver driver;
		String ApplicationUrlAddress="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	/*	String expected_TitleofOrangeHrmApplication="OrangeHRM";
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
	    }*/
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
	    By EmployeeList=By.linkText("Employee List");
	    WebElement EmployeeListl=driver.findElement(EmployeeList);
	    EmployeeListl.click();
	    FileInputStream file=new FileInputStream("C:\\Users\\rajua\\eclipse-workspace\\ajay\\src\\com\\excell\\Book12.xlsx");
	    XSSFWorkbook workbook=new XSSFWorkbook(file);
	    XSSFSheet sheet=workbook.getSheet("sheet3");
	    WebElement addEmployeelist=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div"));
	    List<WebElement>tablerows=addEmployeelist.findElements(By.tagName("tr"));
	    int tablerows_length=tablerows.size();
	    System.out.println(tablerows_length);
	    String data=addEmployeelist.getText();
	    System.out.println(data);
	    for(int i=0;i<tablerows_length;i++)
	    {
	    	Row row=sheet.createRow(i);
	    	List<WebElement>tablecells=tablerows.get(i).findElements(By.tagName("td"));
	    	int tablecells_length=tablecells.size();
	    	System.out.println(tablecells_length);
	    	for(int j=0;j<tablecells_length;j++)
	    	{
	    		Cell cell=row.createCell(j);
	    		String data1=tablecells.get(j).getText();
	    		System.out.println(data1);
	    		cell.setCellValue(data1);
	    	}
	    	FileOutputStream file1=new FileOutputStream("C:\\Users\\rajua\\eclipse-workspace\\ajay\\src\\com\\excell\\Book12.xlsx");
	    	workbook.write(file1);
	}///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[21]/td[2]
		///html/body/div[1]/div[3]/div[2]/div
	    ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[2]/a
	  /*  public void getFirstRowofFirstCellValue() {
	    	By EmployeeNameLocator=By.xpath("/html/body/div[1]/div[3]/div[2]/div");
	        WebElement EmployeeNameElement=driver.findElement(EmployeeNameLocator);
	        String EmployeeName=EmployeeNameElement.getText();
	        System.out.println(EmployeeName);
		}
		public void Applicationclose()
		{
			driver.quit();
		}
		public void getfirstColumndata() throws IOException
		{
			String xpathExpressionpart1="/html/body/div[1]/div[3";
			String xpathExpressionpart2="]/div[2]";
			FileInputStream File=new FileInputStream("C:\\Users\\rajua\\eclipse-workspace\\ajay\\src\\com\\excell\\Book12.xlsx");
			Workbook wb = new XSSFWorkbook(File);
			Sheet sheet=wb.getSheet("sheet2");
			for(int index=1;index<=50;index++)
			{
				By xpathRowLocator=By.xpath("/html/body/div[1]/div[3]/div[2]/div");
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
             wb.close();*/
		}
		
	        		
	}
