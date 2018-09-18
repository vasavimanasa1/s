package com.selenium.xpaths;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathsinWebDriver {
 WebDriver d;
 
	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Drivers\\geckodriver.exe");
		WebDriver	d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		/*d.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&campaign=DF-Brand-EM&gclid=EAIaIQobChMI3PPqlJSP3QIV042PCh0QIQQaEAAYASAAEgKV4vD_BwE");
		
		d.findElement(By.xpath("//a[@href='/hotels/']/span[1]")).click();
		d.findElement(By.id("gosuggest_inputL")).sendKeys("Hyderabad");
		d.findElement(By.className("form-control inputTxtLarge widgetCalenderTxt")).click();;
*/
		d.get("https://www.google.com/");
		d.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("sele");
		System.out.println("*****************");
		
		List<WebElement> li=d.findElements(By.xpath("//ul[@class='sbsb_b']/li"));
		String str[]=new String[li.size()];
		System.out.println("The suggessions are....");
		int i=0;
		for(WebElement s:li)
		{
			System.out.println(s.getText());
			str[i]=s.getText();
			i++;
					
		}
		for(String t:str) 
		{
			d.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(Keys.ARROW_DOWN);
			if(t.equals("selenium"))
			{
				d.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(2000);
		}
		
				
	}

}
