package com.techlabs.abstractfactory;

public class CarFactoryDemo {

	public static void main(String[] args) {
		ICarFactory carfactory=new MarutiFactory();
		ICars car=carfactory.makecar();
		car.start();
		car.stop();

	}

}
