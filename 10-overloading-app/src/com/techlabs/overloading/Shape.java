package com.techlabs.overloading;

public class Shape {
	double area(double r)
	{
		return 3.14*r*r;
	}
	double area (double l,double b)
	{
		return l*b;
	}
	double area(int b,int h)
	{
		return 0.5*b*h;
	}

}
