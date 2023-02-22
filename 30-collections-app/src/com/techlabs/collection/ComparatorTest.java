package com.techlabs.collection;
import java.util.*;
public class ComparatorTest {

	public static void main(String[] args) {
		Student s1=new Student(101,"BBB",85);
		Student s2=new Student(301,"CCC",90);
		Student s3=new Student(201,"AAA",75);
		
		List<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		
		System.out.println("Student List Before Sorting:");
		display(list);
		System.out.println("Student List As Per Roll Numbers:");
		Collections.sort(list, new StudentsByRollNumber());		
		display(list);
		System.out.println("Student List As Per Name:");
		Collections.sort(list, new StudentsByName());		
		display(list);
		System.out.println("Student List As Per Percentage:");
		Collections.sort(list, new StudentsByPercentage());		
		display(list);

	}
	
	static void display(List<Student> list)
	{
		Iterator<Student> i=list.iterator();
		System.out.println("RNO\tName\tPercentage");
		while(i.hasNext())
		{
			Student student=i.next();
			System.out.println(student.getRno()+"\t"+student.getName()+"\t"+student.getPercentage());
			
			
		}
	}

}
