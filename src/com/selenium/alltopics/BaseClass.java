package com.selenium.alltopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	public static WebDriver d;
	@BeforeMethod
	public static void Start()
	{
		
		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Drivers\\geckodriver.exe");
		d= new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
		
				
	}

	@AfterMethod
	public static void teardown() throws Exception
	{
		d.quit();
		Thread.sleep(2000);
	}
	

}
