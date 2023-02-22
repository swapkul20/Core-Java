package com.techlabs.inheritnce;

public class Student extends Person {
	int rno;
	double perc;
	Student(String name,String address,int rno,double perc)
	{
		super(name,address);
		this.rno=rno;
		this.perc=perc;
	}
	int getRno()
	{
		return rno;
	}
	double getPerc()
	{
		return perc;
	}
}
