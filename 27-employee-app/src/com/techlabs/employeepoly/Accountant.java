package com.techlabs.employeepoly;

public class Accountant extends Employee {
	private double perks;

	public Accountant(int eno, String name, double basic) {
		super(eno,name,basic);
		calculateDetails();
		
	}
	private void calculateDetails()
	{
		perks=(getBasic()*30)/100;
		
	}
	public double getPerks()
	{
		return perks;
	}
	public void calculateAnnualCtc()
	{
		ctc=getBasic()+perks;
		
	}

	public String displayEmployee() {
		return "Accountant:"+getEmployee()+"[perks=" + perks + "]";
	}
	

}
