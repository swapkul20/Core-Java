package com.techlabs.test;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		try (Scanner sc1 = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int n=sc1.nextInt();
			int flag=0;
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("Number is prime");
			else
				System.out.println("Number is not prime");
		}
		
		

	}

}
