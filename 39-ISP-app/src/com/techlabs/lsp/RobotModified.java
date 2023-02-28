package com.techlabs.lsp;

public class RobotModified implements IRobotWorker {

	@Override
	public void startWork() {
		System.out.println("Robot is starting work");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Robot is stopping work");
		
	}

}
