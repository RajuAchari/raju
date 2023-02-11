package com.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class OHRMScreenShot {
	
	public static void takescreenshot(WebDriver driver,String imageName) throws IOException
	{
	TakesScreenshot takesscreenshot=(TakesScreenshot)driver;
	File errorscreenshot=takesscreenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(errorscreenshot,new File("./orangeHrmApplicationerrorscreeshots/"+imageName+".png"));

}
}