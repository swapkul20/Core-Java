package com.techlabs.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentStreamDemo {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(2,"BBB",89));
		list.add(new Student(3,"CCC",65));
		list.add(new Student(1,"AAA",75));
		
		Stream<Student> listStream=list.stream();
		
		List<Student> collect = listStream.filter(n->n.getPercentage()>70).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		

	}

}
