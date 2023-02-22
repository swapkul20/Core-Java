package com.techlabs.vehicle;

public class Car extends Vehicle implements IMovable {

	public Car(String name) {
		super(name);
		
	}
	public void move()
	{
		System.out.println(getName()+" is moving");
	}
	
	

}
