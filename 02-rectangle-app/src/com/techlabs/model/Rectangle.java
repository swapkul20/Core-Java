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
		width=w;
		height=h;
	}
    public void setWidth(double w)
    {
    	width=w;
    
    }
    public void setHeight(double h)
    {
    	height=h;
    
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