package com.selenium.alltopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingFrames2 extends BaseClass
{
	@Test
	public static void handlingframes() throws Exception
	{
		d.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		Thread.sleep(2000);
		System.out.println(d.getTitle());
		List<WebElement> l=d.findElements(By.tagName("frame"));
		System.out.println("No of frames are::"+l.size());
		for(WebElement e:l)
		{
			System.out.println(e.getText());
		}
		d.switchTo().frame("packageListFrame");
		d.findElement(By.linkText("com.thoughtworks.selenium")).click();
		d.switchTo().defaultContent();
		d.switchTo().frame(1);
		d.findElement(By.linkText("SeleneseTestBase")).click();
		Thread.sleep(3000);
		d.switchTo().defaultContent();
		d.switchTo().frame(2);
		d.findElement(By.linkText("SeleneseTestNgHelper")).click();
		d.switchTo().defaultContent();
		Thread.sleep(5000);
		
		
	}
	
}
