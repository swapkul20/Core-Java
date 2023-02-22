package com.techlabs.manboy;

public class ManBoyTest {

	public static void main(String[] args) {
		c1();
		c2();
		c3();
		c4();
		c5();

	}
	
	static void c1()
	{
		Man man=new Man();
		man.read();
		man.play();
	}
	static void c2()
	{
		Boy boy=new Boy();
		boy.read();
		boy.play();
		boy.eat();
	}
	static void c3() // a superclass variable can refer to subclass object
	{
		Man man;
		man=new Boy();
		man.play();
		man.read();
	}
	static void c4()
	{
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}
	static void atThePark(Man x) // Runtime polymorphism
	{
	    System.out.println("At the park:");
	    x.play();
	}
	static void c5()  // runtime polymorphism
	{
		Object x;
		x=100;
		System.out.println(x.getClass());
		x="Hello";
		System.out.println(x.getClass());
		x=10<5;
		System.out.println(x.getClass());
		
	}

}
