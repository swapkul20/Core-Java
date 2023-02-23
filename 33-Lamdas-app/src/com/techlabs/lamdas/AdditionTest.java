package com.techlabs.lamdas;

public class AdditionTest {

	public static void main(String[] args) {
		IAddition addObj = (x, y) -> x + y;
		System.out.println(addObj.addition(10, 20));

	}

}
