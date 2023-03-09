package com.techlabs.composite;

public class Manager implements IEmployee {
	private String name;
	private String position;
	public Manager(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}
	@Override
	public String toString() {
		return "Manager [name=" + name + ", position=" + position + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public void showEmployeeDetails() {
		System.out.println(name+"\t"+position);
	
		
	}

}
