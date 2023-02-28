package com.techlabs.lsp;

public class LabourModified implements IWorker,ILabourWorker {

	@Override
	public void startWork() {
		System.out.println("Labour is starting work");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Labour is stopping work");
		
	}

	@Override
	public void eat() {
		System.out.println("Labour is eating");
		
	}

	@Override
	public void drink() {
		System.out.println("Labour is drinking");
		
	}
	

}
