package com.techlabs.strategy;

public class StrategyTest {

	public static void main(String[] args) {
		IOperation addition=new AddOperations();
		IOperation operation=new Stategy(addition);
		System.out.println("Addition:"+operation.doOperations(15, 30));
		operation=new Stategy(new SubstractOperations());
		System.out.println("Substraction:"+operation.doOperations(30, 15));
		operation=new Stategy(new MultiplyOperations());
		System.out.println("Multiplication:"+operation.doOperations(30, 15));
		
	}

}
