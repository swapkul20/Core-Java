package com.techlabs.strategy.role;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp=new Employee(new Consultant());
		System.out.println(emp.getJobDescription());
		System.out.println(emp.getJobResponsibility());
		
		emp.promote(new SeniorConsultant());
		System.out.println(emp.getJobDescription());
		System.out.println(emp.getJobResponsibility());
		
	}

}
