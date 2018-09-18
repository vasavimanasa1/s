package com.selenium.testng;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Irctc
{
WebDriver d;
	@BeforeMethod
	public void open()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Drivers\\geckodriver.exe");
		d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		
		d.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void teardown()
	{
		d.quit();
	}
	@Test
	public void test1() throws Exception 
	{
		d.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	Thread.sleep(2000);
	System.out.println("The page title is::"+d.getTitle());
	d.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
	Set<String> h=d.getWindowHandles();
	String handle[]=new String[h.size()];
	System.out.println("Number of windows are::"+h.size());
	int i=0;
	for(String s:h)
	{
		System.out.println(s);
		handle[i]=s;
		i++;
	}
	d.switchTo().window(handle[1]);
	//d.findElement(By.xpath("//input[@id='from']")).click();
	d.switchTo().window(handle[0]);
	d.findElement(By.xpath("//a[text()=' ALERTS ']")).click();
	System.out.println("Came to first window");
	
	}
	
}
