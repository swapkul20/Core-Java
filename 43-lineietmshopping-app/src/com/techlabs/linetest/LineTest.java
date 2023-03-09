package com.techlabs.linetest;

import java.util.ArrayList;

import com.techlabs.linemodel.LineItem;

public class LineTest {

	public static void main(String[] args) {
		ArrayList<LineItem> lineitems=new ArrayList<LineItem>();
		lineitems.add(new LineItem(1,"Pencil",10,7.5));
		lineitems.add(new LineItem(2,"Pen",10,20));
		lineitems.add(new LineItem(3,"Notebook",5,40));
		lineitems.add(new LineItem(4,"Book",5,100));
		double total=0;
		System.out.println("ID\tITEM NAME\tQuantity\tUNIT PRICE\tTotal");
		for(LineItem lineitem:lineitems)
		{
			String id=String.format("%d",lineitem.getId());
			String name=String.format("%15s",lineitem.getName());
			String quantity=String.format("%12d",lineitem.getQuantity());
			String unitprice=String.format("%17.2f",lineitem.getUnitprice());
			String linecost=String.format("%17.2f",lineitem.calculateLineCost());
			System.out.println(id+name+quantity+unitprice+linecost);
			total=total+lineitem.calculateLineCost();
		}
		
		System.out.println("\n\t\t\t\t\t\tTotal Cost:"+total);

	}
	
}
