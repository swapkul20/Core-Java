package com.techlabs.model;

public class Product {
	private int id;
	private String name;
	private double price;
	private double discountpercent;
	public Product(int id, String name, double price, double discountpercent) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discountpercent = discountpercent;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountpercent() {
		return discountpercent;
	}
	public void setDiscountpercent(double discountpercent) {
		this.discountpercent = discountpercent;
	}
	public double calculateDiscountedPrice()
	{
		return price-(price*discountpercent)/100;
	}
	@Override
	public String toString() {
		return name + "\t\t"+price+"\t\t"+discountpercent;
	}
	

}
