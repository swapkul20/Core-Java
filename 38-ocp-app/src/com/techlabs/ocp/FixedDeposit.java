package com.techlabs.ocp;

public class FixedDeposit {
	private int accnountNumber;
	private String name;
	private double principal;
	private int duration;
	private IFestivalInterest festival;
	public FixedDeposit(int accnountNumber, String name, double principal, int duration, IFestivalInterest festival) {
		super();
		this.accnountNumber = accnountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}
	public int getAccnountNumber() {
		return accnountNumber;
	}
	public void setAccnountNumber(int accnountNumber) {
		this.accnountNumber = accnountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public IFestivalInterest getFestival() {
		return festival;
	}
	public void setFestival(IFestivalInterest festival) {
		this.festival = festival;
	}
	
    public double calculateSimpleInterest()
    {
    	return (principal*festival.getInterestRate()*duration)/100;
    }
	@Override
	public String toString() {
		return "FixedDeposit [accnountNumber=" + accnountNumber + ", name=" + name + ", principal=" + principal
				+ ", duration=" + duration + "]";
	}
}
