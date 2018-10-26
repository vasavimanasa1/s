package com.selenium.alltopics;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;




public class ReadExcelData extends BaseClass
{
@Test
public static void Import() throws IOException, Exception
{
	d.get("http://jqueryui.com/autocomplete/");
	Thread.sleep(2000);
	System.out.println("Title is "+d.getTitle());
	List<WebElement> e=d.findElements(By.tagName("iframe"));
	System.out.println("Number of frames are"+e.size());
		
	
	FileInputStream fis=new FileInputStream("F:\\JavaNew\\Testdata\\Jquery.xls");
	Workbook wb=Workbook.getWorkbook(fis);
	Sheet s=wb.getSheet(0);
	System.out.println("Number of rows are"+s.getRows());
	d.switchTo().frame(0);
	for(int i=0;i<s.getRows();i++)
	{
		//d.findElement(By.id("tags")).sendKeys(s.getCell(0, i).getContents());
		
	Thread.sleep(2000);
	
		for(int j=1;j<s.getColumns();j++)
{
			Thread.sleep(2000);
		d.findElement(By.id("tags")).clear();
		d.findElement(By.id("tags")).sendKeys(s.getCell(j, i).getContents());
}

	}
		
	
	
	}
}
