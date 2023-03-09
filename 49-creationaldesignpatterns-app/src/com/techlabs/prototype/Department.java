package com.techlabs.prototype;

public class Department implements Cloneable {
	private String departmentname;

	public Department(String departmentname) {
		super();
		this.departmentname = departmentname;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	@Override
	public String toString() {
		return "Department [departmentname=" + departmentname + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
