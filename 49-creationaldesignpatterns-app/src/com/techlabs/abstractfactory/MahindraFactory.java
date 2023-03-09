package com.techlabs.abstractfactory;

public class MahindraFactory implements ICarFactory{

	@Override
	public ICars makecar() {
		// TODO Auto-generated method stub
		return new Mahindra();
	}
	

}
