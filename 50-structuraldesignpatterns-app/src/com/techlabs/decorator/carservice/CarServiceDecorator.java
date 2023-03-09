package com.techlabs.decorator.carservice;

public abstract class CarServiceDecorator implements ICarService {
	private ICarService carObj;

	public CarServiceDecorator(ICarService carObj) {
		super();
		this.carObj = carObj;
	}
	public double getCost()
	{
		return carObj.getCost();
	}

}
