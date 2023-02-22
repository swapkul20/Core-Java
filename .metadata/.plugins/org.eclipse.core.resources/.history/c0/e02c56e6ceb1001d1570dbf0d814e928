package com.techlabs.accountinfo;

public class Account {
	final private int accno;
	final private String name;
	private double balance;
	static int count;
	Account()
	{
		accno=0;
		name=null;
		balance=0.0;
		count++;
		System.out.println("Accounts Created:"+count);
	}
	Account(int accno,String name,double balance)
	{
		this.accno=accno;
		this.name=name;
		this.balance=balance;
		count++;
		System.out.println("Accounts Created:"+count);
	}
	int getAccno()
	{
		return accno;
	}
	String getName()
	{
		return name;
	}
	
	void setBalance(double bal)
	{
		balance=bal;
	}
	double getBalance()
	{
		return balance;
	}
	void deposit(double amount)
	{
		if(amount<0)
			System.out.println("Amount can not be negative");
		else
		    balance=balance+amount;
	}
	void withdraw(double amount)
	{
		if((balance-amount)<500)
			System.out.println("insufficient Balance");
		else
			balance=balance-amount;
	}
}
