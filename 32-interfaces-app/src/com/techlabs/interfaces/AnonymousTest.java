package com.techlabs.interfaces;

public class AnonymousTest {

	public static void main(String[] args) {
		IPerson p=()->
			{
				System.out.println("Person Say");
			};

    p.say();
	}
	
}
