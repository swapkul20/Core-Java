package com.techlabs.lsp;

public class ISPTest {

	public static void main(String[] args) {
		LabourModified labor=new LabourModified();
		RobotModified robot=new RobotModified();
		labor.drink();
		labor.eat();
		labor.startWork();
		labor.stopWork();
		robot.startWork();
		robot.stopWork();

	}

}
