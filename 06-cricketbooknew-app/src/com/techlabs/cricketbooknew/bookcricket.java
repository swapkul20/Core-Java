package com.techlabs.cricketbooknew;
import java.util.Scanner;
public class bookcricket {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
    	System.out.println("Enter name of player1:");
    	String name=sc1.next();
		Player p1=new Player();
		p1.setName(name);
		System.out.println("Enter name of player2:");
    	name=sc1.next();
		Player p2=new Player();
		p2.setName(name);
		p1.calculateScore();
		p2.calculateScore();
		if(p1.score<p2.score)
	    	System.out.println(p2.name+" is winner");
	    if(p2.score<p1.score)
	    	System.out.println(p1.name+" is winner");
	    if(p1.score==p2.score)
	    {
	    	if(p1.turn<p2.turn)
	    		System.out.println(p1.name+" is winner on the basis of turns");
	    	if(p2.turn<p1.turn)
	    		System.out.println(p2.name+" is winner on the basis of turns");
	    	if(p1.turn==p2.turn)
	    		System.out.println("Match tied");
	    }

	}

}
