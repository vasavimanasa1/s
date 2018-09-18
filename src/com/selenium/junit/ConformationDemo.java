package com.selenium.junit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ConformationDemo 
{


	WebDriver d;
	@BeforeClass
	public void SetUp() throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\\\selenium\\\\Drivers\\\\geckodriver.exe")	;
		d=new FirefoxDriver();
		d.get("http://output.jsbin.com/enifaf");
		d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public void Teardown()
	{
		d.quit();
	}
	@Test
	public void confirm()
	{
		d.findElement(By.cssSelector("button")).click();
		Alert a1=d.switchTo().alert();
		System.out.println(a1.getText());
		a1.dismiss();
}
}
