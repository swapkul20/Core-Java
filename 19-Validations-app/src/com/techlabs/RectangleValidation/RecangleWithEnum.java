package com.techlabs.RectangleValidation;


public class RecangleWithEnum {
	private int width;
	private int height;
	private ColorType color;
	RecangleWithEnum(int w,int h,ColorType c)
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
		color=c;
		
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
	void setColor(ColorType c)
	{
		color=c;
	}
    ColorType getColor()
	{
		return color;
	}

}
