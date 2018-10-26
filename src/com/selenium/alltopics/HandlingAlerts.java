package com.selenium.alltopics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandlingAlerts  extends BaseClass
{

	@Test()
	public void alertHandling() throws Exception
	{
		d.get("http://www.ksrtc.in/oprs-web/guest/home.do?h=1");
		System.out.println(d.getTitle());
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("hyd");
		Thread.sleep(1000);
	//	d.findElement(By.xpath("//input[@id='toPlaceName']")).sendKeys("hyd");
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//input[@id='searchBtn']")).click();
		Alert a=d.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.accept();
		
	}
}
