package com.techlabs.lamdas;
import java.util.*;
import java.util.function.Predicate;
public class PredicateDemo2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Mumbai");
	    list.add("Nashik");
	    list.add("Nagpur");
	    
	    Predicate<String> predicate=(x)->x.startsWith("N");
	     
	    for(String string:list)
	    	if(predicate.test(string))
	    		System.out.println(string);
	    
		

	}

}
