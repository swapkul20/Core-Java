package com.techlabs.adapter;

public class HatAdapter implements IItems {
	private Hat hat;

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	public Hat getHat() {
		return hat;
	}

	public void setHat(Hat hat) {
		this.hat = hat;
	}

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return hat.getShortname();
	}

	@Override
	public double getItemPrice() {
	
		return hat.getBasicprice()+(hat.getBasicprice()*hat.getTax()/100);
	}
	

}
