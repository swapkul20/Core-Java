package com.techlabs.lsp;

public class Robot implements IWorker {
	public void eat()
	{
		System.out.println("Robot can not eat");
	}
	public void drink()
	{
		System.out.println("Robot can not drink");
	}
	public void startWork()
	{
		System.out.println("Robot is starting work");
	}
	public void stopWork()
	{
		System.out.println("Robot is stopping work");
	}

}
