package com.techlabs.decorator.carservice;

public class WheelAlign extends CarServiceDecorator{

	public WheelAlign(ICarService carObj) {
		super(carObj);
		// TODO Auto-generated constructor stub
	}
	
	public double getCost()
	{
		return super.getCost()+400;
	}

}
