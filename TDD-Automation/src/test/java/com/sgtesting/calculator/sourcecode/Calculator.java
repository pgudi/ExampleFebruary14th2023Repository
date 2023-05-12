package com.sgtesting.calculator.sourcecode;

public class Calculator {
	
	/**
	 * Addition Functionality
	 */
	public int addition(int number1,int number2)
	{
		int result=0;
		try
		{
			result=(number1+number2);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Addition Functionality
	 */
	public int addition(int numbers[])
	{
		int result=0;
		try
		{
			for(int i=0;i<numbers.length;i++)
			{
				result=result+numbers[i];
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Subtraction Functionality
	 */
	public int Subtraction(int number1,int number2)
	{
		int result=0;
		try
		{
			result=(number1-number2);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Division Functionality
	 */
	public int division(int number1,int number2)
	{
		int result=0;
		try
		{
			result=(number1/number2);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Multiplication Functionality
	 */
	public int multiplication(int number1,int number2)
	{
		int result=0;
		try
		{
			result=(number1*number2);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Multiplication Functionality
	 */
	public int multiplication(int numbers[])
	{
		int result=1;
		try
		{
			for(int i=0;i<numbers.length;i++)
			{
				result=result*numbers[i];
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
}
