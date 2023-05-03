package com.sgtesting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSameDemo {
	public static SoftAssert obj=new SoftAssert();
	@Test
	public void assertSame()
	{
		try
		{
			String s1="JavaScript";
			String s2=new String("JavaScript");
			obj.assertSame(s1, s2);
			System.out.println("This line has executed after execution of assertSame Step");
			obj.assertAll();
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
			obj.assertNotSame(s1, s2);
			System.out.println("This line has executed after execution of assertNotSame Step");
			obj.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
