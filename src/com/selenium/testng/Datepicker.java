package com.selenium.testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


public class Datepicker 
{
	static WebDriver d;
    
	@BeforeMethod
	public  void Start()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Drivers\\geckodriver.exe");
		d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@AfterMethod
	public  void quit()
	{
	d.quit();
	}
	@Test
	public void test1() throws Exception
	{
		d.get("https://www.goibibo.com/hotels/");
		System.out.println(d.getTitle());
		d.findElement(By.xpath("//span[text()='Check In:']")).click();
		Thread.sleep(2000);
	List<WebElement> l=	d.findElements(By.xpath("//div[@class=\"DayPicker-Day\"]"));
	String sug[]=new String[l.size()] ;
	int i=0;
		for(WebElement s:l)
		{
			System.out.println(s.getText());
			sug[i]=s.getText();
			i++;
		}
		
		
	}
	
	
	
}
