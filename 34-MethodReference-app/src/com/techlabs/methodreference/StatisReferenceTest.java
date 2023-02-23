package com.techlabs.methodreference;

public class StatisReferenceTest {
	
	static void print()
	{
		System.out.println("Reference to static method");
	}

	public static void main(String[] args) {
		Test test=StatisReferenceTest::print;
		test.display();

	}

}
