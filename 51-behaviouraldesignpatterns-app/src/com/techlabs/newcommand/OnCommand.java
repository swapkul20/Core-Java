package com.techlabs.newcommand;

public class OnCommand implements Command {
	private Television tv;

	public OnCommand() {
		this.tv = Television.getTelevisionInstance();
	}

	@Override
	public void execute() {
		if(tv.on()) {
			System.out.println("Television turned on.");
		}
		else {
			System.out.println("Televsision already turned on");
		}
	}

}
