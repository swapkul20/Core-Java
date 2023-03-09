package com.techlabs.adapter;

import java.util.Arrays;

public class AdapterTest {

	public static void main(String[] args) {
		Biscuit biscuit=new Biscuit("Parle",10.0);
		Biscuit britania=new Biscuit("Cadbury",20.0);
		HatAdapter hat=new HatAdapter(new Hat("Fly","Fly without fear",100,10));
		ShoppingCart cart=new ShoppingCart(Arrays.asList(biscuit,britania,hat));
		
		for(IItems item:cart.getItemCarts())
		{
			System.out.println(item.getItemName()+"\t\t"+item.getItemPrice());
		}
		System.out.println("Total\t------->"+cart.getCartPrice());
		

	}

}
