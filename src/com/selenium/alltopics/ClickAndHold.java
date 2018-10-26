package com.selenium.alltopics;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ClickAndHold extends BaseClass
{
  @Test
  public void clickandHold() throws Exception 
  {
	  d.get("http://jqueryui.com/slider/");
	  Actions a=new Actions(d);
	  Thread.sleep(2000);
	  d.switchTo().frame(0);
	  a.dragAndDropBy(d.findElement(By.xpath("//div[@id='slider']")),400,0).build().perform();
	  Thread.sleep(2000);
	 
  }
}
