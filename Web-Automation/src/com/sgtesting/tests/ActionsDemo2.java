package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo2 {

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
			oBrowser.get("https://www.bigbasket.com/");
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
			Actions oMouse=new Actions(oBrowser);
			WebElement oShop=oBrowser.findElement(By.xpath("//div[@id='navbar']/ul/li/a"));
			oMouse.moveToElement(oShop).build().perform();
			Thread.sleep(2000);
			WebElement oBakery=oBrowser.findElement(By.linkText("Bakery, Cakes & Dairy"));
			oMouse.moveToElement(oBakery).build().perform();
			Thread.sleep(2000);
			WebElement oBread=oBrowser.findElement(By.linkText("Breads & Buns"));
			oMouse.moveToElement(oBread).build().perform();
			Thread.sleep(2000);
			WebElement oWheat=oBrowser.findElement(By.linkText("Brown, Wheat & Multigrain"));
			oMouse.click(oWheat).build().perform();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
