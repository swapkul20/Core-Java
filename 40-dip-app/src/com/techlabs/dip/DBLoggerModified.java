package com.techlabs.dip;

public class DBLoggerModified implements ILogger{
	public void log(String err)
	{
		System.out.println("Logged to database:"+err);
	}

}
