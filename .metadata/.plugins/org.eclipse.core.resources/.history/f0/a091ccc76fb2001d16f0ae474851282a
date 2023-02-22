package com.techlabs.collection;
import java.util.*;
public class HashMapTest {
	public static void main(String args[])
	{
		Map<Integer,String> hashmap=new HashMap<Integer,String>();
		for(int i=1;i<=5;i++)
			hashmap.put(i,"A"+(i));
		
		System.out.println(hashmap);
		System.out.println(hashmap.get(2));
		System.out.println(hashmap.getOrDefault(6,"A6"));
		
		Set<Integer> keys=hashmap.keySet();
		for(Integer i:keys)
			System.out.println(hashmap.get(i));
		
		hashmap.putIfAbsent(7,"A7");
		System.out.println(hashmap);
			
		
		Set<Map.Entry<Integer,String>> entrySet =hashmap.entrySet();		
		for(Map.Entry<Integer,String> entry:entrySet)
		{
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		
	}

}
