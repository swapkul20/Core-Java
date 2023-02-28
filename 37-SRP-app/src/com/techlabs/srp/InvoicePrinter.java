package com.techlabs.srp;

public class InvoicePrinter {


	void printInvoice(Invoice invoice, TaxCalculator tax)
	{
		System.out.println("ID:"+invoice.getId());
		System.out.println("Description:"+invoice.getDescription());
		System.out.println("Amount:"+invoice.getAmount());
		System.out.println("Tax:"+tax.calculateTax(invoice));
	}

}
