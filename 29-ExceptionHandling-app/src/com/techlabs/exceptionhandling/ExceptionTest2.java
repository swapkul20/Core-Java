package com.techlabs.exceptionhandling;

public class ExceptionTest2 {

	public static void main(String[] args) {
		try
		{
			System.out.println("Inside main");
			m1();
			
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		System.out.println("Exiting main");
	}
	static void m1()
	{
		System.out.println("Inside m1");
		m2();
		System.out.println("Exiting m1");
	}
	static void m2()
	{
		System.out.println("Inside m2");
		m3();
		System.out.println("Exiting m2");
	}
	static void m3()
	{
		
		System.out.println("Inside m3");
		
		throw new RuntimeException();
		//System.out.println("Exiting m3");
	}
	

}
