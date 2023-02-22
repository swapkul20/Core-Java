package com.techlabs.collection;
import java.util.*;


public class HashSetTest {

	public static void main(String[] args) {
		Set<String> hashset=new HashSet<String>();
		hashset.add("abc");
		hashset.add("lmn");
		hashset.add("xyz");
		System.out.println(hashset);
		System.out.println("HashSet Elements:");
		for(String str:hashset)
		{
			System.out.println(str);
		}
		System.out.println("Hash Set Elements using Iterator:");
		Iterator<String> i=hashset.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		hashset.add("pqr");
		hashset.remove("lmn");
		hashset.size();
		System.out.println(hashset);
		System.out.println(hashset.hashCode());
		Set<String> treeset=new TreeSet<String>(hashset);
		System.out.println(treeset);

	}

}
