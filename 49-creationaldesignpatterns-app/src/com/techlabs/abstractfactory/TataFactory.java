package com.techlabs.abstractfactory;

public class TataFactory implements ICarFactory {

	@Override
	public ICars makecar() {
		// TODO Auto-generated method stub
		return new Tata();
	}

}
