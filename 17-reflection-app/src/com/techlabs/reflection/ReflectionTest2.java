package com.techlabs.reflection;

import java.lang.reflect.Constructor;
public class ReflectionTest2 {

	public static void main(String[] args) {
		try
		{
			Class class1=Class.forName("java.lang.String");
			Constructor cs=class1.getConstructor(class1);
			String s1=(String)cs.newInstance("abcd");
			System.out.println(s1);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
