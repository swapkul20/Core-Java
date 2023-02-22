package com.techlabs.bookcricket;

public class bookcricketgame {

	public static void main(String[] args) {
		Player1 p1=new Player1();
		Player2 p2=new Player2();
		Thread t1=new Thread(p1,"Player1");
		Thread t2=new Thread(p2,"Player2");
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
			
		}
		
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Player1 score:"+p1.score);
		System.out.println("Player2 score:"+p2.score);
		if(p1.score>p2.score)
			System.out.println("Player1 is winner");
		if(p2.score>p1.score)
			System.out.println("Player1 is winner");
		

	}

}
