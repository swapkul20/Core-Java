package com.techlabs.numbergame;
import java.util.Scanner;


class numbergenerator {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int randomnumber=(int)(Math.random()*100);
		System.out.println("Number Generated:"+randomnumber);
			
			boolean won=Guesser.guess(randomnumber);
			while(won!=true)
			{
				System.out.println("Do you wish to continue?Y or N: ");
				char choice=sc1.next().charAt(0);
				 
				if(choice=='Y' || choice=='y')
				{
					
					won=Guesser.guess(randomnumber);
				}
				if(choice=='N' || choice=='n')
				{
					System.out.println("Exiting");
					System.exit(0);
				}
				
			}
		
		
		

	}

}
