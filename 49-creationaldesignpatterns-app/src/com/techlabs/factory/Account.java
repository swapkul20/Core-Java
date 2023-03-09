package com.techlabs.factory;

public abstract class Account {
	protected int accno;
	Account(int acc)
	{
		accno=acc;
	}
	abstract double getInterest();
}

