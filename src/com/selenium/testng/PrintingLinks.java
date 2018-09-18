package com.selenium.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintingLinks {

	WebDriver d;
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Drivers\\geckodriver.exe");
		WebDriver	d=new FirefoxDriver();
		d.get("https://www.seleniumhq.org/");
		List<WebElement> s=d.findElements(By.tagName("a"));
		System.out.println("number of links are"+s.size());
		for(WebElement p:s)
		{
			System.out.println(p.getText());
		}
	}

}
