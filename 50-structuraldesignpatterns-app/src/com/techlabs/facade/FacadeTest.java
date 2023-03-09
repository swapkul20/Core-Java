package com.techlabs.facade;

import java.util.Scanner;

public class FacadeTest {

	private static HotelReception reception;

	public static void main(String[] args) {
		reception = new HotelReception();
		System.out.println("What do you want to eat:");
		System.out.println("For Indian - Press 1  ------- For Italian - Press 2");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1)
	        reception.getIndianMenu();
		
		if(choice==2)
			reception.getItalianMenu();
	}

}
