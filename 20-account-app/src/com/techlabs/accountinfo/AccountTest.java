package com.techlabs.accountinfo;
import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Account account1=new Account(450,"AAA",1000);
		showAccount(account1);
		int choice=0;
		double amount;
		while(choice!=4)
		{
			System.out.println("What do you want to do:");
			System.out.println("1. Show Balance:");
			System.out.println("2. Deposit Amount:");
			System.out.println("3. Withdraw Amount:");
			System.out.println("4. Exit:");
			System.out.println("Enter Your Choice:");
			choice=sc1.nextInt();
			switch(choice)
			{
			case 1: showAccount(account1);
			        break;
			case 2: System.out.println("Enter amount to deposit:");
			        amount=sc1.nextDouble();
			        account1.deposit(amount);
			        showAccount(account1); 
			        break;
			case 3: System.out.println("Enter amount to withdraw:");
					amount=sc1.nextDouble();
					account1.withdraw(amount);
					showAccount(account1);
			}
		}
		
		

	}
	static void showAccount(Account acount)
	{
		System.out.println("Account Number:"+acount.getAccno());
		System.out.println("Account Holder:"+acount.getName());
		System.out.println("Account Balance:"+acount.getBalance());
		
	}

}
