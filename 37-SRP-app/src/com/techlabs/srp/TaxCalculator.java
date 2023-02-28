package com.techlabs.srp;

public class TaxCalculator {
	double tax;
	TaxCalculator()
	{
		tax=0;
	}
	public double calculateTax(Invoice invoice)
	{
		tax=invoice.getAmount()*30/100;
		return tax;
	}

}
