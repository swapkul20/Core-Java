package com.techlabs.lsp;

public class Labour implements IWorker {
	public void eat()
	{
		System.out.println("Labour is working");
	}
	public void drink()
	{
		System.out.println("Labour is drinking");
	}
	public void startWork()
	{
		System.out.println("Labour is starting work");
	}
	public void stopWork()
	{
		System.out.println("Labour is stopping work");
	}

}
