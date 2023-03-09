package com.techlabs.observer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AccountObserverTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		INotifier smsNotifier=new SMSNotifier();
		INotifier emailNotifier=new EmailNotifier();
		INotifier whatsappNotifier=new WhatsappNotifier();
		
		String choice;
		Account account=new Account(101,"Swapil",1000);
		System.out.println("Do you want SMS notification?Y/N");
		choice=sc.next();
		if(choice.contentEquals("y"))
		  account.registerNotifier(smsNotifier);
		System.out.println("Do you want whatsapp notification?Y/N");
		choice=sc.next();
		if(choice.contentEquals("y"))
		  account.registerNotifier(whatsappNotifier);
		System.out.println("Do you want email notification?Y/N");
		choice=sc.next();
		if(choice.contentEquals("y"))
		  account.registerNotifier(emailNotifier);
		
		System.out.println("Enter amount to withdraw:");
		double amount=sc.nextDouble();
		try
		{
		      account.withdraw(amount);
		}
		catch(InsufficientFundException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
