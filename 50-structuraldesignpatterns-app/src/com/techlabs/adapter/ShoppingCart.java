package com.techlabs.adapter;

import java.util.List;

public class ShoppingCart {
	private List<IItems> cartitems;

	public ShoppingCart(List<IItems> cartitems) {
		super();
		this.cartitems = cartitems;
	}
   
	public void addItemToCart(List<IItems> items)
	{
		for(IItems item:items)
			cartitems.add(item);
	}
	
	public List<IItems> getItemCarts()
	{
		return cartitems;
	}
	
	public double getCartPrice()
	{
		double totalprice=0;
		for(IItems item:cartitems)
		{
			totalprice=totalprice+item.getItemPrice();
		}
		return totalprice;
	}

}
