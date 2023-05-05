package com.sgtesting.testngtestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginLogout {
	
	private static WebDriver oBrowser=null;
	
	@Test(priority = 1)
	private void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 2,dataProvider = "url")
	private void navigate(String url)
	{
		String expected,actual;
		try
		{
			expected="actiTIME - Login";
			oBrowser.get(url);
			Thread.sleep(5000);
			actual=oBrowser.getTitle();
			Assert.assertEquals(actual, expected);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 3,dataProvider = "login")
	private void login(String user,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 4)
	private void minimizeFlyoutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='Best Way to Get Started']"));
			Assert.assertFalse(oEle.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 5)
	private void logout()
	{
		String expected,actual;
		try
		{
			expected="actiTIME - Login";
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			actual=oBrowser.getTitle();
			Assert.assertEquals(actual, expected);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 6)
	private void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@DataProvider(name = "login")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}
	
	@DataProvider(name = "url")
	public Object[][] getURL()
	{
		return new Object[][] {{"http://localhost/login.do"}};
	}
}
