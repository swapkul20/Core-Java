package com.techlabs.observer;

public class SMSNotifier implements INotifier {
	public void notifyUser(Account account)
	{
		System.out.println("SMS:"+account);
	}

}
