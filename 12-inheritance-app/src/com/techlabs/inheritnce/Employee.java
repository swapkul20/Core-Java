package com.techlabs.inheritnce;

public class Employee extends Person {
	String id;
	double salary;
	Employee(String name,String address,String id,double salary)
	{
		super(name,address);
		this.id=id;
		this.salary=salary;
	}
	String getId()
	{
		return id;
	}
	double getSalary()
	{
		return salary;
	}

}
