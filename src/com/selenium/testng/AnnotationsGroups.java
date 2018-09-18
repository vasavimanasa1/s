package com.selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsGroups 
{

	@BeforeSuite
	public void testngBeforeSuite()
	{
		System.out.println("Before Suite Executed");
	}
	@AfterSuite
	public void testngAfterSuite()
	{
		System.out.println("AfterSuite Executed");
	}
	@BeforeClass
	public void testngBeforeClass()
	{
		System.out.println("BeforeClass Executed");
	}
	@AfterClass
	public void testngAfterClass()
	{
		System.out.println("AfterClass Executed");
	}
	@BeforeMethod
	public void testngBeforeMethod()
	{
		System.out.println("BeforeMethod Executed");
	}
	@BeforeTest
	public void testngBeforeTest()
	{
		System.out.println("Before Test Executed");
	}
	@AfterTest
	public void testngAfterTest()
	{
		System.out.println("After Test Executed");
	}
	@AfterMethod
	public void testngAfterMethod()
	{
		System.out.println("AfterMethod Executed");
	}
	
	
	@Test(priority=1,groups="Regression")
	public void LoginPage()
	{
		System.out.println("LOGINPAGE Test Executed");
	}
	@Test(priority=4,groups="Regression")
	public void Home()
	{
		System.out.println("HOME Test executed");
	}
	@Test(priority=2,groups="Regression")
	public void Username()
	{
		System.out.println("USERNAME Test executed");
	}
	@Test(priority=3,groups="Regression")
	public void password()
	{
		System.out.println("PASSWORD Test executed");
	}
	@Test (priority=5,groups="Sanity")
	public void Logout()
	{
		System.out.println("LOGOUT Test executed");
	}
	
}
