package com.techlabs.strategy.role;

public class Employee {
	IRole role;
	
	public Employee(IRole role) {
		this.role = role;
	}

	public void promote(IRole role) {
		this.role=role;
	}
	
	public String getJobDescription() {
		return "Job Role :"+role.description();
	}
	
	public String getJobResponsibility() {
		return "Responsibilty :"+role.responsibility();
	}
	
}
