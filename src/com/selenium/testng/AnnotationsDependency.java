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

public class AnnotationsDependency
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
	
	
	
	
	
	@Test(dependsOnMethods="Stest")
	public void Ftest()
	{
		System.out.println("FIRST Test Executed");
	}
	@Test
	public void Stest()
	{
		System.out.println("SECOND Test executed");
	}
	@Test
	public void Ttest()
	{
		System.out.println("THIRD Test executed");
	}
	@Test(dependsOnMethods="Ftest")
	public void Four()
	{
		System.out.println("4Th test executed");
	}
	@Test()
	public void Fifth()
	{
		System.out.println("5th test executed");
	}
	
}
