package com.techlabs.statedesign;

public class Ordered implements PackageState{
	

	@Override
	public void previous(Package pack) {
		System.out.println("Package at source");
		
	}

	@Override
	public void printStatus(Package pack) {
		System.out.println("Package Ordered");
		
	}

	@Override
	public void next(Package pack) {
		pack.setState(new Delivered());
		
	}
	

}
