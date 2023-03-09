package com.techlabs.builder;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer=new Computer.ComputerBuilder("4TB", "8GB").build();
		System.out.println(computer);

	}

}
