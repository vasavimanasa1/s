package com.selenium.alltopics;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleSite extends BaseClass
{
	static int enabledlinks,disablelinks;
@Test
public static void  ExampleSite() throws Exception
{
	
	d.get("https://www.google.com/");
	System.out.println("The title is::"+d.getTitle());
	//assert.assertEquals("Google", d.getTitle());
	Assert.assertEquals("Google", d.getTitle());
	d.findElement(By.id("lst-ib")).sendKeys("Selenium By Ramesh");
	d.findElement(By.xpath("//input[@name='btnK']")).click();
	//Thread.sleep(3000);
	d.findElement(By.xpath("//h3[text()='Selenium : Selenium WebDriver By Ramesh Anapati']")).click();
	Thread.sleep(2000);
	List<WebElement> l=d.findElements(By.tagName("a"));
	Thread.sleep(2000);
	
	System.out.println("The number of links are:"+l.size());
	
	int linkstot=l.size();
	
	/*System.out.println("links total"+linkstot);
	for(WebElement f:l)
	{
		System.out.println(f);
	}
	*/
	Iterator  i=l.iterator();
	while(i.hasNext())
	{
		WebElement link=(WebElement)i.next();
		if(link.isDisplayed()&&link.isEnabled())
		{
			enabledlinks++;
			
		}
		else
		{
			disablelinks++;
		}
	}
		
	System.out.println("Number of enabledlinks are:"+enabledlinks);
	System.out.println("Number of disabled links are:"+disablelinks);
		
		int k=enabledlinks+disablelinks;
	if(k==linkstot)
	{
		System.out.println("matching");
	}
	else
	{
		System.out.println("not matching");
	}
	
	
	
	
	
}
}
