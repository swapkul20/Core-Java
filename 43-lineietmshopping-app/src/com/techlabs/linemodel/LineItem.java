package com.techlabs.linemodel;

public class LineItem {
	private int id;
	private String name;
	private int quantity;
	private double unitprice;
	public LineItem(int id, String name, int quantity, double unitprice) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitprice = unitprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
	public double calculateLineCost()
	{
		return quantity*unitprice;
	}

}
