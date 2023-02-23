package com.techlabs.lamdas;

public class FactorialTest {

	public static void main(String[] args) {
		IFactorial factObj=x->{int fact=1;
		                      for(int i=1;i<=x;i++)
		                    	  fact=fact*i;
		                      return fact;
		};
		
		display(factObj);
		

	}
	
	static void display(IFactorial factObj)
	{
		System.out.println("Factorial:"+factObj.factorial(5));
	}

}
