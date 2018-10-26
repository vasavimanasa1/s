package com.selenium.testng;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtility
{
	public static void captureScreenShot(WebDriver driver,String screenshotname) 
	{
		try
	{
		DateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date dt=new Date();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("./ScreenShot/"+screenshotname+dateformat.format(dt)+ ".png"));
		FileUtils.copyFile(src, new File("E:\\newScreenshorts\\s"+screenshotname+dateformat.format(dt)+".png"));
		System.out.println("Screenshot taken");
	}
		catch(IOException e)
		{
			System.out.println("Exception "+e.getMessage());
		}
	}
}
