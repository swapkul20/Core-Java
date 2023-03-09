package com.techlabs.composite;

public class CompositionTest {
	public static void main(String args[])
	{
		IEmployee developer1=new Developer("Prashant","Senior Java Developer");
		IEmployee developer2=new Developer("Nilesh","Senior PHP Developer");
		EmployeeDirectory devDirectory=new EmployeeDirectory();
		devDirectory.addEmployee(developer1);
		devDirectory.addEmployee(developer2);
		
		IEmployee manager1=new Manager("Manoj","Senior Manager Marketing");
		IEmployee manager2=new Manager("Swapnil","Senior Manager HR");
		EmployeeDirectory manDirectory=new EmployeeDirectory();
		manDirectory.addEmployee(manager1);
		manDirectory.addEmployee(manager2);
		
		EmployeeDirectory companyDirectory=new EmployeeDirectory();
		companyDirectory.addEmployee(devDirectory);
		companyDirectory.addEmployee(manDirectory);
		
		companyDirectory.showEmployeeDetails();
	}

}
