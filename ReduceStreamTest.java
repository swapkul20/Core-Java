package com.techlabs.streamapi;
import java.util.*;

public class ReduceStreamTest {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(15,25,55,35,45);
		int sum=list.stream().reduce(0,(x,y)->x+y);
		System.out.println(sum);
		
		List<String> strings=Arrays.asList("AAA","BBB","CCC");
		Optional<String> concat=strings.stream().reduce((x,y)->x+"-"+y);
		System.out.println(concat.get());

	}

}
