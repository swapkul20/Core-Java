package com.techlabs.abstractaccount;

public class SavingsAccount extends Account {
	SavingsAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}

	boolean withdraw(double amount) {
		if ((getBalance() - amount) < 500)
			return false;
		else {
			setBalance(getBalance() - amount);
			return true;
		}
	}

}
