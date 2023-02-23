package com.techlabs.lamdas;

public class FunctionTest {

	public static void main(String[] args) {
		Function<Integer> fun=x->x*x;
		System.out.println("Square:"+fun.square(10));

	}

}
