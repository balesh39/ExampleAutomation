package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CustomerProject{
	public static WebDriver oBrowser=null;
	static void launch() {
		try {
			System.setProperty("webdriver.chrome.driver","D:\\temp\\Web-Automation\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void navigate() {
		try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	static void login() {
		try {
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void minimizeWindow() {
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	static void createCustomer(){
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Amreen Ayesha");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Name:Amreen Ayesha","\nPlace:Bangalore","\nDesignation:Test Engineer");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(2000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void createProject(){
		try {
			
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Web Automation");
			Thread.sleep(2000);	
			oBrowser.findElement(By.name("projectDescriptionField")).sendKeys("Launch browser","\navigate","\ncreate user","\n logout");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksHeaderBlock\']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).sendKeys("Login");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")).sendKeys("create User");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_createTasksTableContainer\']/table/tbody/tr[3]/td[1]/input")).sendKeys("Logout");
			Thread.sleep(2000);
			
			
			oBrowser.findElement(By.id("projectPopup_commitBtn")).click();
			Thread.sleep(2000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void deleteProject(){
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'projectPanel_deleteConfirm_submitBtn\']/div")).click();
			Thread.sleep(2000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void deleteCustomer(){
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")).click();
			Thread.sleep(2000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	static void logout() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void closeWindow(){
		try {
			oBrowser.close();
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class CreateCustomerProject {

	public static void main(String[] args) {
		CustomerProject.launch();
		CustomerProject.navigate();
		CustomerProject.login();
		CustomerProject.minimizeWindow();
		CustomerProject.createCustomer();
		CustomerProject.createProject();
		CustomerProject.deleteProject();
		CustomerProject.deleteCustomer();
		CustomerProject.logout();
		CustomerProject.closeWindow();

	}

}



