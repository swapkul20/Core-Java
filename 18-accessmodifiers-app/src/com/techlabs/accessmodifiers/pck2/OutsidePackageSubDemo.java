package com.techlabs.accessmodifiers.pck2;

import com.techlabs.accessmodifiers.pck1.Demo;

public class OutsidePackageSubDemo extends Demo{
	OutsidePackageSubDemo()
	{
		System.out.println("OutsidePackageSubDemo:Sub Class in different Package ");
	   // System.out.println("n="+n);
		//System.out.println("n_pri="+n_pri);
		System.out.println("n_pro="+n_pro);
		System.out.println("n_pub="+n_pub);
	}
	
	

}
