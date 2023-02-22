package com.techlabs.exceptionhandling;

public class Account {
	final private int accno;
	final private String name;
	private double balance;
	
	Account()
	{
		this(0,null,0);
		
	}
	Account(int accno,String name,double balance)
	{
		this.accno=accno;
		this.name=name;
		this.balance=balance;
		
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
	boolean withdraw(double amount)
	{
		try
		{
			if((balance-amount)<500)
			     throw new InsufficientFundException(this,amount);
			balance=balance-amount;
			return true;
		}
		catch(InsufficientFundException e)
		{
			System.out.println("Exception:"+e.getMessage());
			return false;
		}
	}
}
