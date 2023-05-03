package com.sgtesting.hardassertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsDemo {
	
	@Test(enabled = false)
	public void assertEquals()
	{
		try
		{
			String s1="JavaScript";
			String s2=new String("JavaScript");
			Assert.assertEquals(s1, s2);
			System.out.println("This line has executed after execution of assertEquals Step");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test
	public void assertNotEquals()
	{
		try
		{
			String s1="JavaScript";
			String s2=new String("JavaScriptNew");
			Assert.assertNotEquals(s1, s2);
			System.out.println("This line has executed after execution of assertNotEquals Step");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
