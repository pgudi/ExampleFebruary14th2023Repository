package com.sgtesting.hardassertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertConditionDemo {
	
	@Test
	public void assertTrueDemo()
	{
		try
		{
			int v1=25;
			int v2=50;
			Assert.assertTrue(v2>=v1);
			System.out.println("This line has executed after execution of assertTrue Step");
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
			Assert.assertFalse(v2<=v1);
			System.out.println("This line has executed after execution of assertFalse Step");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
