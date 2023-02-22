package com.techlabs.exceptionhandling;

public class InsufficientFundException extends RuntimeException {
	
	String message;
	public InsufficientFundException() {
		this("Insufficient Fund");
		
	}

	public InsufficientFundException(String message) {
		
		super(message);
	}
	public InsufficientFundException(Account account, double amount)
	{
		message="Transaction Declined for amount:"+amount+"\n"+"Account No:"+account.getAccno()+"\tName:"+account.getName()+"\tBalance:"+account.getBalance();
	}
	public String getMessage()
	{
		return message;
	}
	

}
