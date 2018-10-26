


		//number of links in webpage********to print 

package com.selenium.alltopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingFrames extends BaseClass
{
	@Test
	public void framehandling()
	{
		d.get("http://jqueryui.com/autocomplete/");
		System.out.println(d.getTitle());
		
		List<WebElement> l=d.findElements(By.tagName("a"));
		System.out.println("No of elements with iframe tag"+l.size());
		for(WebElement p:l)
		{
			System.out.println(p.getText());
		}
		//d.switchTo().frame(0);
		//d.findElement(By.xpath("//input[@id='tags']")).sendKeys("selenium");
		
	}
	
}
