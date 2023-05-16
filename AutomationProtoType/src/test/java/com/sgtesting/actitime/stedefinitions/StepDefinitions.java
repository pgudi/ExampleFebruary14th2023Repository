package com.sgtesting.actitime.stedefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	private static WebDriver oBrowser=null;
	/**
	 * Author:
	 * Step Name: I launch the Chrome Browser
	 */
	@Given(value = "^I launch the Chrome Browser$")
	public void I_launch_the_Chrome_Browser()
	{
		try
		{
			oBrowser=new ChromeDriver();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Step Name: I navigate the application url
	 */
	@And(value = "^I navigate the application url$")
	public void I_navigate_the_application_url()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Step Name: I enter username in username text field
	 */
	@When("^I enter username in username text field$")
	public void i_enter_username_in_username_text_field()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Step Name: I enter password in password text field
	 */
	@And("^I enter password in password text field$")
	public void i_enter_password_in_password_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Step Name: I click on login button
	 */
	@And("^I click on login button$")
	public void I_click_on_login_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Step Name: I find the Home Page
	 */
	@Then("^I find the Home Page$")
	public void I_find_the_Home_Page()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Step Name: I minimize the flyout window
	 */
	@And("^I minimize the flyout window$")
	public void I_minimize_the_flyout_window()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Step Name: I click on Logout link
	 */
	@When("^I click on Logout link$")
	public void I_click_on_Logout_link()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Step Name: I find the login page
	 */
	@Then("^I find the login page$")
	public void I_find_the_login_page()
	{
		try
		{
			String expected,actual;
			expected="actiTIME - Login";
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Step Name: I close the Application
	 */
	@And("^I close the Application$")
	public void I_close_the_Application()
	{
		try
		{
			oBrowser.quit();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
