package com.techlabs.streamapi;
import java.util.*;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,2,3,8,7);
		Stream<Integer> listStream=list.stream();
		listStream.forEach(x->System.out.println(x));

	}

}
