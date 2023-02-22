package com.techlabs.model;

public class Rectangle {
	private double width;
	private double height;
	public Rectangle()
	{
		width=0;
		height=0;
	}
	public Rectangle(double w,double h)
	{
		this(w);
		width=w;
		height=h;
	}
	public Rectangle(double w)
	{
		this();
		width=w;
		height=0;
	}
    
   
    public double getWidth()
    {
    	return width;
    }
    public double getHeight()
    {
    	return height;
    }
}