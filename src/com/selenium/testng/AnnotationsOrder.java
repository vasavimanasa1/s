package com.selenium.testng;

import org.testng.annotations.*;

public class AnnotationsOrder 
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

		
		
	@Test
	public void Ftest()
	{
		System.out.println("First Test Executed");
	}
	@Test
	public void Stest()
	{
		System.out.println("SECOND Test executed");
	}
	
}
