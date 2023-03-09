package com.techlabs.strategy.role;

public class TechLead implements IRole {

	@Override
	public String description() {
		return TechLead.class.getSimpleName();
	}

	@Override
	public String responsibility() {
		return "assign work";
	}

}
