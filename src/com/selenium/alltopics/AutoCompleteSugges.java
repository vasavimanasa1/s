package com.selenium.alltopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AutoCompleteSugges  extends BaseClass
{
	@Test
	public static void suggessions() throws Exception
	{
		d.get("https://www.google.com/");
		d.findElement(By.id("lst-ib")).sendKeys("indi");
		List<WebElement> l=d.findElements(By.xpath("//div[@class='sbqs_c']"));
		System.out.println(l.size());
		for(WebElement f:l)
		{
			
			System.out.println(f.getText());
			d.findElement(By.xpath("//div[@class='sbqs_c']")).sendKeys(Keys.ARROW_DOWN);
			if(f.getText().equals("indian army"))
			{
				d.findElement(By.xpath("//div[@class='sbqs_c']")).sendKeys(Keys.ENTER);
				//Thread.sleep(2000);
				d.findElement(By.linkText("ADG PI - INDIAN ARMY (@adgpi) · Twitter")).click();
			}
		}
	
	}

}
