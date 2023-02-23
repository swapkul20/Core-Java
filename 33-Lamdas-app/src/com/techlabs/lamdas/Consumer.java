package com.techlabs.lamdas;

@FunctionalInterface
public interface Consumer<T> {
	
	void accept(T t);
	

}
