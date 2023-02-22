package com.techlabs.srp;

public class Tax implements Taxation {
	double tax;
	
	void calculateTax(Invoice invoice)
	{
		tax=invoice.getAmount()*10/100;
		
	}
	public String getTax()
	{
		return "Tax:"+tax;
	}
	

}
