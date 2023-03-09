package com.techlabs.empfile;

import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private int managerid;
	private Date joiningdate;
	private double salary;
	private double commission;
	private int deptno;
	public Employee(int id, String name, String designation, int managerid, Date joiningdate, double salary,
			double commission, int deptno) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.managerid = managerid;
		this.joiningdate = joiningdate;
		this.salary = salary;
		this.commission = commission;
		this.deptno = deptno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getManagerid() {
		return managerid;
	}
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	public Date getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", managerid=" + managerid
				+ ", joiningdate=" + joiningdate + ", salary=" + salary + ", commission=" + commission + ", deptno="
				+ deptno + "]";
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
    
}
