package com.techlabs.model;

public class LineItem {
	int id;
	int quantity;
	Product product;
	public LineItem(int id, int quantity, Product product) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double calculateLineItemCost()
	{
		return quantity*product.calculateDiscountedPrice();
	}
	@Override
	public String toString() {
		return getProduct()+"\t\t"+quantity+"\t\t";
	}

}
