package com.techlabs.lamdas;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		Function<Integer,Integer> fun=x->x*x;
		System.out.println("Square:"+fun.apply(10));

	}

}
