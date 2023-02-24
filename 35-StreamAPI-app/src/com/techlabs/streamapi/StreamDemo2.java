package com.techlabs.streamapi;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,2,3,8,7);
		//Stream<Integer> listStream=list.stream();
		//list.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
		
		 List<Integer> collect = list.stream()
				.filter(x->x%2==0)
					.collect(Collectors.toList());
			System.out.println(collect);

	}

}
