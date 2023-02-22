package com.techlabs.serialization;
import java.io.Serializable;
public class Student implements Serializable{
	private int rno;
	private String name;
	private double perc;
	Student(int rno,String name,double perc)
	{
		this.rno=rno;
		this.name=name;
		this.perc=perc;
	
	}
	int getRno()
	{
		return rno;
	}
	String getName()
	{
		return name;
	}
	double getPerc()
	{
		return perc;
	}
	

}
