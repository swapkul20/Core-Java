package com.techlabs.methodreference;

public class ConstructorReferenceTest {

	public static void main(String[] args) {
		Test test=ConstructorReference::new;
		test.display();

	}

}
