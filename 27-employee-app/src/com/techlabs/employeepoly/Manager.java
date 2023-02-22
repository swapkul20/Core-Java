package com.techlabs.employeepoly;

public class Manager extends Employee{
	private double hra;
	private double da;
	private double ta;
	
	public Manager(int eno, String name, double basic) {
		super(eno,name,basic);
		calculateDetails();
		
	}
	private void calculateDetails()
	{
		hra=(getBasic()*50)/100;
		da=(getBasic()*40)/100;
		ta=(getBasic()*30)/100;
	}
	public double getHra()
	{
		return hra;
	}
	public double getDa()
	{
		return da;
	}
	public double getTa()
	{
		return ta;
	}
	
	public void calculateAnnualCtc()
	{
		ctc=getBasic()+hra+da+ta;
		
	}

	public String displayEmployee() {
		return "Manager:"+getEmployee()+"[hra=" + hra + ", da=" + da + ", ta=" + ta + "]";
	}
	public double getCtc()
	{
		return ctc;
	}

}
