
package com.techlabs.test;
import java.util.Scanner;


public class factorial {

	public static void main(String[] args) {
		try (Scanner sc1 = new Scanner(System.in)) {
			int fact=1;
			System.out.println("Enter a number");
			
			int n=sc1.nextInt();
			for(int i=1;i<=n;i++)
				fact=fact*i;
			System.out.println("Factorial="+fact);
		}
		
			
		

	}

}
