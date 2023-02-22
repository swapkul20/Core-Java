package com.techlabs.staticexample;

public class StaticMethodTest {

	public static void main(String[] args) {
		StaticDemo demo1=new StaticDemo();
		StaticDemo.printA();
		demo1.printB();
		StaticDemo demo2=new StaticDemo();
		StaticDemo.printA();
		demo2.printB();
		StaticDemo demo3=new StaticDemo();
		StaticDemo.printA();
		demo3.printB();
		demo1.increment();
		StaticDemo.printA();
		demo1.printB();
		demo2.increment();
		StaticDemo.printA();
		demo2.printB();
		demo3.increment();
		StaticDemo.printA();
		demo3.printB();
		
	}

}
