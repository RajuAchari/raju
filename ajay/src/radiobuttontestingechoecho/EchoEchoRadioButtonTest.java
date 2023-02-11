package radiobuttontestingechoecho;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EchoEchoRadioButtonTest {
WebDriver driver;
String applicationUrladdresss="https://echoecho.com/htmlforms10.htm";
public void ApplicationLaunch()
{
	System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe" );
	driver = new ChromeDriver();
	driver.get(applicationUrladdresss);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
public void RadioButtonTest() throws InterruptedException
{
	By group2RadioButtonLocator=By.name("group1");
	List<WebElement>group1RadioButtons=driver.findElements(group2RadioButtonLocator);
	int groupRadioButtonscountl=group1RadioButtons.size();
	System.out.println("The number of Radio Buttons in group1 are:-"+groupRadioButtonscountl);
	for (int indexclick=0;indexclick<=groupRadioButtonscountl;indexclick++)
	{
		group1RadioButtons.get(indexclick).click();
		Thread.sleep(0000);
		for(int indexclickedstatus=0;indexclickedstatus<groupRadioButtonscountl;indexclickedstatus++)
		{
			System.out.println(group1RadioButtons.get(indexclickedstatus).getAttribute("value")+" "+group1RadioButtons.get(indexclickedstatus).getAttribute("checked"));
		}
		System.out.println();
	}}
public static void main(String[] args) throws InterruptedException {
	EchoEchoRadioButtonTest RadioButtonsTest = new EchoEchoRadioButtonTest();
	RadioButtonsTest.ApplicationLaunch();
	RadioButtonsTest.RadioButtonTest();
	RadioButtonsTest.ApplicationClose();
}
private void ApplicationClose() {
	// TODO Auto-generated method stub
	driver.quit();
}
}