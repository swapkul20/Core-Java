package com.techlabs.test;
import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		try (Scanner sc1 = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int n=sc1.nextInt();
			int rem,sum=0;
			int n1=n;
			while(n>0)
			{
				rem=n%10;
				sum=sum+(rem*rem*rem);
				n=n/10;
			    
			}
			if(n1==sum)
				System.out.println("Number is armstrong");
			else
				System.out.println("Number is not armstrong");
		}

	}

}
