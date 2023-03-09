package com.techlabs.statedesign;

public class Delivered implements PackageState{

	@Override
	public void next(Package pack) {
		pack.setState(new Received());
		
	}

	@Override
	public void previous(Package pack) {
		pack.setState(new Ordered());
		
	}

	@Override
	public void printStatus(Package pack) {
		System.out.println("Package Delivered");
		
	}
	

}
