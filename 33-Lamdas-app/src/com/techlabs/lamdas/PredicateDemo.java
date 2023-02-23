package com.techlabs.lamdas;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		
		Predicate<Integer> predicate=(x) -> x%2==0;
		
		if(predicate.test(a))
		   System.out.println("Even");
		else
			System.out.println("Odd");
			
		

	}

}
