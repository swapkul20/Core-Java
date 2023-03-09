package com.techlabs.observer;

public class EmailNotifier implements INotifier{

	public void notifyUser(Account account)
	{
		System.out.println("Email:"+account);
	}
}
