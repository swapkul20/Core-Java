package com.techlabs.streamapi;

public class Student {
	private int rno;
	private String name;
	private double percentage;
	public Student(int rno, String name, double percentage) {
		super();
		this.rno = rno;
		this.name = name;
		this.percentage = percentage;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	

}
