package com.techlabs.composite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory implements IEmployee  {
	List<IEmployee> employees;

	public EmployeeDirectory() {
		employees=new ArrayList<IEmployee>();
	}
	public EmployeeDirectory(List<IEmployee> employees) {
		super();
		this.employees = employees;
	}
    public void addEmployee(IEmployee employee)
    {
    	employees.add(employee);
    }
    public void removeEmployee(IEmployee employee)
    {
    	employees.remove(employee);
    }
	@Override
	public void showEmployeeDetails() {
		for(IEmployee employee:employees)
			employee.showEmployeeDetails();
		
	}
}
