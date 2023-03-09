package com.techlabs.newcommand;

public class RemoteInvoker {
	private Command command;
	public RemoteInvoker(Command command) {
		super();
		this.command = command;
	}

	public void perform() {
		command.execute();
	}

}
