package com.techlabs.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStreamTest {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(15,10,35,25,45);
		
		list.stream().sorted().forEach(x->System.out.println(x));
		List<Integer> sorted=list.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);

	}

}
