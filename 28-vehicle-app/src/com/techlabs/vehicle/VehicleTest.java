package com.techlabs.vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		IMovable movables[]= {new Car("Tata Nexon"), new Bike("Bajaj Pulsar"), new Truck("Ashok Leyland")};
		startRacing(movables);
		
	}
	static void startRacing(IMovable movables[])
	{
		for(int i=0;i<movables.length;i++)
			movables[i].move();
	}

}
