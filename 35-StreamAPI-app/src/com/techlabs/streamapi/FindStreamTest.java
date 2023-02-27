package com.techlabs.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindStreamTest {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(25,15,45,55,99);
		Optional<Integer> f1=list.stream().findFirst();
		
		Optional<Integer> f2=list.stream().findAny();
		
		if(f1.isPresent() && f2.isPresent())
			System.out.println(f1.get()+f2.get());
		
		System.out.println(list.stream().anyMatch(x->x%5==0));
		System.out.println(list.stream().allMatch(x->x%5==0));
		

	}

}
