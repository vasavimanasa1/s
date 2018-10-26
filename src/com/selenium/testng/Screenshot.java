package com.selenium.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Screenshot 
{
	WebDriver d;
	@BeforeMethod
	public void start()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Drivers\\geckodriver.exe");
		d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void teardown() throws Exception
	{
		d.quit();
		//Thread.sleep(5000);
	}
	@Test
	public void testScreenShot() throws Exception
	{
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("manasa");
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("mansa");
		Thread.sleep(2000);
		TestUtility.captureScreenShot(d, "FBlogin");
		
	}
}
