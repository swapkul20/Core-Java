package com.techlabs.unitestingapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	Employee employee;
	@BeforeEach
	void init()
	{
		employee=new Employee(1,"AAA",10000);	
	}

	@Test
		void testGetBonus() {
		
		double expected=75.00;
		double actual=employee.getBonus();
		assertEquals(expected,actual,"Bonus=Salary x 75 /100");
	}
	
	

}
