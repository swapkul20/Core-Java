package com.techlabs.model;

import java.util.Date;
import java.util.List;

public class Order {
	private int id;
	Date date;
	List<LineItem> items;
	public Order(int id, Date date, List<LineItem> items) {
		super();
		this.id = id;
		this.date = date;
		this.items = items;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<LineItem> getItems() {
		return items;
	}
	public void setItems(List<LineItem> items) {
		this.items = items;
	}
    public double calculateOrderPrice()
    {
    	double total=0;
    	for(LineItem item:items)
    		total=total+item.calculateLineItemCost();
    	return total;
    }
	@Override
	public String toString() {
		return "Order: [ date="+ date + "]";
	}
    
}
