package com.crm.Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.ui.Select;
import com.crm.BaseTest.BaseClass;

public class TestUtil extends BaseClass{
	public static long pageload_timeout=30;
	public static long implicit_wait=10;
	
	
	public static void scrollIntoView(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
		
	}
	
	
	
	public static void click(WebElement element) {
		element.click();
		
	}
	
	
	
	public static void selectByVisibleText(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}

	
	
	public static void sendkeys(WebElement element,String text) {
		element.sendKeys(text);
		
	}
	
	
	
	public static void selectByIndex(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
		
	}
	
	public static  void failed(String testMethodName) {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

			File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(srcfile,new File("E:\\PracticePro\\Screenshots\\"+testMethodName+dateName+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
	
	
	
}
