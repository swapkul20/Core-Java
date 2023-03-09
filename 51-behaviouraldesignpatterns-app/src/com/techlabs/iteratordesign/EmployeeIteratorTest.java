package com.techlabs.iteratordesign;

import java.util.Arrays;
import java.util.List;

public class EmployeeIteratorTest {

	public static void main(String[] args) {
		
		List<Employee> employees=Arrays.asList(new Employee("Harshal",15000), new Employee("Sagar",25000));
	    EmployeeRepository empRepo=new EmployeeRepository(employees);
	    Iterator i=empRepo.getNameIterator();
	    while(i.hasNext())
	    	System.out.println(i.next());
	    i=empRepo.getSalaryIterator();
	    while(i.hasNext())
	    	System.out.println(i.next());

	}

}
