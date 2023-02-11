package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3 {
	@BeforeMethod
	public void gmailApplicationLaunch() {
		System.out.println("***Gmail Application Launch Successfully***");
	}
	@Test(priority=2)
	public void gmailInboxTest()
	{
		System.out.println("Inbox Functionality Test Executed Successfully");
	}
	@Test(priority=3)
	public void gmailCompaseMailTest()
	{
		System.out.println("Compose Mail Functionality Test Executed Successfully");
	}
	@Test(enabled=false)
	public void gmailSentMailTest()
	{
		System.out.println("Sent Mail Functionality Test Executed Successfully");
	}
	@Test(priority=4)
	public void gmailDraftsTest()
	{
		System.out.println("Drafts Mail Functionality Test Executed Successfully");
	}
	@AfterMethod
	public void gmailApplicationClose()
	{
		System.out.println("Gmail Application Closed Successfully");
	}
	

}



