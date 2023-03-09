package com.techlabs.decorator.hatdecor;

public class RibbonedHat extends HatDecorator {

	public RibbonedHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return hat.getName()+":"+"Ribboned";
	}

	@Override
	public String getDescirption() {
		// TODO Auto-generated method stub
		return hat.getDescirption()+":Ribboned";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return hat.getPrice()+100;
	}

}
