package com.selenium.testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class WebbrowserLaunching
{
WebDriver d;
	@BeforeMethod
	public void start()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Drivers\\geckodriver.exe");
	    d=new FirefoxDriver();
	    d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    d.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	 @AfterMethod
	 public void teardown()
	{
	   d.quit();

	}
	
	
	@Test
	public void testt() throws Exception
	{
	    d.get("https://www.facebook.com/");
	    System.out.println("The current page title is"+  d.getTitle());
	
	d.findElement(By.id("email")).sendKeys("Manasa");
	Thread.sleep(2000);
	d.findElement(By.id("pass")).sendKeys("htrepiu");
	Thread.sleep(2000);
	d.findElement(By.name("firstname")).sendKeys("vasavi");
	Thread.sleep(2000);
	d.findElement(By.id("u_0_u")).sendKeys("manasa");
	
	
	
	Select  dd=new Select(d.findElement(By.xpath("//select[@id='month']")));
	dd.selectByIndex(8);
	List<WebElement> l=d.findElements(By.xpath("//select[@id='month']"));
	    for(WebElement e:l)
    	{
		System.out.println(e.getText());
     	}
	}
	
		

	}


