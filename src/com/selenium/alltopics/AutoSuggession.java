package com.selenium.alltopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AutoSuggession  extends BaseClass
{
@Test
public static void autosuggeesion() throws Exception
{
	d.get("http://jqueryui.com/autocomplete/");
	System.out.println("title is"+d.getTitle());
	d.switchTo().frame(0);
	d.findElement(By.id("tags")).sendKeys("s");
	Thread.sleep(3000);
	List<WebElement> l=d.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	for(WebElement k:l)
	{
		System.out.println(k.getText());
		d.findElement(By.id("tags")).sendKeys(Keys.ARROW_DOWN);
		if(k.getText().equals("Scala"))
		{
			d.findElement(By.id("tags")).sendKeys(Keys.ENTER);
			
		}
	}
	
}
}
