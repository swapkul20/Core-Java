package com.techlabs.srp;

public class InvoicePrinter implements Printer{
	void displayInvoice(Invoice invoice)
	{
		System.out.println(invoice.getInvoice());
		Tax tax=invoice.getTax();
		System.out.println(tax.getTax());
		
	}

}
