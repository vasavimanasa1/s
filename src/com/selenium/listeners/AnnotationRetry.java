package com.selenium.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

public class AnnotationRetry implements IAnnotationTransformer 
{
	

	@Override
	public void transform(ITestAnnotation annotation, Class testclass, Constructor testconstructor, Method testmethod)
	{
		IRetryAnalyzer analyzer=annotation.getRetryAnalyzer();

				if(analyzer==null)
				{
					annotation.setRetryAnalyzer(CustomRetryAnalyzer.class);
				}
	}
	
	

}
