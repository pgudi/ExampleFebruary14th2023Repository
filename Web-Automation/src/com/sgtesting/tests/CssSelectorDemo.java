package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absolutePath();
	//	relativeCSSWithTagName();
	//	relativeCSSWithTagNameAndIDAttribute();
	//	relativeCSSWithIDAttributeValueAlone();
	//	relativeCSSWithTagNameAndClassAttribute();
	//	relativeCSSWithClassAttribute();
	//	relativeCSSWithTagNameAndAttributeNameValueCombination();
	//	relativeCSSWithTagNameAndMultipleAttributeNameValueCombination();
	//	relativeCSSWithPartialMatchingOfAttributeValue();
	//	relativeCSSWithTagNameAndAttributeNameCombination();
	//	relativeCSSWithTagNameAndAttributeNameCombination_01();
	//	relativeCSSWithTagNameAndAttributeNameCombination_02();
	//	relativeCSSWithTagNameAndAttributeNameCombination_03();
	//	relativeCSSWithParentElementReference();
	//	relativeCSSWithnthChild();
		relativeCSSWithSiblings();
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

	private static void absolutePath()
	{
		oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
	}
	
	/**
	 * case 1: identify the Element using tagName
	 * synax: <input>
	 */
	private static void relativeCSSWithTagName()
	{
		oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser2");
	}
	
	/**
	 * case 2: identify the Element using tagName with id attribute value
	 */
	private static void relativeCSSWithTagNameAndIDAttribute()
	{
		oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoUser3");
	}
	
	/**
	 * case 3: identify the Element using id attribute value alone
	 */
	private static void relativeCSSWithIDAttributeValueAlone()
	{
		oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("DemoUser3");
	}
	
	/**
	 * case 4: identify the Element using tagName with class attribute value
	 */
	private static void relativeCSSWithTagNameAndClassAttribute()
	{
		oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("DemoUser4");
	}
	
	/**
	 * case 5: identify the Element using class attribute value alone
	 */
	private static void relativeCSSWithClassAttribute()
	{
		oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("DemoUser4");
	}
	
	/**
	 * case 6: tagName with attribute name and value combination
	 * Syntax: <tagName>[attributeName='attributeValue']
	 */
	public static void relativeCSSWithTagNameAndAttributeNameValueCombination()
	{
		oBrowser.findElement(By.cssSelector("input[name='submit1btn1']")).click();
	}
	
	/**
	 * case 7: tagName with Multiple attribute name and value combination
	 * Syntax: <tagName>[attributeName='attributeValue'][attributeName='attributeValue']
	 */
	public static void relativeCSSWithTagNameAndMultipleAttributeNameValueCombination()
	{
		oBrowser.findElement(By.cssSelector("input[name='submit1btn1'][type='button']")).click();
	}
	
	/**
	 * case 8: tagName and attribute with partial matching of attribute value
	 * Syntax: 
	 *  <tagName>[attributeName ^= 'attributeValue']   --> starts-with
	 *  <tagName>[attributeName $= 'attributeValue']   --> ends-with
	 *  <tagName>[attributeName *= 'attributeValue']   --> contains
	 */
	public static void relativeCSSWithPartialMatchingOfAttributeValue()
	{
	//	oBrowser.findElement(By.cssSelector("input[name ^= 'submit']")).click();
	//	oBrowser.findElement(By.cssSelector("input[name $= 'btn1']")).click();
		oBrowser.findElement(By.cssSelector("input[name *= 'mit1']")).click();
	}
	
	/**
	 * case 9: tagName with attribute name combination
	 * Syntax: <tagName>[attributeName]
	 */
	public static void relativeCSSWithTagNameAndAttributeNameCombination()
	{
		//Display the Links count
		List<WebElement> links=oBrowser.findElements(By.cssSelector("a[href]"));
		System.out.println("# of Links are :"+links.size());
	}
	
	
	public static void relativeCSSWithTagNameAndAttributeNameCombination_01()
	{
		//Display the Link names
		List<WebElement> links=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<links.size();i++)
		{
			WebElement link=links.get(i);
			String name=link.getText();
			System.out.println(name);
		}
	}
	
	public static void relativeCSSWithTagNameAndAttributeNameCombination_02()
	{
		//Click on a particular Link that is starts with S G
		try
		{
			List<WebElement> links=oBrowser.findElements(By.cssSelector("a[href]"));
			for(int i=0;i<links.size();i++)
			{
				WebElement link=links.get(i);
				String name=link.getText();
				if(name.startsWith("S G"))
				{
					link.click();
					break;
				}
			}
			Thread.sleep(3000);
			oBrowser.navigate().back();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void relativeCSSWithTagNameAndAttributeNameCombination_03()
	{
		// org.openqa.selenium.StaleElementReferenceException: stale element reference: 
		// element is not attached to the page document
		List<WebElement> links=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<links.size();i++)
		{
			WebElement link=links.get(i);
			String name=link.getText();
			System.out.println(name);
			link.click();
		}
	}
	
	/**
	 * case 10: parent Element REference
	 * Syntax: <parentElement> > <childElement
	 */
	public static void relativeCSSWithParentElementReference()
	{
		oBrowser.findElement(By.cssSelector("form#frm2 > input")).click();
	}
	
	/**
	 * case 11: nth-child(number)
	 * Syntax: <parentElement> > <childElement
	 */
	public static void relativeCSSWithnthChild()
	{
	//	oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(5)")).sendKeys("DemoUser5");
		oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(1)")).sendKeys("DemoUser1");
	}
	
	/**
	 * case 12: siblings
	 * Syntax: <parentElement> + <firstElement> <secondElement>
	 */
	public static void relativeCSSWithSiblings()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 > input + input + input + input")).sendKeys("DemoUser4");
	}
}
