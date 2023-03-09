package com.techlabs.builder;

public class Computer {
	private String hdd;
	private String ram;
	private String graphicscard;
	
	public String getHdd()
	{
		return hdd;
	}
	public String getRam()
	{
		return ram;
	}
	public String getGraphicsCard()
	{
		return graphicscard;
	}
	private Computer(ComputerBuilder builder)
	{
		this.hdd=builder.hdd;
		this.ram=builder.ram;
		this.graphicscard=builder.graphicscard;
	}
	
	public static class ComputerBuilder
	{
		private String hdd;
		private String ram;
		private String graphicscard;
		
		public ComputerBuilder(String hdd,String ram)
		{
			this.hdd=hdd;
			this.ram=ram;
		}
		public ComputerBuilder setGraphicsCard(String graphics)
		{
			this.graphicscard=graphics;
			return this;
		}
		public Computer build()
		{
			return new Computer(this);
		}
	}

	@Override
	public String toString() {
		return "Computer [hdd=" + hdd + ", ram=" + ram + ", graphicscard=" + graphicscard + "]";
	}
	

}
