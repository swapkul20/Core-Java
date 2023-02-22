package com.techlabs.srp;

public class Invoice {
	private String id;
	private String description;
	private double amount;
	private Tax tax;
	private InvoicePrinter printer;
	
	Invoice(String id, String description, double amount, Tax tax, InvoicePrinter ip)
	{
		this.id=id;
		this.description=description;
		this.amount=amount;
		this.tax=tax;
		printer=ip;
		
	}
	void setId(String id)
	{
		this.id=id;
	}
	String getId()
	{
		return id;
	}
	void setDescription(String desc)
	{
		description=desc;
		
	}
	String getDescription()
	{
		return description;
	}
	void setAmount(double amount)
	{
		this.amount=amount;
	}
	double getAmount()
	{
		return amount;
	}
	Tax getTax()
	{
		return tax;
	}

	public String getInvoice() {
		return "Invoice [id=" + id + ", description=" + description + ", amount=" + amount + "]";
	}
	 
}
