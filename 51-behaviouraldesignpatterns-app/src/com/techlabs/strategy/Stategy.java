package com.techlabs.strategy;

public class Stategy implements IOperation{
	IOperation operation;

	public Stategy(IOperation operation) {
		super();
		this.operation = operation;
	}
	public int doOperations(int a,int b)
	{
		return operation.doOperations(a, b);
	}

}
