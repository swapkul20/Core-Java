package com.techlabs.iteratordesign;

import java.util.List;

public class EmployeeRepository implements Container {
	private List<Employee> employees;

	public EmployeeRepository(List<Employee> employees) {
		super();
		this.employees = employees;
	}
	public Iterator getNameIterator()
	{
		return new NameIterator();
	}
	private class NameIterator implements Iterator
	{
        int index=0;
		@Override
		public boolean hasNext() {
			if(index<employees.size())
				return true;
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext())
			{
				return employees.get(index++).getName();
			}
			return null;
		}
		
	}
	public Iterator getSalaryIterator()
	{
		return new SalaryIterator();
	}
	private class SalaryIterator implements Iterator
	{
        int index=0;
		@Override
		public boolean hasNext() {
			if(index<employees.size())
				return true;
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext())
			{
				return employees.get(index++).getSalary();
			}
			return null;
		}
		
	}
	
	

}
