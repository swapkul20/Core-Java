package com.techlabs.interfaces;

public class AnonymousTest {

	public static void main(String[] args) {
		Person p=new Person() {
			void say()
			{
				System.out.println("Person Say");
			}
		};
    p.say();
	}
	
}
