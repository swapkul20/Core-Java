package com.techlabs.dip;

public class DIPViolation {

	public static void main(String[] args) {
		TaxCalculator tax=new TaxCalculator(new DBLogger());
		tax.calculateTax(250000,0);

	}

}
