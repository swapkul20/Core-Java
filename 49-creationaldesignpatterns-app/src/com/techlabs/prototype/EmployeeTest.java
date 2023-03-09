package com.techlabs.prototype;

public class EmployeeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee=new Employee(1,"Swapnil",new Department("Mentoring"));
		System.out.println(employee);
		Employee employee2=(Employee)employee.clone();
		System.out.println(employee2);
		
		
		Department department = employee2.getDepartment();
		department.setDepartmentname("HR");
		System.out.println(employee);
		System.out.println(employee2);

	}

}
