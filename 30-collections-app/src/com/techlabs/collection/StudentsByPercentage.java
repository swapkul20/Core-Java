package com.techlabs.collection;
import java.util.*;
public class StudentsByPercentage implements Comparator<Student> {
	public int compare(Student s1,Student s2)
	{
		if(s1.getPercentage()<s2.getPercentage()) return -1;
		if(s1.getPercentage()>s2.getPercentage()) return 1;
		return 0;
	}

}
