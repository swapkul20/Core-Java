package com.techlabs.test;

public class prime_commandline {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
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
