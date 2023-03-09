package com.techlabs.abstractfactory;

public class MarutiFactory implements ICarFactory{

	@Override
	public ICars makecar() {
		return new Maruti();
	}
	

}
