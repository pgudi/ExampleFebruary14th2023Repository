package com.sgtesting.parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider = "credentials")
	public void login(String username,String password)
	{
		System.out.println(username+"  --> "+password);
	}
	
	@DataProvider(name = "credentials")
	public Object[][] getCredentials()
	{
		return new Object[][] {{"user1","Welcome1"},
			{"user2","Welcome2"},
			{"user3","Welcome3"}};
	}

}
