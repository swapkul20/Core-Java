package com.techlabs.cricketbooknew;
public class Player {
	String name;	
    int score;   
    int turn;    
   
    void setName(String name1)
    {
    	name=name1;
    }
    String getName()
    {
    	return name;
    }
    void calculateScore()
    {
    	int pagenumber;    
    	int flag=0;
    	int i;
    
    	for(i=1;i<=12;i++)
    	{
    		pagenumber=(int) Math.floor(Math.random() *(300 - 1 + 1) + 1);
      		System.out.println(getName()+"  reading page number:"+pagenumber);
    		score=score+(pagenumber%7);
    		if(pagenumber%7==0)
    		{
    			turn=i;
    			flag=1;
    			break;
    		}
    		
    	  }
    	if(flag==1)
    	    System.out.println("Total Score of "+name+" is:"+score+" in turns:"+turn);
    	else
    		System.out.println("Total Score of "+name+" is:"+score+" in turns: "+(i-1));
    	
    	
    }

}
