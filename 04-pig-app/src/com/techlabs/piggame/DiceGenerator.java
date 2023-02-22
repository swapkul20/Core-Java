package com.techlabs.piggame;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGenerator {
	
	static int score=0;
	static int turn=1;
	static boolean flag=false;
	static boolean holdflag=false;
	static int holdscore=0;
	
	static void generateTurn()
	{
		
				
		while(score<20)
	    {
		    if(flag==false)
			    DiceGenerator.generateDice();
		    else
		    if(flag==true || score==0)
		    {
		    	turn++;
		    	flag=false;
		        DiceGenerator.generateDice();
		    }
		      
		 }				
		
		if(score>=20)
		{
			System.out.println("Your Score"+score);
			System.out.println("You finished in "+turn+" turns");
		
		}	
		
		
			
	}
	
	static void generateDice()
	{
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Turn:"+turn);
		
		System.out.println("Roll or Hold:r or h?");
		char choice=sc1.next().charAt(0);
		
		if(choice=='r')
		{
			int rand =(int) Math.floor(Math.random() *(6 - 1 + 1) + 1);
			System.out.println("Die:"+rand);
			if(rand==1)
			{
				score=0;
				System.out.println("Turn Over");
				 System.out.println("Your Score:"+score);
				 flag=true;
				 if(holdflag==true)
				 {
					 score=score+holdscore;
					 holdflag=false;
				 }
			}
			else
				score=score+rand;
			if(score>=20)
				flag=true;
		}
		if(choice=='h')
		{
		
			 System.out.println("Your Score:"+score);
			 holdflag=true;
			 flag=true;
			 holdscore=score;
		}
		
	
		
	}

}
