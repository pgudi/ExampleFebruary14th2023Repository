package com.sgtesting.actitime.stedefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksDemo {
	
	@Before
	public void connectDatabase()
	{
		System.out.println("System has connected the Oracle Express Edition Databse Succesfully.");
	}

	@After
	public void disConnectDatabase()
	{
		System.out.println("System has disconnected the Oracle Database successfully");
	}
}
