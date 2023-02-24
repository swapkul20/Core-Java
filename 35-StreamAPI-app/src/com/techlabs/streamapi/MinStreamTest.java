package com.techlabs.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.*;


public class MinStreamTest {

	public static void main(String[] args) {
		List<Student> students=Arrays.asList(new Student(1,"a",90), new Student(2,"b",75), new Student(3,"c",85));
        Comparator<Student> comparator=new Comparator<Student>() {
        	public int compare(Student s1,Student s2)
        	{
        		if(s1.getPercentage()>s2.getPercentage())
        			return 1;
        		if(s1.getPercentage()<s2.getPercentage())
        			return -1;
        		return 0;
        	}	
        	
        };
        System.out.println("Student having Lowest Percentage:");
        Optional<Student> highest=students.stream().min(comparator);
        System.out.println(highest.get());
        
        System.out.println("Student having Lowest Roll Number:");
        
        System.out.println(students.stream().min((s1,s2)->s1.getRno()-s2.getRno()).get());
        
        System.out.println("Student having Lowest Percentage:");        
        System.out.println(students.stream().min((s1,s2)->(int)Math.ceil(s1.getPercentage()-s2.getPercentage())).get());
        
        
	}

}
