package com.sgtesting.softassertion;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsDemo {
	public static SoftAssert obj=new SoftAssert();
	@Test
	public void assertEquals()
	{
		try
		{
			String s1="JavaScript";
			String s2=new String("JavaScript");
			obj.assertEquals(s1, s2);
			System.out.println("This line has executed after execution of assertEquals Step");
			obj.assertAll();
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
			obj.assertNotEquals(s1, s2);
			System.out.println("This line has executed after execution of assertNotEquals Step");
			obj.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
