package com.sgtesting.softassertion;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertNullDemo {
	public static SoftAssert obj=new SoftAssert();
	@Test
	public void assertNull()
	{
		try
		{
			File f1=null;
			obj.assertNull(f1);
			System.out.println("This line has executed after execution of assertNull Step");
			obj.assertAll();
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
			obj.assertNotNull(f1);
			System.out.println("This line has executed after execution of assertNotNull Step");
			obj.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
