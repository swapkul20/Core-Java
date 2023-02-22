package com.techlabs.bookcricket;

public class Player2 implements Runnable{
	int score;
	int pagenumber;
	boolean exit;
	
	Player2()
	{   
		score=0;
		exit=false;
		
		System.out.println("Player2 started reading a book");
	}
	public void run()
	{
		while(!exit)
		{
		pagenumber=(int) Math.floor(Math.random() *(300 - 1 + 1) + 1);
		System.out.println("Player2 reading page number:"+pagenumber);
		score=score+(pagenumber%7);
		if(pagenumber%7==0)
		{
			
				  stop();
				
			
		}
		
		
		}
	}
    public void stop()
    {
    	exit=true;
    }

}
