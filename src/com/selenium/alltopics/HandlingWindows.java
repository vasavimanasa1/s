package com.selenium.alltopics;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingWindows extends BaseClass
{
	@Test
	public static void windowhandling() throws Exception
	{
		d.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		System.out.println(d.getTitle());
		d.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> h=d.getWindowHandles();
		System.out.println(h.size());
		String handle[]=new String[h.size()];
		int i=0;
		for(String s:h)
		{
			System.out.println(s);
			handle[i]=s;
			i++;
		}
		d.switchTo().window(handle[1]);
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='tripTypem']")).click();
		boolean b=d.findElement(By.xpath("//input[@id='tripTypem']")).isSelected();
		System.out.println(b);
		boolean b1=d.findElement(By.id("ltc")).isSelected();
		System.out.println("Ltc is selected or not::"+b1);
		
		Thread.sleep(2000);
		d.findElement(By.linkText(" CONTACT US ")).click();
		d.findElement(By.xpath("//span[@class='fa fa-fw fa-close']")).click();
		/*Alert a=d.switchTo().alert();
		Thread.sleep(2000);
		
		System.out.println(a.getText());
		a.accept();*/
		
		
	}

}
