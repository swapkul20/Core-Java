package com.techlabs.lamdas;

public class PredicateDemo {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		Predicate<Integer> predicate=(x,y) -> x>y;
		Consumer<Integer> consumer=x->System.out.println(x+"is greater");
		if(predicate.test(a,b))
			consumer.accept(a);
		else
			consumer.accept(b);
		

	}

}
