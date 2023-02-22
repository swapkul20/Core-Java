package com.techlabs.accessmodifiers.pck2;
import com.techlabs.accessmodifiers.pck1.Demo;
public class OutsidePackageNonDemo {
	OutsidePackageNonDemo()
	{
		Demo demo=new Demo();
		System.out.println("OutsidePackageNonDemo:Non Sub Class in different Package");
	   // System.out.println("n="+demo.n);
		//System.out.println("n_pri="+demo.n_pri);
		//System.out.println("n_pro="+demo.n_pro);
		System.out.println("n_pub="+demo.n_pub);
	}

}
