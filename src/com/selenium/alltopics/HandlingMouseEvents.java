package com.selenium.alltopics;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingMouseEvents  extends BaseClass
{
	@Test
	public static void mousehandling() throws Exception
	{
		d.get("http://jqueryui.com/");
		System.out.println(d.getTitle());
		Thread.sleep(2000);
		d.findElement(By.linkText("Draggable")).click();
		d.findElement(By.linkText("Droppable")).click();
		d.switchTo().frame(0);
		
		
		
		Actions a=new Actions(d);
		Thread.sleep(2000);
		a.dragAndDrop(d.findElement(By.id("draggable")),d.findElement(By.id("droppable"))).perform();
		Thread.sleep(2000);
		d.switchTo().defaultContent();
		d.findElement(By.linkText("Draggable")).click();
		a.clickAndHold(d.findElement(By.id("draggable"))).release();
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.findElement(By.linkText("Checkboxradio")).click();
		d.switchTo().frame(0);
		d.findElement(By.xpath("//input[@id='radio-2']")).click();
	d.switchTo().defaultContent();
		
		d.findElement(By.linkText("Widget Factory")).click();
		
		
		
		
		
		
		
	}

}
