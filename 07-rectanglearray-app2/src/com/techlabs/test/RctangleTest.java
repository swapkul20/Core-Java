package com.techlabs.test;

import com.techlabs.model.Rectangle;
import java.util.Scanner;

public class RctangleTest {

	public static void main(String[] args) {
		Rectangle r[]=new Rectangle[5];
		Scanner sc1=new Scanner(System.in);
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("Eter details of Rectangle "+(i+1));
		    System.out.println("Enter Width:");
		    double w=sc1.nextDouble();
		    System.out.println("Enter Height:");
		    double h=sc1.nextDouble();
		    r[i]=new Rectangle();
			r[i].setWidth(w);
		    r[i].setHeight(h);
		}
		
		Rectangle[] rectangles= {
			new Rectangle(10, 20),
			new Rectangle(30, 40) 
				
		};
		
		
		
		for(i=0;i<5;i++)
		{
			System.out.println("Rectangle: "+(i+1));
		    System.out.print("Width="+r[i].getWidth()+"\t Height="+r[i].getHeight());
		    System.out.println("");
		
		}
		
	}

}
