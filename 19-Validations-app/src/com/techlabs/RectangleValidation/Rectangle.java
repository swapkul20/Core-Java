package com.techlabs.RectangleValidation;

public class Rectangle {
	private int width;
	private int height;
	private String color;
	Rectangle(int w,int h,String c)
	{
		if(w>=1 && w<=100)
			width=w;
		if(w<1)
			width=1;
		if(w>100)
			width=100;
		if(h>=1 && h<=100)
			height=h;
		if(h<1)
			height=1;
		if(h>100)
			height=100;
		if(c.contentEquals("red") || c.contentEquals("black") || c.contentEquals("gray"))
			color=c;
		if(!c.contentEquals("red") && !c.contentEquals("black") && !c.contentEquals("gray"))
            color="red";
		
	}
	void setWidth(int w)
	{
		if(w>=1 && w<=100)
			width=w;
		if(w<1)
			width=1;
		if(w>100)
			width=100;
	}
	int getWidth()
	{
		return width;
	}
	void setHeight(int h)
	{
		if(h>=1 && h<=100)
			height=h;
		if(h<1)
			height=1;
		if(h>100)
			height=100;
	}
	int getHeight()
	{
		return height;
	}
	void setColor(String c)
	{
		if(c.contentEquals("red") || c.contentEquals("black") || c.contentEquals("gray"))
			color=c;
		if(!c.contentEquals("red") && !c.contentEquals("black") && !c.contentEquals("gray"))
            color="red";
	}
    String getColor()
	{
		return color;
	}

}
