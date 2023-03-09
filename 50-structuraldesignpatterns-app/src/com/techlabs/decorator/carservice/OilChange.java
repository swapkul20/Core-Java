package com.techlabs.decorator.carservice;

public class OilChange extends CarServiceDecorator {

	public OilChange(ICarService carObj) {
		super(carObj);
		// TODO Auto-generated constructor stub
	}
	public double getCost()
	{
		return super.getCost()+500;
	}
	

}
