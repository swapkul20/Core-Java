package com.techlabs.factory;

public class SavingsAccount extends Account {
	String name;
	SavingsAccount(int accno,String name)
	{
		super(accno);
		this.name=name;
	}
	@Override
	double getInterest() {
		// TODO Auto-generated method stub
		return 7.5;
	}
	@Override
	public String toString() {
		return "SavingsAccount [name=" + name + ", accno=" + accno + "]";
	}

	

}
