package com.techlabs.passbyvalueandreference;

public class PassByValueTest {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before Swappnig");
		System.out.println("a="+a+"\tb="+b);
		swap(a,b);
			

	}
	static void swap(int a,int b)
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swappnig");
		System.out.println("a="+a+"\tb="+b);
		
	}

}
