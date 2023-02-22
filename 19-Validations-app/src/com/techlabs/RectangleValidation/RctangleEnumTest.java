package com.techlabs.RectangleValidation;

public class RctangleEnumTest {
	public static void main(String[] args) {
		RecangleWithEnum rect1=new RecangleWithEnum(5,97,ColorType.red);
		System.out.println("Rectangle1:");
		displayRectangle(rect1);
		RecangleWithEnum rect2=new RecangleWithEnum(-5,102,ColorType.gray);
		System.out.println("Rectangle2:");
		displayRectangle(rect2);
		RecangleWithEnum rect3=new RecangleWithEnum(75,99,ColorType.black);
		System.out.println("Rectangle3:");
		displayRectangle(rect3);
		

	}
	static void displayRectangle(RecangleWithEnum rect)
	{
		System.out.println("Width:"+rect.getWidth());
		System.out.println("Height:"+rect.getHeight());
		System.out.println("Color:"+rect.getColor());
	}

}
