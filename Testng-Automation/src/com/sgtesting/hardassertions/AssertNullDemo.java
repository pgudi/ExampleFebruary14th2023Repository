package com.sgtesting.hardassertions;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullDemo {
	
	@Test
	public void assertNull()
	{
		try
		{
			File f1=null;
			Assert.assertNull(f1);
			System.out.println("This line has executed after execution of assertNull Step");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test
	public void assertNotNull()
	{
		try
		{
			File f1=null;
			f1=new File("E:\\EXAMPLE");
			Assert.assertNotNull(f1);
			System.out.println("This line has executed after execution of assertNotNull Step");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
