package com.techlabs.observer;

public class InsufficientFundException extends RuntimeException {
	private String message;

	public InsufficientFundException(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage()
	{
		return message;
	}

}
