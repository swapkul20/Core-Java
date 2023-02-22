package com.techlabs.staticexample;

public class StaticDemo {
	static int a;
	int b=10;
	static void printA()
	{
		System.out.println("a="+a);
		
	}
	void printB()
	{
		System.out.println("b="+b);
	}
	void increment()
	{
		a++;
		b++;
	}

}
