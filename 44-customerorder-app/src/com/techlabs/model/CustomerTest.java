package com.techlabs.model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CustomerTest {

	public static void main(String[] args) {
	        Product pencil=new Product(1,"Pencil",10,1);
	        Product pen=new Product(2,"Pen",20,2);
	        Product book=new Product(3,"Book",500,10);
	        Product eraser=new Product(4,"Eraser",5,1);
	        
	        List<LineItem> listitems1=Arrays.asList(new LineItem(11,20,pencil),new LineItem(21,25,pen),new LineItem(31,10,book),new LineItem(41,20,eraser));
	        List<LineItem> listitems2=Arrays.asList(new LineItem(11,25,pencil),new LineItem(41,100,eraser));
	        List<LineItem> listitems3=Arrays.asList(new LineItem(11,200,pencil),new LineItem(21,100,pen),new LineItem(31,100,book),new LineItem(41,50,eraser));
	        
	        List<Order> orders=Arrays.asList(new Order(121,new Date(),listitems1),new Order(221,new Date(),listitems2), new Order(321,new Date(),listitems3));
            
	        Customer customer=new Customer(1001,"Abhay",orders);
	        displayBill(customer);
	}
	static void displayBill(Customer customer)
	{
		System.out.println("--------------------------------Final Bill-------------------------------");
		System.out.println("--------------------------ID:"+customer.getId()+"\t"+"Name:"+customer.getName()+"----------------------------");
		double totalcost=0;
		for(Order order:customer.getOrders())
		{
			double ordercost=0;
			//System.out.println("ORDER");
			System.out.println(order);
			System.out.println("---------------------------------Product------------------------------- Total Product Cost");
			System.out.println("Product\t\tPrice\t\tDiscount\tQuantity");
			for(LineItem item:order.getItems())
			{
				double lineitemcost=0;
				
				System.out.println(item+"\t"+String.format("%.2f",item.calculateLineItemCost()));
				lineitemcost=lineitemcost+item.calculateLineItemCost();
			}
			ordercost=ordercost+order.calculateOrderPrice();
			System.out.println("\t\t\t\t\t\t\t Total Order Cost:"+ordercost);
			totalcost=totalcost+ordercost;
		}
		
		System.out.println("\t\t\t\t\t\t\t\tTotal Bill:"+totalcost);
		
	}

}
