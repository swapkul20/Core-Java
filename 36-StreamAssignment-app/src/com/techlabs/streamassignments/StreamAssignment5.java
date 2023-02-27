package com.techlabs.streamassignments;

import java.util.Arrays;
import java.util.List;

public class StreamAssignment5 {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,20,30,40,50,25,35,45);
		System.out.println("Minimum of list:");
		System.out.println(numbers.stream().min((number1,number2)->number1-number2).get());
		System.out.println("Maximum of list:");
		System.out.println(numbers.stream().max((number1,number2)->number1-number2).get());
	}

}
