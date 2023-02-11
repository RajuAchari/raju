package com.TestNG;

import org.testng.annotations.Test;

public class Annotations {
	//@Test-user defind method when implimented with@test-it-represents to a test case
	//@Test- should br written with the functionality undertest
	//If there are multiple test cases in a class-then the test cases will be extend
	//Based on Application order of the given case name
	//If there are multiple test cases in a class - if any test cases starting
	//Uppercase letter-then that test case will be executed first
	//If the class has multiple test cases then-the test cases should be set with priority
	//If any of the test case should be ignore during the test/run/execution that
	//Test case should be set with an argument as-enable=false
	@Test(priority=1)
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
	@Test(priority=6)
	public void gmailApplicationClose()
	{
		System.out.println("Gmail Application Closed Successfully");
	}
	

}
