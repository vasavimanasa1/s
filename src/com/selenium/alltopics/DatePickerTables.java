package com.selenium.alltopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DatePickerTables extends BaseClass
{
	@Test
	public static void webtable() throws Exception
	{
		d.get("http://jqueryui.com/datepicker/");
		System.out.println("Title is::  "+d.getTitle());
		d.switchTo().frame(0);
		d.findElement(By.id("datepicker")).click();
		Thread.sleep(3000);
	
		List<WebElement> totalElmts=d.findElements(By.xpath("//div[@id='ui-datepicker-div']"));
		int nodes=totalElmts.size();
		System.out.println("total nodes are"+nodes);
		
		for(int i=0;i<nodes;i++)
		{
			String dt=totalElmts.get(i).getText();
			if(dt.equalsIgnoreCase("30"))
			{
				totalElmts.get(i).click();
				break;
			}
		
		Thread.sleep(2000);
		
	}
		Thread.sleep(2000);
}
	
}
