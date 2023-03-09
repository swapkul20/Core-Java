package com.techlabs.statedesign;

public class PackageStateTest {

	public static void main(String[] args) {
		Package pack=new Package();
		pack.printStatus();
		pack.nextState();
		pack.printStatus();
		pack.nextState();
		pack.printStatus();
		pack.nextState();

	}

}
