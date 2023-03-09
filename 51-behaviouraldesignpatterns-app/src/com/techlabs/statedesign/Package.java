package com.techlabs.statedesign;

public class Package {
	private PackageState state=new Ordered();
	
	public PackageState getState() {
		return state;
	}

	public void setState(PackageState state) {
		this.state = state;
	}

	public void nextState()
	{
		state.next(this);
	}
	
	public void prevState()
	{
		state.previous(this);
	}
	
	public void printStatus()
	{
		state.printStatus(this);
	}

}
