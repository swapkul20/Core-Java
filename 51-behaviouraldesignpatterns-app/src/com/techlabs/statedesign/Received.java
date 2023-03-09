package com.techlabs.statedesign;

public class Received implements PackageState{

	@Override
	public void next(Package pack) {
		System.out.println("Package Already Received by customer");
		
	}

	@Override
	public void previous(Package pack) {
		pack.setState(new Delivered());
		
	}

	@Override
	public void printStatus(Package pack) {
		System.out.println("Package Received");
		
	}
	

}
