package com.techlabs.observer;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accountnumber;
	private String name;
	private double balance;
	private List<INotifier> notifiers;
	public Account(int accountnumber, String name, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
		this.notifiers = new ArrayList<INotifier>();
		System.out.println("Your account has been created:");
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public List<INotifier> getNotifiers() {
		return notifiers;
	}
	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}
	public void deposit(double amount)
	{
		balance=balance+amount;
	    for(INotifier notifier:notifiers)
		{
			System.out.println("Your account has been credited with:"+amount);
			notifier.notifyUser(this);
		}
	}
    public void withdraw(double amount)
    {
    	if(balance-amount>=500)
    	{
    		balance=balance-amount;
    		for(INotifier notifier:notifiers)
    		{
    			System.out.println("Your account has been debited with:"+amount);
    			notifier.notifyUser(this);
    		}
    		
    	}
    	else
    	{
    	
    	    throw new InsufficientFundException("Insufficient Fund");
    	
    	}
    }
    public void registerNotifier(INotifier notifier)
    {
    	notifiers.add(notifier);
    	System.out.println("Notifier added");
    }
	@Override
	public String toString() {
		return "Account [accountnumber=" + accountnumber + ", balance=" + balance + "]";
	}
}
