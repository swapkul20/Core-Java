package com.techlabs.factory;

public class AccountFactory {
	
	private static Account account=null;
	private AccountFactory() {}
	public static Account getAccount(String type)
	{
		if(account==null)
		{
		if(type.equals("savings"))
			account=new SavingsAccount(101,type);
		if(type.equals("current:"))
			account=new CurrentAccount(201,"Swabhav Techlabs");
		}
		return account;
	}		
}
