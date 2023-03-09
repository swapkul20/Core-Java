package com.techlabs.strategy.role;

public class Consultant implements IRole {

	@Override
	public String description() {
		return Consultant.class.getSimpleName();
	}

	@Override
	public String responsibility() {
		return "write code";
	}

}
