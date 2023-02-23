package com.techlabs.lamdas;

public class LamdaDemo1 {

	public static void main(String[] args) {
		fun(()->System.out.println("HI"));

	}
	static void fun(Test1 t)
	{
		t.display();
	}

}
