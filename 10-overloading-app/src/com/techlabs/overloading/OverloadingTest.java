package com.techlabs.overloading;

public class OverloadingTest {
	public static void main(String args[])
	{
		Shape shape1=new Shape();
		System.out.println("Area of Circle: "+shape1.area(5));
		System.out.println("Area of Triangle: "+shape1.area(10,20));
		System.out.println("Area of Rectangle: "+shape1.area(5.5,6.5));
		
		
	}

}
