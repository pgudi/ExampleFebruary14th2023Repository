package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		mouseMovementDemo();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void mouseMovementDemo()
	{
		try
		{
			oBrowser.findElement(By.xpath("//button[text()='✕']")).click();
			Thread.sleep(4000);
			Actions oMouse=new Actions(oBrowser);
			WebElement oFashion=oBrowser.findElement(By.xpath("//img[@alt='Fashion']"));
			oMouse.click(oFashion).build().perform();
			Thread.sleep(2000);
			WebElement oMen=oBrowser.findElement(By.xpath("//span[text()='Men']"));
			oMouse.moveToElement(oMen).build().perform();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Formal Shirts")).click();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
