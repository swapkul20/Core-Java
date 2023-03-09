package com.techlabs.dip.solution.test;

import com.techlabs.dip.solution.DBLoggerModified;
import com.techlabs.dip.solution.FileLogger;
import com.techlabs.dip.solution.TaxCalculator;

public class DIPImplemented {

	public static void main(String[] args) {
		TaxCalculator dbtax=new TaxCalculator(new DBLoggerModified());
		dbtax.calculateTax(250000,0);
		TaxCalculator filetax=new TaxCalculator(new FileLogger());
		filetax.calculateTax(1000,0);
	}

}
