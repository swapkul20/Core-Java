package com.techlabs.reflection;
import java.lang.reflect.*;

public class RefletionTest1 {

	public static void main(String[] args) {
		try
		{
		Class class1=Class.forName("java.lang.String");
		
		System.out.println("Name of class:"+class1.getName());
		System.out.println("Interface:"+class1.isInterface());
		System.out.println("Array:"+class1.isArray());
		System.out.println("Enum:"+class1.isEnum());
		System.out.println("Primitive:"+class1.isPrimitive());
		System.out.println("Super Class:"+class1.getSuperclass());
		
		System.out.println("Conctructors of "+class1.getName()+":");
		Constructor constructors[]=class1.getConstructors();
		for(int i=0;i<constructors.length;i++)
			System.out.println(constructors[i].getName()+"\t"+constructors[i].toString());
		
		
		
		System.out.println("Fields of class "+class1.getName()+":");
		System.out.println("Field Name\t\tValue");
		Field fields[]=class1.getFields();
		for(int i=0;i<fields.length;i++)
		{
			System.out.println(fields[i].getName()+"\t\t"+fields[i].get(class1));
		}
		
		System.out.println("Methods of class "+class1.getName()+":");
		Method methods[]=class1.getMethods();
		for(int i=0;i<methods.length;i++)
		{
			System.out.println(methods[i].getName()+"\t"+methods[i].toGenericString());
		}
		
		
		
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
