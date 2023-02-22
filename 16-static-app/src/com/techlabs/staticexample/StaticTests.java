package com.techlabs.staticexample;

public class StaticTests {
	
	static int a=5;
	static int b;
	
	static void test(int x)
	{
		System.out.println("x="+x);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	static
	{
		System.out.println("Static block first");
		b=a+5;
	}

	public static void main(String[] args) {
		test(15);
		

	}

}
