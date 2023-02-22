package com.techlabs.vehicle;

public class Truck extends Vehicle implements IMovable {

	public Truck() {
		this(null);
	}

	public Truck(String name) {
		super(name);
		
	}
	public void move()
	{
		System.out.println(getName()+" is moving");
	}

}
