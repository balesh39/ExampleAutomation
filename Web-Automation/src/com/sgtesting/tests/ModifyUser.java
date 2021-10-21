package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUser {
	public static WebDriver oBrowser = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		CreateUser();
		modifyUser();
//		deleteUser();
//		logout();
//		closeApplication();
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
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
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
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void CreateUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("user1");
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demouser1");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).clear();
			oBrowser.findElement(By.name("firstName")).sendKeys("sg");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).clear();
			oBrowser.findElement(By.name("lastName")).sendKeys("test1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).clear();
			oBrowser.findElement(By.name("email")).sendKeys("sg@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).clear();
			oBrowser.findElement(By.name("username")).sendKeys("sgtest1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).clear();
			oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
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
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
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
}

