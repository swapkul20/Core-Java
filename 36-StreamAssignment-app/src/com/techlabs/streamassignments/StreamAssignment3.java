package com.techlabs.streamassignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAssignment3 {

	public static void main(String[] args) {
		String[] names= {"Jayesh","Nimesh","Mark","Mahesh","Ramesh"};
		List<String> namelist=Arrays.asList(names);
		System.out.println("first 3 students sorted in ascending order:");
		namelist.stream().limit(3).sorted().forEach(name->System.out.println(name));
		System.out.println("first 3 students sorted in ascending order if it contains a:");
		namelist.stream().limit(3)
		.sorted().
		filter(name->name.indexOf('a')!=-1)
		.forEach(name->System.out.println(name));
		System.out.println("students in descnding order:");
		List<String> reverselist=namelist.stream().sorted().collect(Collectors.toList());
		Collections.reverse(reverselist);
		reverselist.forEach(name->System.out.println(name));
		System.out.println("first 3 characters of all names:");
		namelist.stream().map(name->name.substring(0,3))
		.collect(Collectors.toList())
		.forEach(name->System.out.println(name));
		System.out.println("names of the students that contains less than or equal to 4 characters");
		namelist.stream().filter(name->name.length()<=4).forEach(name->System.out.println(name));

	}

}
