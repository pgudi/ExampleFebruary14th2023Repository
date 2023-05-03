package com.sgtesting.hardassertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSameDemo {
	
	@Test
	public void assertSame()
	{
		try
		{
			String s1="JavaScript";
			String s2=new String("JavaScript");
			Assert.assertSame(s1, s2);
			System.out.println("This line has executed after execution of assertSame Step");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void assertNotSame()
	{
		try
		{
			String s1="JavaScript";
			String s2=new String("JavaScriptNew");
			Assert.assertNotSame(s1, s2);
			System.out.println("This line has executed after execution of assertNotSame Step");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
