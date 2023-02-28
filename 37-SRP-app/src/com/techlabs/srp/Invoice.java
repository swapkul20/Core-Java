package com.techlabs.srp;

public class Invoice {
	private String id;
	private String description;
	private double amount;
		
	public Invoice(String id, String description, double amount) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
