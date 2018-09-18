package com.selenium.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class calendar
{
	static WebDriver d;
	@BeforeMethod
	public static void start()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Drivers\\geckodriver.exe");
			d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}

	@AfterMethod
	public static void teardown()
	{
		d.quit();
	}
	
	@Test
	public static void test1()
	{
		d.get("https://www.freecrm.com/index.html");
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("manasakrishna");
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("manasakrishna");
		d.findElement(By.xpath("//input[@type='submit']")).click();
		Actions a=new Actions(d);
	    a.moveToElement(d.findElement(By.xpath("//a[text()='Calendar']"))).click().perform();
	}
}
