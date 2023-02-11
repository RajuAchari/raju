package com.OrangeHRMApplicationTestCases;


import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utility.ExcellCommandMethod;

import com.Utility.Log;
import com.Utility.OHRMScreenShot;
import com.Utility.OrangeHRMProperty;

import baseTest.BaseTest;



public class LoginFunctionalityTest extends BaseTest{
	WebDriver driver;
	Properties property;
	String FileInputPath="C:\\Users\\rajua\\Desktop\\eclipse-workspace\\ajay\\ApplicationOrangeHrm\\src\\main\\java\\com\\OrangeHRMApplications\\com.OrangeHRMApplicationsTestDataFile";
	String FileOutputPath="C:\\Users\\rajua\\Desktop\\eclipse-workspace\\ajay\\ApplicationOrangeHrm\\src\\main\\java\\com\\OrangeHRMApplications\\com.OrangeHRMApplicationsTestDataResultFile";
	String Sheetname="sheet1";
	 ExcellCommandMethod excelfile;
	@Test(priority=1,description="validating loginpage-LoginPanelText")
	public void validaLoginPageTest() throws IOException {
	excelfile=new ExcellCommandMethod(FileInputPath,FileOutputPath,Sheetname);
	property=OrangeHRMProperty.loadproperty();
	By loginpageLoginPanelTextLocator=By.id(property.getProperty("loginpageLoginPanelTextLocator"));
	String actual_loginpageLoginPanelTextLocator=driver.findElement(loginpageLoginPanelTextLocator).getText();
	excelfile.setcellvalue(1, 1, actual_loginpageLoginPanelTextLocator);
	String Expected_loginpageLoginPanelTextLocator=excelfile.getcallvalue(1, 0);
	if(actual_loginpageLoginPanelTextLocator.equals(Expected_loginpageLoginPanelTextLocator))
	{
	Log.info("Successfully navigated to the orange HRM Application-Pass");
	excelfile.setcellvalue(1, 2, "Successfully navigated to the Orange HRM Application-Pass");
	}
	else
	{
	Log.info("Failed to navigated to the Orange HRM Application-Fail");
	excelfile.setcellvalue(1, 2, "Failed to navigated to the Orange HRM Application-Fail");
	OHRMScreenShot.takescreenshot(driver, "error-name to navigated to OHRM");
	}}
	@Test(priority=2,description="Orange-OrangeHRMApplicationloginFunctionalityTest")
	public void validateLoginfunctionalityTest() {
	int rowIndex=1;
	while(true) {
	try {

	String userName=excelfile.getcallvalue(rowIndex, 3);
	String password=excelfile.getcallvalue(rowIndex, 4);
	By userNameElementLocator=By.id(property.getProperty("userNameProperty"));
	WebElement userNameElementElement=driver.findElement(userNameElementLocator);
	userNameElementElement.clear();
	userNameElementElement.sendKeys(userName);
	By passwordElementLocator=By.name(property.getProperty("passwordProperty"));
	WebElement passwordElementLocatorl=driver.findElement(passwordElementLocator);
	passwordElementLocatorl.clear();
	passwordElementLocatorl.sendKeys(password);
	By loginpageLoginButtonLocator=By.className(property.getProperty("loginbuttonProperty"));
	driver.findElement(loginpageLoginButtonLocator).click();
	if(isLoginpage()) {
	Log.info("Failed to navigated to the Orange HRM Application-Fail");
	OHRMScreenShot.takescreenshot(driver, userName+password);
	excelfile.setcellvalue(rowIndex,7,"Failed to navigated to the Orange HRM Application-Fail");
	}
	else
	{
	Log.info("Successfully navigated to the Orange HRM Application-Pass");
	validateHomepage(rowIndex);
	logout();
	}
	rowIndex++;

	}catch(Exception e) {
	break;
	}}
	excelfile.SaveExcelData();
	}
	private boolean isLoginpage() {
	try {
	By loginPageInvalidMessegeLocator=By.id(property.getProperty("InvalidMessegeProperty"));
	return driver.findElement(loginPageInvalidMessegeLocator).isDisplayed();
	}catch(Exception e) {
	return false;
	}}
	private void validateHomepage(int rowIndex) throws IOException {
	String Expected_HomePageText=excelfile.getcallvalue(1,5);
	By HomepageWelcomeAdminLocator=By.linkText(property.getProperty("welcomeAdminProperty"));
	String Actual_HomePageText=driver.findElement(HomepageWelcomeAdminLocator).getText();
	excelfile.setcellvalue(1, 6, Actual_HomePageText);
	if(Actual_HomePageText.contains(Expected_HomePageText)) {
	Log.info("Successfully navigated to the Orange HRM Application HomePage-Pass");
	excelfile.setcellvalue(rowIndex, 7, "Successfully navigated to the Orange HRM Application HomePage-Pass");
	}else
	{
	Log.info("Failed navigated to the Orange HRM Application HomePage-Fail");
	OHRMScreenShot.takescreenshot(driver, "Failed to navigated Homepage");
	}}
	   private void logout() {
	    By HomepageWelcomeAdminLocator=By.linkText(property.getProperty("welcomeAdminProperty"));
	    driver.findElement(HomepageWelcomeAdminLocator).click();
	    By HomePageLogoutElementLocator=By.linkText(property.getProperty(" logoutProperty"));
	    driver.findElement(HomePageLogoutElementLocator).click();


	}}


