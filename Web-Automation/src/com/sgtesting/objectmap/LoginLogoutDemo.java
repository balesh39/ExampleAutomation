package com.sgtesting.objectmap;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
	public static WebDriver oBrowser=null;
	public static String strPath=System.getProperty("user.dir");
	public static ObjectMap obj=new ObjectMap(strPath+"\\ObjectMap\\objectmap.properties");
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		logout();
		closeApplication();
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\temp\\Web-Automation\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void login()
	{
		try
		{
			oBrowser.findElement(obj.getLocator("loginusername")).sendKeys("admin");
			oBrowser.findElement(obj.getLocator("loginpassword")).sendKeys("manager");
			oBrowser.findElement(obj.getLocator("loginbutton")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(obj.getLocator("flyoutwindow")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			oBrowser.findElement(obj.getLocator("logoutlink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
