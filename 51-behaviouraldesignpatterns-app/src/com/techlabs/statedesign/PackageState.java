package com.techlabs.statedesign;

public interface PackageState {
	public void next(Package pack);
	public void previous(Package pack);
	public void printStatus(Package pack);

}
