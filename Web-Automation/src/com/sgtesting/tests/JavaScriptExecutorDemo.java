package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	getTitle();
	//	getApplicationURL();
	//	displayLinksCount();
	//	enterTextInTextField();
	//	enterTextInTextField2();
	//	clickOnButtonField1();
	//	clickOnButtonField2();
	//	clickOnCheckBoxField1();
	//	clickOnCheckBoxField2();
		clickOnRadioButtonField1();
		clickOnRadioButtonField2();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("file:///D:/HTML/Sample.html");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void getTitle()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String title=(String) js.executeScript("var kk=document.title;return kk;");
		System.out.println("Title :"+title);
	}

	private static void getApplicationURL()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String url=(String) js.executeScript("var kk=document.URL;return kk;");
		System.out.println("URL :"+url);
	}
	
	private static void displayLinksCount()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		long linkcount=(long) js.executeScript("var kk=document.getElementsByTagName('A');return kk.length;");
		System.out.println("# of Links :"+linkcount);
	}
	
	private static void enterTextInTextField()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('uid1user1name1').value='DemoUser1';");
	}
	
	private static void enterTextInTextField2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("pwd1pass1word1"));
		js.executeScript("arguments[0].value='DemoUser2'",oEle);
	}
	
	private static void clickOnButtonField1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('btn1submit1button1').click();");
	}
	
	private static void clickOnButtonField2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("btn1submit1button1"));
		js.executeScript("arguments[0].click();",oEle);
	}
	
	private static void clickOnCheckBoxField1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('chk1windows').click();");
	}
	
	private static void clickOnCheckBoxField2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("chk2linux"));
		js.executeScript("arguments[0].click();",oEle);
	}
	
	private static void clickOnRadioButtonField1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('rad1chrome').click();");
	}
	
	private static void clickOnRadioButtonField2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.id("rad2firefox"));
		js.executeScript("arguments[0].click();",oEle);
	}
}
