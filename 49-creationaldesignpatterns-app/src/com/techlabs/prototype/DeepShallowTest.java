package com.techlabs.prototype;

public class DeepShallowTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student(10);
		Student s2=(Student)s1.clone();
		if(s1==s2)
			System.out.println("Shallow");
		if(s1.equals(s2))
			System.out.println("Shallow");
        System.out.println(s1);
        System.out.println(s2);
        s2.setRno(20);
        System.out.println(s1);
        System.out.println(s2);
	}

}
