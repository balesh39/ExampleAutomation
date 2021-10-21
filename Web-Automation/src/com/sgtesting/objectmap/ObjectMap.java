package com.sgtesting.objectmap;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.regex.Pattern;

import org.openqa.selenium.By;

public class ObjectMap {
	public static Properties prop=null;
	public ObjectMap(String fileName)
	{
		FileInputStream fin=null;
		try
		{
			fin=new FileInputStream(fileName);
			prop=new Properties();
			prop.load(fin);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public By getLocator(String logicalname)
	{
		By by=null;
		try
		{
			Pattern pattern=Pattern.compile("[|]");
			String locator[]=pattern.split(prop.getProperty(logicalname));
		
			String locatorName=locator[0];
			String locatorValue=locator[1];
			if(locatorName.equalsIgnoreCase("id"))
			{
				by=By.id(locatorValue);
			}
			else if(locatorName.equalsIgnoreCase("name"))
			{
				by=By.name(locatorValue);
			}
			else if(locatorName.equalsIgnoreCase("xpath"))
			{
				by=By.xpath(locatorValue);
			}
			else if(locatorName.equalsIgnoreCase("linktext"))
			{
				by=By.linkText(locatorValue);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return by;
	}

}
