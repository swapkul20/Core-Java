package com.techlabs.strategy.role;

public class SeniorConsultant implements IRole {

	@Override
	public String description() {
		return SeniorConsultant.class.getSimpleName();
	}

	@Override
	public String responsibility() {
		return "review code";
	}

}
