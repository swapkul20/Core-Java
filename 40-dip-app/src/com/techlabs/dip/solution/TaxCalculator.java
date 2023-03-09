package com.techlabs.dip.solution;

public class TaxCalculator {
	ILogger logger;

	public TaxCalculator(ILogger logger) {
		super();
		this.logger = logger;
	}
	public void calculateTax(int amount,int rate)
	{
		int tax=0;
		try
		{
			tax=amount/rate;
			System.out.println("Tax:"+tax);
		}
		catch(Exception e)
		{
			logger.log("Divide by Zero");
		}
	}
	

}
