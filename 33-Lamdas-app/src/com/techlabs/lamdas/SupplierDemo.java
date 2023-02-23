package com.techlabs.lamdas;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> supplier=()->"Hello Supplier";
		System.out.println(supplier.get());

	}

}
