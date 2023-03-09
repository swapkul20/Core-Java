package com.techlabs.strategy;

public class AddOperations implements IOperation {

	@Override
	public int doOperations(int a, int b) {
		return a + b;
	}

}
