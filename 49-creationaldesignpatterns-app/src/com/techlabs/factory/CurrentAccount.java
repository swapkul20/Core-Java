package com.techlabs.factory;

public class CurrentAccount extends Account{
	private String name;

	public CurrentAccount(int acc, String name) {
		super(acc);
		this.name = name;
	}

	@Override
	double getInterest() {
		// TODO Auto-generated method stub
		return 6.0;
	}

	@Override
	public String toString() {
		return "CurrentAccount [name=" + name + ", accno=" + accno + "]";
	}
	

}
