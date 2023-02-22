package com.techlabs.abstractaccount;

public abstract class Account {
	final private int accno;
	final private String name;
	private double balance;

	Account() {
//		accno=0;
//		name=null;
//		balance=0.0;
		this(0, null, 0.0);
		// System.out.println("Account Created:");

	}

	Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		System.out.println("Account Created:");

	}

	int getAccno() {
		return accno;
	}

	String getName() {
		return name;
	}

	void setBalance(double bal) {
		balance = bal;
	}

	double getBalance() {
		return balance;
	}

	void deposit(double amount) {
		if (amount < 0)
			System.out.println("Amount can not be negative");
		else
			balance = balance + amount;
	}

	abstract boolean withdraw(double amount);

}
