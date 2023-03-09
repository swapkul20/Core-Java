package com.techlabs.facade;

public class HotelReception {
	
	public void getIndianMenu()
	{
		IHotel hotel=new IndianHotel();
		IMenu menu=hotel.getMenu();
		menu.displayMenu();
	}
	public void getItalianMenu()
	{
		IHotel hotel=new ItalianHotel();
		IMenu menu=hotel.getMenu();
		menu.displayMenu();
	}

}
