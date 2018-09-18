package com.selenium.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class MultipleWindows 

{
	static WebDriver d;
@BeforeMethod
public void s()
{
	System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Drivers\\geckodriver.exe");
	d=new FirefoxDriver();
d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
d.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	 
}
@AfterMethod
public void t()

{
	d.quit();
}
@Test
public void testonwindows() throws Exception
{
	d.get("https://www.irctc.co.in/nget/train-search");
	System.out.println(d.getTitle());
	Thread.sleep(1000);
	d.findElement(By.linkText(" FLIGHTS ")).click();
	d.findElement(By.id("from")).sendKeys(""+ "3");
}
}
