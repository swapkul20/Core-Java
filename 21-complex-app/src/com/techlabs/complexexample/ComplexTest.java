package com.techlabs.complexexample;

public class ComplexTest {

	public static void main(String[] args) {
		Complex c1=new Complex(10.5,20.5);
		System.out.println("Complex Number1:");
		displayComplex(c1);
		Complex c2=new Complex(15.3,25.8);
		System.out.println("Complex Number2:");
		displayComplex(c2);
		Complex c3;
		c3=c1.addComplex(c2);
		System.out.println("Complex Addition:");
		displayComplex(c3);
		
		

	}
	static void displayComplex(Complex c)
	{
		System.out.println(c.getReal()+"+"+c.getImg()+"i");
	}

}
