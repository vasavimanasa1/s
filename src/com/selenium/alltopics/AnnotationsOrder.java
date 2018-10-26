package com.selenium.alltopics;

import org.testng.annotations.*;

public class AnnotationsOrder extends BaseClass
{
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("beforeSuite executed");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("BEFORE TEST executed");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Beforeclass executed");
	}
	@Test(priority=2)
	public void test1()
	{
		
		System.out.println("Test1 executed");
	}
	@Test(priority=1)
	public void test2()
	{
		System.out.println("Test2 executed");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Aftersuite executed");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("Aftertest executed");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("Afterclass executed");
	}

}
