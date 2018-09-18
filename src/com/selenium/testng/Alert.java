package com.selenium.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert 
{
	WebDriver d;
	public static void main(String args[])
	{
	System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Drivers\\geckodriver.exe");
	WebDriver	d=new FirefoxDriver();
	d.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
	d.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	d.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	d.findElement(By.xpath("//label[@for='concessionBooking']")).click();
	org.openqa.selenium.Alert a=d.switchTo().alert();
	
	a.accept();
	
	

}
}