package com.techlabs.observer;

public class WhatsappNotifier implements INotifier{
	public void notifyUser(Account account)
	{
		System.out.println("Whatsapp:"+account);
	}

}
