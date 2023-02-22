package com.techlabs.wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		
		int b=20;
		Integer b1=b; //autoboxing
		System.out.println("b="+b1);
		int a=b1;  //unboxing
		System.out.println("a="+a);
		String c="20";
		int c1=Integer.parseInt(c);
		System.out.println("c="+c1);
		String d1=Integer.toString(20);
		System.out.println("d="+d1);
		int n=28;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toHexString(n));
		System.out.println(Integer.toOctalString(n));
		System.out.println(Integer.toUnsignedString(n));
		System.out.println(Integer.bitCount(n));
		System.out.println(Integer.highestOneBit(n));
		System.out.println(Integer.lowestOneBit(n));
		
		

	}

}
