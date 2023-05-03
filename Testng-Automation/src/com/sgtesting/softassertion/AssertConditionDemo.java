package com.sgtesting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertConditionDemo {
	public static SoftAssert obj=new SoftAssert();
	@Test
	public void assertTrueDemo()
	{
		try
		{
			int v1=25;
			int v2=50;
			obj.assertTrue(v2>=v1);
			System.out.println("This line has executed after execution of assertTrue Step");
			obj.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test
	public void assertFalseDemo()
	{
		try
		{
			int v1=25;
			int v2=50;
			obj.assertFalse(v2<=v1);
			System.out.println("This line has executed after execution of assertFalse Step");
			obj.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
