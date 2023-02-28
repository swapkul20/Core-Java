package com.techlabs.ocp;

public class FixedDepositViolated {

	public static void main(String[] args) {
		FixedDeposit diwalifix=new FixedDeposit(101,"Swapnil",50000,4,FestivalType.DIWALI);
		System.out.println("Simple Interest:"+diwalifix.calculateSimpleInterest());
		FixedDeposit newyearfix=new FixedDeposit(201,"Manoj",150000,3,FestivalType.NEWYEAR);
		System.out.println("Simple Interest:"+newyearfix.calculateSimpleInterest());
		FixedDeposit holifix=new FixedDeposit(301,"Prashant",100000,5,FestivalType.HOLI);
		System.out.println("Simple Interest:"+holifix.calculateSimpleInterest());
		FixedDeposit otherfix=new FixedDeposit(401,"Nilesh",250000,2,FestivalType.OTHERS);
		System.out.println("Simple Interest:"+otherfix.calculateSimpleInterest());
		
		
		

	}


