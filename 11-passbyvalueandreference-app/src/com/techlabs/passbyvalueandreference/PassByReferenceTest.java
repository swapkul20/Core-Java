package com.techlabs.passbyvalueandreference;

public class PassByReferenceTest {

	public static void main(String[] args) {
		Number number1=new Number();
		number1.setA(10);
		number1.setB(20);
		System.out.println("Before Swappnig");
		System.out.println("a="+number1.getA()+"\tb="+number1.getB());
		swap(number1);
		System.out.println("After Swappnig");
		System.out.println("a="+number1.getA()+"\tb="+number1.getB());

	}
	static void swap(Number number1) // Pass by Reference
	{
		int temp;
		temp=number1.getA();
		number1.setA(number1.getB());
		number1.setB(temp);
	}

}
