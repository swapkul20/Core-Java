package com.techlabs.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class QueuePriorityQueue {

	public static void main(String[] args) {
		Queue<Integer> priorityqueue=new PriorityQueue<Integer>();
		for(int i=10;i<=100;i+=10)
		{
			priorityqueue.add(i);
		}
		
		System.out.println(priorityqueue);
		System.out.println(priorityqueue.element());
		System.out.println(priorityqueue);
		System.out.println(priorityqueue.poll());
		System.out.println(priorityqueue);
		priorityqueue.remove(50);
		System.out.println(priorityqueue);
		System.out.println(priorityqueue.poll());
		System.out.println(priorityqueue);
		System.out.println(priorityqueue.poll());
		System.out.println(priorityqueue);

	}

}
