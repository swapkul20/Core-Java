package com.techlabs.ocp;

public class FixedDepositOCP {

	public static void main(String[] args) {
		FixedDeposit diwalifix=new FixedDeposit(101,"Swapnil",50000,4, new FixedDepositDiwali());
		System.out.println(diwalifix+"Simple Interest:"+diwalifix.calculateSimpleInterest());
		FixedDeposit newyearfix=new FixedDeposit(201,"Manoj",150000,3, new FixedDepositNewYear());
		System.out.println(newyearfix+"Simple Interest:"+newyearfix.calculateSimpleInterest());
		FixedDeposit holifix=new FixedDeposit(301,"Prashant",100000,5, new FixedDepositHoli());
		System.out.println(holifix+"Simple Interest:"+holifix.calculateSimpleInterest());
		FixedDeposit otherfix=new FixedDeposit(401,"Nilesh",550000,2, new FixedDepositOthers());
		System.out.println(otherfix+"Simple Interest:"+otherfix.calculateSimpleInterest());
		
		
		

	}

}
