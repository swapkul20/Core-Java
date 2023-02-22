package com.techlabs.employeepoly;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager manager=new Manager(101,"AAA",50000);
		Developer developer=new Developer(201,"BBB",40000);
		Accountant accountant=new Accountant(301,"CCC",30000);
		
		System.out.println("Manager Details:");
		display(manager);
		System.out.println("Developer Details:");
		display(developer);
		System.out.println("Accountant Details:");
		display(accountant);

	}
	
	static void display(Employee e)
	{
		e.calculateAnnualCtc();
		System.out.println(e.displayEmployee());
	}

}
