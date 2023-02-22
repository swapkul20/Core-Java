package com.techlabs.accessmodifiers.pck1;

public class OutsiderDemo {
	OutsiderDemo()
	{
		Demo demo=new Demo();
		System.out.println("OutsiderDemo:Non Sub Class in Same Package");
	    System.out.println("n="+demo.n);
		//System.out.println("n_pri="+demo.n_pri);
		System.out.println("n_pro="+demo.n_pro);
		System.out.println("n_pub="+demo.n_pub);
	}

}
