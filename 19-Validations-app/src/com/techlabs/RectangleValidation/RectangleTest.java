package com.techlabs.RectangleValidation;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rect1=new Rectangle(5,97,"red");
		System.out.println("Rectangle1:");
		displayRectangle(rect1);
		Rectangle rect2=new Rectangle(-5,102,"gray");
		System.out.println("Rectangle2:");
		displayRectangle(rect2);
		Rectangle rect3=new Rectangle(75,99,"green");
		System.out.println("Rectangle3:");
		displayRectangle(rect3);
		

	}
	static void displayRectangle(Rectangle rect)
	{
		System.out.println("Width:"+rect.getWidth());
		System.out.println("Height:"+rect.getHeight());
		System.out.println("Color:"+rect.getColor());
	}

}
