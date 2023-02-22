package com.techlabs.exceptionhandling;

public class ExceptionTest1 {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			double c = a / b;
			System.out.println("Division:" + c);
			System.out.println("Exiting");
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}

	}

}
