package com.techlabs.interfaces;

public interface Test {
	default void say()
	{
		System.out.println("Say Default");
	}
	void display();
	static void print()
	{
		System.out.println("Say Print");
	}

}
