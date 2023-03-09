package com.techlabs.decorator.hatdecor;

public class GoldenHat extends HatDecorator {

	public GoldenHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return hat.getName()+":Golden";
	}

	@Override
	public String getDescirption() {
		// TODO Auto-generated method stub
		return hat.getDescirption()+":"+"Golden";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return hat.getPrice()+50;
	}

}
