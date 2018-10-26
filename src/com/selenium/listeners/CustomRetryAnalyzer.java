package com.selenium.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CustomRetryAnalyzer  implements IRetryAnalyzer
{
	int retrycount=0;
	int maxretrycount=2;

	@Override
	public boolean retry(ITestResult result)
	{ 
		if(ITestResult.FAILURE==result.getStatus()&&retrycount<=maxretrycount)
		{
			try
		{
				Thread.sleep(1000);
				System.out.println("COUNT IS::"+retrycount+"EXECUTING THE QUERY"+result.getName());
				retrycount++;
				return true;
		}
			
		catch (Exception e)
		{
			e.printStackTrace();
		}	
		
		}	
		return false;
		
	}
}

