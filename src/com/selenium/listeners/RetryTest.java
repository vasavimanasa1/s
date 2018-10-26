package com.selenium.listeners;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.alltopics.BaseClass;

public class RetryTest 
{
	static WebDriver d;
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
	
	
	@Test(retryAnalyzer=CustomRetryAnalyzer.class)
	public void login() throws Exception
	{
		d.get("https://www.google.com/");
		d.findElement(By.id("lst-i")).sendKeys("masa");
		d.findElement(By.name("btnK")).click();
	}
	
	

}
