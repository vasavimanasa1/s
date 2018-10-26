package com.selenium.alltopics;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown  extends BaseClass
{
	@Test
	public static void dropdown() throws Exception
	{
		d.get("https://www.facebook.com/");
		Thread.sleep(2000);
		d.findElement(By.id("email")).sendKeys("manasa");
		d.findElement(By.id("pass")).sendKeys("manasaaa");
		
		d.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vasavi");
		d.findElement(By.xpath("//input[@name='lastname']")).sendKeys("thallapaka");
		d.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("3625487855");
		
		
		Select s = new Select(d.findElement(By.id("day")));
		s.selectByIndex(2);
		
		Select s1=new Select(d.findElement(By.id("month")));
		s1.selectByVisibleText("Mar");

		/*Select s2=new Select(d.findElement(By.id("month")));
		s2.selectByVisibleText("Apr");*/
		
		
		List<WebElement> l=(d.findElements(By.id("month")));
		for(WebElement f:l)
		{
			System.out.println(f.getText());
			
		}
		d.findElement(By.xpath("//input[@id='u_0_9']")).click();
		boolean b=d.findElement(By.xpath("//input[@id='u_0_9']")).isSelected();
		System.out.println(b);
		
		
		
		
	}
}
