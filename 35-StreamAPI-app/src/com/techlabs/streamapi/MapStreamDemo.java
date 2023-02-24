package com.techlabs.streamapi;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStreamDemo {

	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		list.add("AAA");
		list.add("ccc");
		list.add("BBb");
		
		Stream<String> stream=list.stream().map(x->x.toLowerCase());
		List<String> lowerList=stream.collect(Collectors.toList());
		System.out.println(lowerList);
	}

}
