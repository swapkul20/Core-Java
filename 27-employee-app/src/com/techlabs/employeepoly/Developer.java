package com.techlabs.employeepoly;

public class Developer extends Employee {
	private double fa;
	private double ot;
	

	public Developer(int eno, String name, double basic) {
		super(eno,name,basic);
		calculateDetails();
	
	}
	private void calculateDetails()
	{
		fa=(getBasic()*40)/100;
		ot=(getBasic()*30)/100;
		
	}
	public double getFa()
	{
		return fa;
	}
	public double getOt()
	{
		return ot;
	}
	public void calculateAnnualCtc()
	{
		ctc=getBasic()+fa+ot;
		
	}
	
	public String displayEmployee() {
		return "Developer:"+getEmployee()+"[fa=" + fa + ", ot=" + ot + "]";
	}
	

}
