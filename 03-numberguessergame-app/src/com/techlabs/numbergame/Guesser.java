package com.techlabs.numbergame;

import java.util.Scanner;
import java.lang.Math;


public class Guesser {
	static int attempts=0;
	static boolean won=false;
	
	
	static boolean guess(int randomnumber) 
	{
		
		while(attempts<6)
		{
		Scanner sc1=new Scanner(System.in);
			System.out.println("Enter a number");
			int usernumber=sc1.nextInt();
		
			if(usernumber<randomnumber)
			{
				System.out.println("Sorry,Too Low ");
				attempts++;
			}
			if(usernumber>randomnumber)
			{
				System.out.println("Sorry, Too High");
				attempts++;
			}
			if(randomnumber==usernumber)
			{
				System.out.println("Yess, You Guessed it right!!");
				
				attempts++;
				System.out.println("Yo guessed after"+attempts+"attempts");
				won=true;
				System.exit(0);
								
			}
		
		}
		if(attempts>=6)
		{
			System.out.println("You are out of attempts");
			won=true;
		}
			
		return won;
	}

}
