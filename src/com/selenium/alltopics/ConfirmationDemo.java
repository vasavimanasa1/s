package com.selenium.alltopics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ConfirmationDemo extends BaseClass
{

	@Test
	public static void Confirm() throws InterruptedException
	{
		d.get("http://output.jsbin.com/enifaf");
		d.findElement(By.xpath("//button[text()=\"Click to launch the Confirm box\"]")).click();
		Thread.sleep(2000);
		Alert a=d.switchTo().alert();
		System.out.println(a.getText());
		//a.accept();
		a.dismiss();
		
	}
}
