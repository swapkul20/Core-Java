package com.techlabs.dip;

public class FileLogger implements ILogger {
	public void log(String err)
	{
		System.out.println("Logged to file:"+err);
	}

}
