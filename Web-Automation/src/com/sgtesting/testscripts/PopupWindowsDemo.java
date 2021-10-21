package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindowsDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		popupsDemo();
	}
	
	static void launchBrowser()
	{
		try
		{	
			System.setProperty("webdriver.chrome.driver", "D:\\temp\\Web-Automation\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void popupsDemo()
	{
		try
		{
			System.out.println("Before click on Link, # of Popups "+getPopupCount());
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
			Thread.sleep(2000);
			System.out.println("After click on Link, # of Popups "+getPopupCount());
			if(getPopupCount()>0)
			{
				handleThePopUps();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static int getPopupCount()
	{
		int count=0;
		try
		{
			count=oBrowser.getWindowHandles().size()-1;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}
	
	static void handleThePopUps()
	{
		String parentBrowserName;
		Object[] popups=null;
		try
		{
			parentBrowserName=oBrowser.getWindowHandle();
			System.out.println("Parent Browser :"+parentBrowserName);
			popups=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<popups.length;i++)
			{
				String childwindow=popups[i].toString();
				System.out.println("Child Window :"+childwindow);
				Thread.sleep(2000);
				oBrowser.switchTo().window(childwindow);
				Thread.sleep(2000);
				oBrowser.findElement(By.linkText("Start Using actiTIME")).click();
				Thread.sleep(2000);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}