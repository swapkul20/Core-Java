package com.techlabs.employeepoly;

public abstract class Employee {
	private int eno;
	private String ename;
	private double basic;
	protected double ctc;
	public Employee()
	{
		this(0,null,0.0);
	}
	public Employee(int eno, String name,double basic)
	{
		this.eno=eno;
		this.ename=name;
		this.basic=basic;
				
	}
	public void setEno(int no)
	{
		eno=no;
	}
	public int getEno()
	{
		return eno;
	}
	public void setEname(String name)
	{
		ename=name;
	}
	public String getEname()
	{
		return ename;
	}
	public void setBasic(double b)
	{
		basic=b;
	}
    public double getBasic()
    {
    	return basic;
    }
    public double getCtc()
    {
    	return ctc;
    }
    public abstract void calculateAnnualCtc();
    public abstract String displayEmployee();

	public String getEmployee() {
		return "[eno=" + eno + ", ename=" + ename + ", basic=" + basic + ", ctc=" + ctc + "]";
	}
    
}
