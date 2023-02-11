package com.Grid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;

public class OrangeHRMApplicationLoginTest {
	@Parameters("Browser")
	@Test
	public void loginTest(String BrowserName) throws MalformedURLException
	{
		System.out.println("The Name of the Browser is :-"+BrowserName);
		//Desired capabilities-is a class used to set the information of the browser
		//and the platforms(OS)which should be considered for the Test Run -node info-set
		DesiredCapabilities cap=null;
		if(BrowserName.equals("Chrome"))
		{
			//node
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("Chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
			if(BrowserName.equals("Firefox"))
			{
				//Node
				cap=DesiredCapabilities.firefox();
				cap.setBrowserName("Firefox");
				cap.setPlatform(Platform.WINDOWS);
			}
		//Remote WebDriver-use to set the connection between the hub and the nodes
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.29.192:4444/wd/hub"),cap);
		String ApplicationUrlAddress="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
		driver.get(ApplicationUrlAddress);
		

}
}