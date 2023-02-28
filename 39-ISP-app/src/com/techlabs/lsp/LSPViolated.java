package com.techlabs.lsp;

public class LSPViolated {

	public static void main(String[] args) {
		Labour labour=new Labour();
		labour.eat();
		labour.drink();
		labour.startWork();
		labour.stopWork();
		
		Robot robot=new Robot();
		robot.startWork();
		robot.stopWork();

	}

}
