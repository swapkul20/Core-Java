package com.techlabs.lamdas;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<Integer> consumer=x->System.out.println("Printing:"+x);
		consumer.accept(10);

	}

}
