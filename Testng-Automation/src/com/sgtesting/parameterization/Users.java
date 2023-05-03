package com.sgtesting.parameterization;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Users {
	
	@Parameters(value="username")
	@Test
	public void createUser(String username)
	{
		System.out.println("The User "+username+" has created successfully");
	}

	@Parameters(value="username")
	@Test
	public void modifyUser(String username)
	{
		System.out.println("The User "+username+" has modified successfully");
	}
	
	@Parameters(value="username")
	@Test
	public void deleteUser(String username)
	{
		System.out.println("The User "+username+" has deleted successfully");
	}
	
	@BeforeClass
	public void setup()
	{
		System.out.println("Launch Browser, Navigate URL and Login into the Application");
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("Logout from the Application and Close the Application");
		System.out.println("+++++++++++++++++++++++++++");
	}
}
