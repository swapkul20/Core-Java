package com.techlabs.abstractaccount;

public class CurrentAccount extends Account {
	CurrentAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}

	boolean withdraw(double amount) {
		if ((getBalance() - amount) >= -10000) {
			setBalance(getBalance() - amount);
			return true;
		}
		return false;

	}

}
