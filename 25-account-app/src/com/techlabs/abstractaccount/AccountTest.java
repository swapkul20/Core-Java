package com.techlabs.abstractaccount;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int choice = 0;
		SavingsAccount saving;
		CurrentAccount current;
		while (choice != 3) {
			System.out.println("Select Account:1 or 2");
			System.out.println("1. Savings Account");
			System.out.println("2. Current Account");
			System.out.println("3. Exit");
			choice = sc1.nextInt();
			if (choice == 1) {
				saving = new SavingsAccount(101, "AAA", 500);
				performTransaction(saving);
			}
			if (choice == 2) {
				current = new CurrentAccount(201, "BBB", 700);
				performTransaction(current);
			}

		}

	}

	static void performTransaction(Account account) {
		Scanner sc1 = new Scanner(System.in);
		int choice = 0;
		double amount;
		while (choice != 4) {
			System.out.println("What do you want to do:");
			System.out.println("1. Show Balance:");
			System.out.println("2. Deposit Amount:");
			System.out.println("3. Withdraw Amount:");
			System.out.println("4. Exit:");
			System.out.println("Enter Your Choice:");
			choice = sc1.nextInt();
			switch (choice) {
			case 1:
				showAccount(account);
				break;
			case 2:
				System.out.println("Enter amount to deposit:");
				amount = sc1.nextDouble();
				account.deposit(amount);
				showAccount(account);
				break;
			case 3:
				System.out.println("Enter amount to withdraw:");
				amount = sc1.nextDouble();
				boolean flag = account.withdraw(amount);
				if (flag == false)
					System.out.println("Insufficient Fund");
				else
					showAccount(account);
			}
		}
	}

	static void showAccount(Account acount) {
		System.out.println("Account Number:" + acount.getAccno());
		System.out.println("Account Holder:" + acount.getName());
		System.out.println("Account Balance:" + acount.getBalance());

	}

}
