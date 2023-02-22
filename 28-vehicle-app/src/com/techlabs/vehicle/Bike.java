package com.techlabs.vehicle;

public class Bike extends Vehicle implements IMovable {

	public Bike(String name) {
		super(name);
		
	}
	public void move()
	{
		System.out.println(getName()+" is moving");
	}
	

}
