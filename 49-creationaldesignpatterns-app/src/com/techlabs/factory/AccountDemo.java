package com.techlabs.factory;

public class AccountDemo {

	public static void main(String[] args) {
		Account account=AccountFactory.getAccount(args[0]);
		System.out.println(account+"Interest Rate"+account.getInterest());

	}

}
