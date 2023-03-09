package com.techlabs.newcommand;

import java.util.Scanner;

public class TelevisionTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
	
		do {
			System.out.println("****TV ON/OFF ******");
			System.out.println("Enter 1 to switch on ");
			System.out.println("Enter 2 to switch off ");
			System.out.println("Enter 3 to exit application ");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					new RemoteInvoker(new OnCommand()).perform();
					break;
				case 2:
					new RemoteInvoker(new OffCommand()).perform();
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println();
			}	
		}while(choice!=3);

	}

}
