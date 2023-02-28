package com.techlabs.srp;

public class SRPTest {

	public static void main(String[] args) {
		Invoice invoice=new Invoice("ABC10","LCDTV",15000);
		TaxCalculator tax=new TaxCalculator();
		InvoicePrinter printer=new InvoicePrinter();
		printer.printInvoice(invoice, tax);
		

	}

}
