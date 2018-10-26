package com.selenium.alltopics;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultiDropdown extends BaseClass
{
	
@Test
public static void mm() throws Exception
{
	
	d.get("file:///C:/Users/Gowthami/Desktop/mm.html");
	Select s=new Select(d.findElement(By.id("a")));
	for(int i=0;i<4;i++)
	{
		s.selectByIndex(i);
	}
	Thread.sleep(2000);
	s.deselectByIndex(1);
	boolean b=s.isMultiple();
	System.out.println(b);
	Thread.sleep(2000);
	s.deselectAll();
	
	
}
}
