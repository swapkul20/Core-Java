package com.techlabs.collection;
import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		List<String> arraylist=new ArrayList<String>();
		arraylist.add("abc");
		arraylist.add("lmn");
		arraylist.add("xyz");
		System.out.println(arraylist);
		System.out.println("Array List Elements:");
		for(String str:arraylist)
		{
			System.out.println(str);
		}
		System.out.println("Array List Elements using Iterator:");
		Iterator<String> i=arraylist.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		arraylist.add("pqr");
		arraylist.add(2,"123");
		System.out.println(arraylist);
		System.out.println(arraylist.hashCode());
		
	}

}
