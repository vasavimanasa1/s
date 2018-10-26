package com.selenium.alltopics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class JxlRead extends BaseClass
{
	@Test
	public static void jxlread() throws Exception
	{
		d.get("http://www.naveenautomationlabs.com/");
		d.findElement(By.linkText("YouTube Tutorials")).click();
	d.switchTo().frame(0);
	d.findElement(By.xpath("//div[@class='gvmtko2  g2wtmsz']")).click();
		Thread.sleep(3000);
		Alert a=d.switchTo().alert();
	a.dismiss();
		FileInputStream fis=new FileInputStream("F:\\JavaNew\\Testdata\\naveenexcel.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet s=wb.getSheet(0);
		System.out.println("no of rows are"+s.getRows());
		System.out.println("no of columns are"+s.getColumns());
		for(int i=0;i<=s.getRows();i++)
		{		
			d.findElement(By.xpath("//input[@id='search']")).sendKeys(s.getCell(0, i).getContents());
		}
		
	}
}
