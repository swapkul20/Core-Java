package com.techlabs.decorator.hatdecor;

public abstract class HatDecorator implements IHat {
	IHat hat;

	public HatDecorator(IHat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return hat.getName();
	}

	@Override
	public String getDescirption() {
		// TODO Auto-generated method stub
		return hat.getDescirption();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return hat.getPrice();
	}
	

}
