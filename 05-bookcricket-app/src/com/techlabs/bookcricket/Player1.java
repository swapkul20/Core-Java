package com.techlabs.bookcricket;

public class Player1 implements Runnable{
	int score=0;
	int pagenumber;
	boolean exit=false;
	//Thread t1;
	Player1()
	{
		//t1=new Thread();
		//t1.start();
		System.out.println("Player1 started reading a book");
	}
	public void run()
	{
		while(!exit)
		{
		pagenumber=(int) Math.floor(Math.random() *(300 - 1 + 1) + 1);
		System.out.println("Player1 reading page number:"+pagenumber);
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
