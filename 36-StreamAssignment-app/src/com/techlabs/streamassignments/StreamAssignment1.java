package com.techlabs.streamassignments;

import java.util.Arrays;

public class StreamAssignment1  {

	public static void main(String[] args) {
		String[] names= {"Jayesh","Nimesh","Mahesh","Ramesh"};
		System.out.println("Using String.forEach():");
		Arrays.stream(names).forEach(string->System.out.println(string));
		
		System.out.println("Using Arrays.asList():");
		Arrays.asList(names).stream().forEach(string->System.out.println(string));
		
		System.out.println("Using Static method reference:");
        IStramTest itest=StreamAssignment1::display;
        itest.print(names);    
           
	}
	public static void display(String names[])
	{
	     for(String string : names)
	     {
	    	 System.out.println(string);
	    	 
	     }
	}

}
