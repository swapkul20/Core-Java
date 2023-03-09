package com.techlabs.decorator.carservice;

public class CarServiceTest {

	public static void main(String[] args) {
		ICarService service=new CarInspection();
		OilChange oil=new OilChange(service);
		WheelAlign wheel=new WheelAlign(oil);
		System.out.println(wheel.getCost());
	
	}

}
