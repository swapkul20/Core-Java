package com.techlabs.collection;
import java.util.*;

public class QueueLinkedListTest {

	public static void main(String[] args) {
		Queue<Integer> linkedlist=new LinkedList<Integer>();
		for(int i=10;i<=100;i+=10)
		{
			linkedlist.add(i);
		}
		
		System.out.println(linkedlist);
		System.out.println(linkedlist.peek());
		System.out.println(linkedlist);
		System.out.println(linkedlist.poll());
		System.out.println(linkedlist);
		linkedlist.remove(50);
		System.out.println(linkedlist);
		
		
		

	}

}
