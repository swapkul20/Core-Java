package com.techlabs.methodreference;
import java.util.function.*;
public class InstanceMethodReferenceTest {

	public static void main(String[] args) {
		InstanceMethodReference ref=new InstanceMethodReference();
		Test test=ref::print;
		test.display();
		calls(ref::print);
		call2(ref::addition);

	}
	static void calls(Test test)
	{
		test.display();
	}
	static void call2(BiFunction<Integer,Integer,Integer> test)
	{
		System.out.println(test.apply(10, 20));
	}
	

}
