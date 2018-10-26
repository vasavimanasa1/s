package com.selenium.alltopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTableConcept  extends BaseClass
{
	@Test
	public static void webtable() throws Exception
	{
		d.get("http://jqueryui.com/datepicker/");
		System.out.println("Title is::  "+d.getTitle());
		d.switchTo().frame(0);
		d.findElement(By.id("datepicker")).click();
		
		
		//WebElement table=d.findElement(By.tagName("table"));
		List<WebElement> tr_collection=d.findElements(By.tagName("tr"));
		System.out.println("The number of rows are:"+tr_collection.size());
		List<WebElement> td_collection1=d.findElements(By.tagName("td"));
		System.out.println("The number of columns are"+td_collection1.size());
		
		int row_num,col_num;
		
		row_num=1;
		
		
		for(WebElement trElement : tr_collection)
        { 
			    List<WebElement> td_collection=trElement.findElements(By.tagName("td"));
			    col_num=1;
			    for(WebElement tdElement: td_collection)
			    {
			    	System.out.println("Row # "+row_num+", Col # "+col_num  + ", Text=" +tdElement.getText());
			    	 col_num++;
			    	 
			    	 
			    }
			    row_num++;
			    
			    Thread.sleep(3000);
        }
		
		
	}
}
